package com.reo.running.di_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity(private var action: Action) : AppCompatActivity() {
    var km: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        km = action.run(km)
        Log.d("debug-app", "$km")
    }
}