package com.example.memoryleaksample

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class LeakingActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample","Entering LeakingActivity1")
        GlobalLeakingObject.leakedActivity1 = this

        // Finish activity after delay to allow LeakCanary to track
        Handler(Looper.getMainLooper()).postDelayed({
            finish()
        }, 5000)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingActivity1")
    }
}
class LeakingActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample","Entering LeakingActivity2")
        GlobalLeakingObject.leakedActivity2 = this

        // Finish activity after delay to allow LeakCanary to track
        Handler(Looper.getMainLooper()).postDelayed({
            finish()
        }, 5000)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingActivity2")
    }
}

class LeakingActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample","Entering LeakingActivity3")
        GlobalLeakingObject.leakedActivity3 = this

        // Finish activity after delay to allow LeakCanary to track
        Handler(Looper.getMainLooper()).postDelayed({
            finish()
        }, 5000)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingActivity3")
    }
}

class LeakingActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample","Entering LeakingActivity4")
        GlobalLeakingObject.leakedActivity4 = this

        // Finish activity after delay to allow LeakCanary to track
        Handler(Looper.getMainLooper()).postDelayed({
            finish()
        }, 5000)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingActivity4")
    }
}

class LeakingActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample","Entering LeakingActivity5")
        GlobalLeakingObject.leakedActivity5 = this

        // Finish activity after delay to allow LeakCanary to track
        Handler(Looper.getMainLooper()).postDelayed({
            finish()
        }, 5000)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingActivity5")
    }
}




