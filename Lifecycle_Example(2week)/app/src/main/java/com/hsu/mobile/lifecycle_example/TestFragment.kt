package com.hsu.mobile.lifecycle_example

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class TestFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "fragment test1 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        Log.d(TAG, "fragment test1 onCreateView")
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "fragment test1 onViewCreated: ")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "fragment test1 onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "fragment test1 onStart")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "fragment test1 onAttach")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "fragment test1 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "fragment test1 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "fragment test1 onStop")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "fragment test1 onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "fragment test1 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(Test2Fragment.TAG, "fragment test1 onDetach")
    }

    companion object {
        const val TAG = "TestFragment"

        @JvmStatic
        fun newInstance() = TestFragment()
    }
}