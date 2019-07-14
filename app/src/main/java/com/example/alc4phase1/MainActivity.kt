package com.example.alc4phase1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.time.Duration

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutALCButton : Button = findViewById(R.id.about_alc_button)
        aboutALCButton.setOnClickListener(this)

        val aboutMeButton : Button = findViewById(R.id.about_me_button)
        aboutMeButton.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.about_me_button -> {
                val intent = Intent(this, MyProfile::class.java)
                startActivity(intent)
            }
            R.id.about_alc_button -> {
                val intent = Intent(this, AboutALC::class.java)
                startActivity(intent)
            }
        }
    }
}
