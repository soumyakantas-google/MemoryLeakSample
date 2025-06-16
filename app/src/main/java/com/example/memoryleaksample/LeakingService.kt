
package com.example.memoryleaksample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.os.Handler
import android.os.Looper

class LeakingService1 : Service() {
    
    override fun onCreate() {
        super.onCreate()
        Log.e("LeakSample", "Entering LeakingService1")

        GlobalLeakingObject.leakedService1 = this

        Handler(Looper.getMainLooper()).postDelayed({
            stopSelf()
        }, 5000)
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingService1")
    }
}

class LeakingService2 : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.e("LeakSample", "Entering LeakingService2")

        GlobalLeakingObject.leakedService2 = this

        Handler(Looper.getMainLooper()).postDelayed({
            stopSelf()
        }, 5000)
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingService2")
    }
}

class LeakingService3 : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.e("LeakSample", "Entering LeakingService3")

        GlobalLeakingObject.leakedService3 = this

        Handler(Looper.getMainLooper()).postDelayed({
            stopSelf()
        }, 5000)
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingService3")
    }
}

class LeakingService4 : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.e("LeakSample", "Entering LeakingService4")

        GlobalLeakingObject.leakedService4 = this

        Handler(Looper.getMainLooper()).postDelayed({
            stopSelf()
        }, 5000)
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingService4")
    }
}

class LeakingService5 : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.e("LeakSample", "Entering LeakingService5")

        GlobalLeakingObject.leakedService5 = this

        Handler(Looper.getMainLooper()).postDelayed({
            stopSelf()
        }, 5000)
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingService5")
    }
}
