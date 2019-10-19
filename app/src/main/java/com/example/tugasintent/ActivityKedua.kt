package com.example.tugasintent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_kedua.*
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class ActivityKedua : AppCompatActivity() {

    lateinit var hslnim : TextView
    lateinit var hslnama : TextView
    lateinit var hslnilai : TextView
    lateinit var hasil : String
    lateinit var keterangan : TextView
    @SuppressLint("", "SetTextI18n")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        hslnim = findViewById(R.id.hasil_nim)
        hslnama = findViewById(R.id.hasil_nama)
        hslnilai = findViewById(R.id.hasil_nilai)
        keterangan = findViewById(R.id.ket)

        if (R.id.hasil_nilai >= 80) {
            hasil = "A"
        } else if (R.id.hasil_nilai < 80 && R.id.hasil_nilai >= 60) {
            hasil = "B"
        } else if (R.id.hasil_nilai < 60 && R.id.hasil_nilai >= 40) {
            hasil = "C"
        } else if (R.id.hasil_nilai < 40 && R.id.hasil_nilai >= 20) {
            hasil = "D"
        } else if (R.id.hasil_nilai < 20 && R.id.hasil_nilai >= 0) {
            hasil = "E"
        }

        hslnim.setText(intent.getStringExtra("dataNim"))
        hslnama.setText(intent.getStringExtra("dataNama"))
        hslnilai.setText(intent.getStringExtra("dataNilai"))
        keterangan.text = "Keterangan  : " + hasil

        btn_back.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}
