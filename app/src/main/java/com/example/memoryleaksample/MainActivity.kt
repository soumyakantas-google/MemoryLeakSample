package com.example.memoryleaksample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("LeakSample", "Entering main Activity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button: Activity leak
        findViewById<Button>(R.id.button_leak_activity).setOnClickListener {
            startActivity(Intent(this, LeakingActivity1::class.java))
            startActivity(Intent(this, LeakingActivity2::class.java))
            startActivity(Intent(this, LeakingActivity3::class.java))
            startActivity(Intent(this, LeakingActivity4::class.java))
            startActivity(Intent(this, LeakingActivity5::class.java))
        }

        // Button: Fragment leak
        findViewById<Button>(R.id.button_leak_fragment).setOnClickListener {

            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment1()).commit()
            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment2()).commit()
            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment3()).commit()
            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment4()).commit()
            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment5()).commit()
        }
        // Button: Fragment view leak
        findViewById<Button>(R.id.button_leak_fragment_view).setOnClickListener {

            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment11()).commit()
            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment12()).commit()
            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment13()).commit()
            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment14()).commit()
            supportFragmentManager.beginTransaction().add(android.R.id.content, LeakingFragment15()).commit()
        }

        // Button: ViewModel leak
        findViewById<Button>(R.id.button_leak_viewmodel).setOnClickListener {
            startActivity(Intent(this, LeakingViewModelActivity::class.java))
        }

        // Button: Service leak
        findViewById<Button>(R.id.button_leak_service).setOnClickListener {
            startService(Intent(this, LeakingService1::class.java))
            startService(Intent(this, LeakingService2::class.java))
            startService(Intent(this, LeakingService3::class.java))
            startService(Intent(this, LeakingService4::class.java))
            startService(Intent(this, LeakingService5::class.java))
        }

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting main Activity")
    }
}
