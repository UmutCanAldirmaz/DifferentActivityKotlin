package com.hopecoding.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hopecoding.farkliaktiviteler.databinding.ActivityIkinciAktiviteBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIkinciAktiviteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIkinciAktiviteBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val dataFromMain = intent

        val data = dataFromMain.getStringExtra("data")

        binding.SecondActivityDataTxt.text = data


        binding.backBtn.setOnClickListener {
            returnScreen(it)
        }

        println("onCreate 2 is executed")

    }

    override fun onStart() {
        super.onStart()

        println("onStart 2 is executed")

    }

    override fun onResume() {
        super.onResume()

        println("onResume 2 is executed")

    }

    override fun onStop() {
        super.onStop()
        println("onStop 2 is executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy 2 is executed")

    }

    fun returnScreen(view:View){
        val intent = Intent(this@SecondActivity,MainActivity::class.java)
        intent.putExtra("isBack",true)
        startActivity(intent)
        finish()
    }

}