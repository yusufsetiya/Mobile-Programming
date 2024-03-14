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

class LuasPersegi : AppCompatActivity(), View.OnClickListener {
    lateinit var btnLuas : Button
    lateinit var btnKeliling : Button
    lateinit var edPanjang : EditText
    lateinit var edLebar : EditText
    lateinit var tHasil : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_persegi)

        edPanjang = findViewById(R.id.panjang);
        edLebar = findViewById(R.id.lebar);
        btnLuas = findViewById(R.id.luas);
        btnKeliling = findViewById(R.id.keliling);
        tHasil = findViewById(R.id.Hasil);

        btnLuas.setOnClickListener(this);
        btnKeliling.setOnClickListener(this);
    }
    override fun onClick(v: View?) {
        var a = edPanjang.text.toString().toDouble()
        var b = edLebar.text.toString().toDouble()
        var hasil=0.0

        when(v?.id){
            R.id.luas ->{
                hasil = a * b
            }
            R.id.keliling -> {
                hasil = 2 * (a + b)
            }
        }
        tHasil.text =  "$hasil"
    }
}

