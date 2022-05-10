package org.gsm.postingproject.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.gsm.postingproject.R
import org.gsm.postingproject.databinding.ActivityBindingBinding

class BindingActivity : AppCompatActivity() {
    private val binding by lazy { ActivityBindingBinding.inflate(layoutInflater) }
    var text = "홍길동"
    var grade = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.activity = this

    }
}