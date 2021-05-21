package com.ssong_develop.sampledatabindingcomponent.binding

import android.widget.TextView
import androidx.databinding.BindingAdapter
import kotlinx.coroutines.flow.StateFlow

interface AppViewBinding {

    @BindingAdapter("setTextStateFlow")
    fun setText(view : TextView , stateFlow: StateFlow<String>)
}