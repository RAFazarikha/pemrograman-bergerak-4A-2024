package com.example.moduldua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick: Button = findViewById(R.id.button)

        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v != null ){
            when(v.id){
                R.id.button -> {
                    val pindah = Intent(this,MainActivity2::class.java)
                    startActivity(pindah)
                }
            }
        }

    }
}