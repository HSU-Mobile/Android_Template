package com.hsu.mobile.lifecycle_example

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Test3Fragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TestFragment.TAG, "fragment test3 onAttach")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        Log.d(TAG, "fragment test3 onCreateView")
        return inflater.inflate(R.layout.fragment_test2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "fragment test3 onViewCreated: ")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "fragment test3 onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "fragment test3 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "fragment test3 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "fragment test3 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "fragment test3 onStop")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "fragment test3 onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "fragment test3 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "fragment test3 onDetach")
    }

    companion object {
        const val TAG = "TestFragment3"

        @JvmStatic
        fun newInstance() = Test3Fragment()
    }
}