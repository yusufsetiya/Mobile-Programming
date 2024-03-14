package com.example.praktekmodul1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KonversiPanjang : AppCompatActivity(), View.OnClickListener {
    lateinit var btnKonv : Button
    lateinit var edPanjang : EditText
    lateinit var tHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_panjang)

        edPanjang = findViewById(R.id.panjang)
        btnKonv = findViewById(R.id.konversiPanjang)
        tHasil = findViewById(R.id.hasilPanjang);

        btnKonv.setOnClickListener(this);
    }
    override fun onClick(v: View?) {
        var JumlahPanjang = edPanjang.text.toString().toDouble()

        when(v?.id){
            R.id.konversiPanjang -> {
                val km = JumlahPanjang / 100000
                val hm = JumlahPanjang / 10000
                val dam = JumlahPanjang / 1000
                val m = JumlahPanjang / 100
                val dm = JumlahPanjang / 10
                val cm = JumlahPanjang
                val mm = JumlahPanjang * 10

                val kmFormatted = String.format("%.2f", km)
                val hmFormatted = String.format("%.2f", hm)
                val damFormatted = String.format("%.2f", dam)
                val mFormatted = String.format("%.2f", m)
                val dmFormatted = String.format("%.2f", dm)
                val cmFormatted = String.format("%.2f", cm)
                val mmFormatted = String.format("%.2f", mm)

                tHasil.text = "Km: $kmFormatted\nHm: $hmFormatted\nDam: $damFormatted\nM: $mFormatted\nDm: $dmFormatted\nCm: $cmFormatted\nMm: $mmFormatted"
            }
        }
    }
}
