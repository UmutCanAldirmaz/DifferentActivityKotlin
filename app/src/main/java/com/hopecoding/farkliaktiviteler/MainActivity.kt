package com.hopecoding.farkliaktiviteler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }



    fun AktiviteDegistir(view:View){

        val veri=editText.text.toString()
        if(veri.equals("")){
            Toast.makeText(this, "You forgot enter data", Toast.LENGTH_SHORT).show()
        }else{
            val intent=Intent(applicationContext,IkinciAktivite::class.java)
            intent.putExtra("gidenveri",veri)
            startActivity(intent)
            finish()
        }


    }
}