package com.ssong_develop.sampledatabindingcomponent

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    val testText = MutableStateFlow<String?>(null)

}