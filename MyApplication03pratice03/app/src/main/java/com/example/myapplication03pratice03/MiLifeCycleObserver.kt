package com.example.myapplication03pratice03

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


class MiLifeCycleObserver : DefaultLifecycleObserver {
    override fun onCreate(lifecycler : LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MiLifeCycleObserver", "onCreate")
    }

    override fun onStart(lifecycler : LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MiLifeCycleObserver", "onStart")
    }

    override fun onPause(lifecycler: LifecycleOwner) {
        super.onPause(lifecycler)
        Log.d("MiLifeCycleObserver", "onStart")
    }

    override fun onResume(lifecycler: LifecycleOwner) {
        super.onStop(lifecycler)
        Log.d("MiLifeCycleObserver", "onResume")
    }

    override fun onStop(lifecycler: LifecycleOwner) {
        super.onStop(lifecycler)
        Log.d("MiLifeCycleObserver", "onStop")
    }

    override fun onDestroy(lifecycler: LifecycleOwner) {
        super.onDestroy(lifecycler)
        Log.d("MiLifeCycleObserver", "onStop")
    }

}