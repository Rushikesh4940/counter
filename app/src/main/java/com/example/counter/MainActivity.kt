package com.example.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val present = findViewById<Button>(R.id.present)
        val absent= findViewById<Button>(R.id.absent)
        val text= findViewById<TextView>(R.id.textView)
        val text2= findViewById<TextView>(R.id.absentc)
        var counter= 0
        var absentcount=0
        text.text=counter.toString()
        present.setOnClickListener {
            counter=counter+1
            text.text= counter.toString()
        }
        absent.setOnClickListener {
            absentcount = absentcount + 1
            text2.text= absentcount.toString()
        }
    }
}