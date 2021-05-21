package com.ssong_develop.sampledatabindingcomponent.binding

import androidx.lifecycle.LifecycleCoroutineScope
import androidx.databinding.DataBindingComponent

class AppBindingComponent(private val scope : LifecycleCoroutineScope) : DataBindingComponent {
    override fun getAppViewBinding(): AppViewBinding {
        return AppViewBindingImpl(scope)
    }
}