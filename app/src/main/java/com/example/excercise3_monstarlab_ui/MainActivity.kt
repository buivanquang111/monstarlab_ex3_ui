package com.example.excercise3_monstarlab_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomnavigationbar.background = null

        floatingButton.setOnClickListener {
            val intent: Intent = Intent(this,PayActivity::class.java)
            startActivity(intent)
        }
    }
}