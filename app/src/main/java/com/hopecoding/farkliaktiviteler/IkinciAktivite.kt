package com.hopecoding.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci_aktivite.*

class IkinciAktivite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivite)

        val intent=intent
        val alınanveri=intent.getStringExtra("gidenveri")
        S_activity_text.setText(alınanveri);
    }


    fun geriGit(view:View){

        val intent=Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()

    }

}