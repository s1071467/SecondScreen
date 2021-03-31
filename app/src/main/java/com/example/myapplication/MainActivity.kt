 package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


 class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        secondActivityBtn.setOnClickListener(this)
        btn1.setOnClickListener(this)
    }

     override fun onClick(v: View) {
         if(v==secondActivityBtn){
             val intent  = Intent(this,Activity2::class.java)
             startActivity(intent)
         }else if(v==btn1){
             System.exit(0)
         }
     }
 }