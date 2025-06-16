
package com.example.memoryleaksample

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class LeakingFragment1 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        //GlobalLeakingObject.leakedFragmentView1 = view
        // Fragment leak
        GlobalLeakingObject.leakedFragment1 = this

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment1)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment1")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}
class LeakingFragment2 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        //GlobalLeakingObject.leakedFragmentView2 = view
        // Fragment leak
        GlobalLeakingObject.leakedFragment2 = this

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment2)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment2")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}
class LeakingFragment3 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        //GlobalLeakingObject.leakedFragmentView3 = view
        // Fragment leak
        GlobalLeakingObject.leakedFragment3 = this

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment3)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment3")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment3")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}
class LeakingFragment4 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        //GlobalLeakingObject.leakedFragmentView4 = view
        // Fragment leak
        GlobalLeakingObject.leakedFragment4 = this

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment4)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment4")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment4")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}
class LeakingFragment5 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        //GlobalLeakingObject.leakedFragmentView5 = view
        // Fragment leak
        GlobalLeakingObject.leakedFragment5 = this

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment5)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment5")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment5")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}