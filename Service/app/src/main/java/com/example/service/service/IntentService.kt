package com.example.service.service

import android.app.IntentService
import android.content.Intent
import android.util.Log
import android.widget.Toast
import java.sql.Time


class IntentService:IntentService("MyService") {
    private var boolean=false
    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this, "Start IntentService", Toast.LENGTH_SHORT).show()
    }

    override fun onHandleIntent(intent: Intent?) {
        boolean=true
        while (boolean) {
            Log.d("*****",System.currentTimeMillis().toString())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        boolean=false
        Toast.makeText(this, "Stop IntentService", Toast.LENGTH_SHORT).show()
    }
}