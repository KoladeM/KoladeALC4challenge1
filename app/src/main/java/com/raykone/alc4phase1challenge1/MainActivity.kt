package com.raykone.alc4phase1challenge1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aboutALC.setOnClickListener { view ->
            val intent = Intent(this, ALCPageActivity::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener { view ->
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
