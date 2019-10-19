package com.example.tugasintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var gnim : EditText
    lateinit var gnama : EditText
    lateinit var gnilai : EditText
    lateinit var gbuttonproses : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gnim= findViewById(R.id.nim)
        gnama = findViewById(R.id.nama)
        gnilai = findViewById(R.id.nilai)
        gbuttonproses = findViewById(R.id.btn_proses)

        // mengirim data ke activity kedua
        btn_proses.setOnClickListener(){
            val intent = Intent(this, ActivityKedua::class.java)

            intent.putExtra("dataNim", gnim.text.toString())
            intent.putExtra("dataNama", gnama.text.toString())
            intent.putExtra("dataNilai", gnilai.text.toString())

            startActivity(intent)
        }
    }
}
