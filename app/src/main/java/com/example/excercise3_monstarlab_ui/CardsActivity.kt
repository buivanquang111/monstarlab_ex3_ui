package com.example.excercise3_monstarlab_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_cards.*

class CardsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        imgBackCards.setOnClickListener {
            val intent: Intent = Intent(this,PayActivity::class.java)
            startActivity(intent)
        }

        imgBaCham1.setOnClickListener {
            linerLayoutMenu1.visibility = View.VISIBLE
            imgBaCham1.visibility = View.GONE
        }
        linerClose1.setOnClickListener {
            linerLayoutMenu1.visibility = View.GONE
            imgBaCham1.visibility = View.VISIBLE
        }

        imgBaCham2.setOnClickListener {
            linerLayoutMenu2.visibility = View.VISIBLE
            imgBaCham2.visibility = View.GONE
        }
        linerClose2.setOnClickListener {
            linerLayoutMenu2.visibility = View.GONE
            imgBaCham2.visibility = View.VISIBLE
        }

        imgBaCham3.setOnClickListener {
            linerLayoutMenu3.visibility = View.VISIBLE
            imgBaCham3.visibility = View.GONE
        }
        linerClose3.setOnClickListener {
            linerLayoutMenu3.visibility = View.GONE
            imgBaCham3.visibility = View.VISIBLE
        }
    }
}