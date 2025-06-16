package com.example.memoryleaksample

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class LeakingViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample","Entering LeakingViewModelActivity")

        val viewModel1 = ViewModelProvider(this)[LeakingViewModel1::class.java]
        viewModel1.createLeak()
        val viewModel2 = ViewModelProvider(this)[LeakingViewModel2::class.java]
        viewModel2.createLeak()
        val viewModel3 = ViewModelProvider(this)[LeakingViewModel3::class.java]
        viewModel3.createLeak()
        val viewModel4 = ViewModelProvider(this)[LeakingViewModel4::class.java]
        viewModel4.createLeak()
        val viewModel5 = ViewModelProvider(this)[LeakingViewModel5::class.java]
        viewModel5.createLeak()


        // Finish activity after delay to allow LeakCanary to track
        Handler(Looper.getMainLooper()).postDelayed({
            finish()
        }, 5000)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingViewModelActivity")
    }
}