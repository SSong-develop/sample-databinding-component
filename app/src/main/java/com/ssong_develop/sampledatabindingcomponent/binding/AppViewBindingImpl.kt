package com.ssong_develop.sampledatabindingcomponent.binding

import android.widget.TextView
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.LifecycleObserver
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect

class AppViewBindingImpl(private val scope : LifecycleCoroutineScope) : AppViewBinding , LifecycleObserver{
    override fun setText(view: TextView, stateFlow: StateFlow<String>) {
        scope.launchWhenStarted {
            stateFlow.collect{
                view.text = it
            }
        }
    }

}