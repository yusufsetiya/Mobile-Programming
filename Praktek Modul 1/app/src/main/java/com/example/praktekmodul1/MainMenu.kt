package com.example.praktekmodul1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainMenu : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnAritmatika : Button
    private lateinit var btnPersegi : Button
    private lateinit var btnLingkaran : Button
    private lateinit var btnSuhu : Button
    private lateinit var btnBilangan : Button
    private lateinit var btnKonversi : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        btnAritmatika = findViewById(R.id.aritmatika)
        btnPersegi = findViewById(R.id.persegi)
        btnLingkaran = findViewById(R.id.lingkaran)
        btnSuhu = findViewById(R.id.suhu)
        btnBilangan = findViewById(R.id.cekbilangan)
        btnKonversi = findViewById(R.id.konversi)
        btnAritmatika.setOnClickListener(this)
        btnPersegi.setOnClickListener(this)
        btnLingkaran.setOnClickListener(this)
        btnSuhu.setOnClickListener(this)
        btnBilangan.setOnClickListener(this)
        btnKonversi.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.aritmatika -> run {
                    val intentBiasa = Intent(this@MainMenu, MainActivity::class.java)
                    startActivity(intentBiasa)
                }
                R.id.persegi -> run {
                    val intentBiasa = Intent(this@MainMenu, LuasPersegi::class.java)
                    startActivity(intentBiasa)
                }
                R.id.lingkaran -> run {
                    val intentBiasa = Intent(this@MainMenu, Lingkaran::class.java)
                    startActivity(intentBiasa)
                }
                R.id.suhu -> run {
                    val intentBiasa = Intent(this@MainMenu, ConverterSuhu::class.java)
                    startActivity(intentBiasa)
                }
                R.id.cekbilangan -> run {
                    val intentBiasa = Intent(this@MainMenu, CekBilangan::class.java)
                    startActivity(intentBiasa)
                }
                R.id.konversi -> run {
                    val intentBiasa = Intent(this@MainMenu, KonversiPanjang::class.java)
                    startActivity(intentBiasa)
                }
            }
        }
    }
}