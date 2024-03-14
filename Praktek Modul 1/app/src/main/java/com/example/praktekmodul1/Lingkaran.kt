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

class Lingkaran : AppCompatActivity(), View.OnClickListener {
    lateinit var btnLuas : Button
    lateinit var btnKeliling : Button
    lateinit var edJari : EditText
    lateinit var tHasil : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)

        edJari = findViewById(R.id.jari)
        btnLuas = findViewById(R.id.luasLingkaran);
        btnKeliling = findViewById(R.id.kelilingLingkaran);
        tHasil = findViewById(R.id.hasilLingkaran);

        btnLuas.setOnClickListener(this);
        btnKeliling.setOnClickListener(this);
        }
    override fun onClick(v: View?) {
        var r = edJari.text.toString().toDouble()
        var phi = 3.14
        var hasil=0.0

        when(v?.id){
            R.id.luasLingkaran ->{
                hasil = phi * r * r
            }
            R.id.kelilingLingkaran -> {
                hasil = 2 * phi * r
            }
        }
        hasil.toFloat()
        tHasil.text = "$hasil"
    }
}