package com.ssong_develop.sampledatabindingcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.ssong_develop.sampledatabindingcomponent.binding.AppBindingComponent
import com.ssong_develop.sampledatabindingcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_main,
                AppBindingComponent(lifecycleScope)
            )
        binding.bindingViewModel = viewModel
        binding.lifecycleOwner = this

        onClick(binding)
    }

    private fun onClick(binding: ActivityMainBinding) {
        binding.inputBtn.setOnClickListener {
            viewModel.testText.value = binding.inputTextView.text.toString()
        }
    }
}