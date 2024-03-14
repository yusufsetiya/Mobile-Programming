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

class ConverterSuhu : AppCompatActivity(), View.OnClickListener {
    lateinit var btnCtoF : Button
    lateinit var btnFtoC : Button
    lateinit var edSuhu : EditText
    lateinit var tHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter_suhu)

        edSuhu = findViewById(R.id.suhu)
        btnCtoF = findViewById(R.id.celcius);
        btnFtoC = findViewById(R.id.fahrenheit);
        tHasil = findViewById(R.id.hasilSuhu);

        btnCtoF.setOnClickListener(this);
        btnFtoC.setOnClickListener(this);
    }
    override fun onClick(v: View?) {
        var Jumlahsuhu = edSuhu.text.toString().toDouble()
        var hasil=0.0

        when(v?.id){
            R.id.celcius ->{
                hasil = (9.0/5.0 * Jumlahsuhu) + 32;
            }
            R.id.fahrenheit -> {
                hasil = (Jumlahsuhu-32)/1.8
            }
        }
        hasil.toFloat()
        tHasil.text = "$hasil"
    }
}
