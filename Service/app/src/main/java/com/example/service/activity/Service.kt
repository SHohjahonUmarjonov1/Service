package com.example.service.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.service.R
import com.example.service.databinding.ActivityIntentServiceBinding
import com.example.service.service.IntentService

class Service : AppCompatActivity() {
    private lateinit var binding: ActivityIntentServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityIntentServiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }
    private fun initViews() {
        binding.start.setOnClickListener {
            val intent=Intent(this,IntentService::class.java)
            startService(intent)
        }
        binding.stop.setOnClickListener {
            val intent=Intent(this,IntentService::class.java)
            stopService(intent)
        }
    }
}