
package com.example.memoryleaksample

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class LeakingFragment11 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        GlobalLeakingObject.leakedFragmentView1 = view

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment11)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment11")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment11")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}
class LeakingFragment12 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        GlobalLeakingObject.leakedFragmentView2 = view

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment12)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment12")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment12")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}
class LeakingFragment13 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        GlobalLeakingObject.leakedFragmentView3 = view

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment13)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment13")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment13")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}
class LeakingFragment14 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        GlobalLeakingObject.leakedFragmentView4 = view

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment14)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment14")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment14")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}
class LeakingFragment15 : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Fragment view leak
        GlobalLeakingObject.leakedFragmentView5 = view

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.beginTransaction()
                .remove(this@LeakingFragment15)
                .commit()
        }, 5000)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LeakSample", "Entering LeakingFragment15")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LeakSample", "Exiting LeakingFragment15")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Just return a basic View for testing
        return View(requireContext())
    }
}