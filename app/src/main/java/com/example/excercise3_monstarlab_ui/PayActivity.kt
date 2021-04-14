package com.example.excercise3_monstarlab_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pay.*

class PayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        imageBack.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        txtEnviarPay.setOnClickListener {
            val intent: Intent = Intent(this,CardsActivity::class.java)
            startActivity(intent)
        }

    }
}