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

class CekBilangan : AppCompatActivity(), View.OnClickListener {
    lateinit var btnCekBilangan : Button
    lateinit var edBilangan : EditText
    lateinit var tHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cek_bilangan)

        edBilangan = findViewById(R.id.bilangan)
        btnCekBilangan = findViewById(R.id.cekbilangan)
        tHasil = findViewById(R.id.hasilBilangan);

        btnCekBilangan.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        var Bilangan = edBilangan.text.toString().toInt()
        var hasil = false;

        when(v?.id){
            R.id.cekbilangan ->{
                if (Bilangan % 2 == 0){
                    hasil = true;
                }else{
                    hasil = false;
                }
            }
        }
        if (hasil == true) {
            tHasil.text = "$Bilangan adalah bilangan genap"
        }else{
            tHasil.text = "$Bilangan adalah bilangan ganjil"
        }
    }
}
