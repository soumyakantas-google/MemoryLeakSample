package com.example.memoryleaksample

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LeakingViewModel1 : ViewModel() {
    fun createLeak() {
        Log.e("LeakSample", "Inside LeakingViewModel1")
        GlobalLeakingObject.leakedViewModel1 = this
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("LeakSample", "Exiting LeakingViewModel1")
    }
}
class LeakingViewModel2 : ViewModel() {
    fun createLeak() {
        Log.e("LeakSample", "Inside LeakingViewModel2")
        GlobalLeakingObject.leakedViewModel2 = this
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("LeakSample", "Exiting LeakingViewModel2")
    }
}
class LeakingViewModel3 : ViewModel() {
    fun createLeak() {
        Log.e("LeakSample", "Inside LeakingViewModel3")
        GlobalLeakingObject.leakedViewModel3 = this
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("LeakSample", "Exiting LeakingViewModel3")
    }
}
class LeakingViewModel4 : ViewModel() {
    fun createLeak() {
        Log.e("LeakSample", "Inside LeakingViewModel4")
        GlobalLeakingObject.leakedViewModel4 = this
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("LeakSample", "Exiting LeakingViewModel4")
    }
}
class LeakingViewModel5 : ViewModel() {
    fun createLeak() {
        Log.e("LeakSample", "Inside LeakingViewModel5")
        GlobalLeakingObject.leakedViewModel5 = this
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("LeakSample", "Exiting LeakingViewModel5")
    }
}
