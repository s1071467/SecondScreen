package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*


class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        thirdActivityBtn.setOnClickListener{
            val intent2  = Intent(this,Activity3::class.java)
            startActivity(intent2)
        }
    }
}