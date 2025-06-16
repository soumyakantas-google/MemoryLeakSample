
package com.example.memoryleaksample

object GlobalLeakingObject {
    var leakedActivity1: LeakingActivity1? = null
    var leakedActivity2: LeakingActivity2? = null
    var leakedActivity3: LeakingActivity3? = null
    var leakedActivity4: LeakingActivity4? = null
    var leakedActivity5: LeakingActivity5? = null

    var leakedFragment1: LeakingFragment1? = null
    var leakedFragment2: LeakingFragment2? = null
    var leakedFragment3: LeakingFragment3? = null
    var leakedFragment4: LeakingFragment4? = null
    var leakedFragment5: LeakingFragment5? = null

    var leakedFragmentView1: android.view.View? = null
    var leakedFragmentView2: android.view.View? = null
    var leakedFragmentView3: android.view.View? = null
    var leakedFragmentView4: android.view.View? = null
    var leakedFragmentView5: android.view.View? = null

    var leakedViewModel1: LeakingViewModel1? = null
    var leakedViewModel2: LeakingViewModel2? = null
    var leakedViewModel3: LeakingViewModel3? = null
    var leakedViewModel4: LeakingViewModel4? = null
    var leakedViewModel5: LeakingViewModel5? = null
    var leakedService1: LeakingService1? = null
    var leakedService2: LeakingService2? = null
    var leakedService3: LeakingService3? = null
    var leakedService4: LeakingService4? = null
    var leakedService5: LeakingService5? = null
}
