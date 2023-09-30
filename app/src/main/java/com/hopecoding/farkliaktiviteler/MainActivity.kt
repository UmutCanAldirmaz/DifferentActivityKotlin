package com.hopecoding.farkliaktiviteler

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.hopecoding.farkliaktiviteler.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentFromSecond = intent

        if (intentFromSecond.getBooleanExtra("isBack", false)) {
            binding.textView.setText(getString(R.string.return_info))
        }

        println("onCreate is executed")
    }

    override fun onStart() {
        super.onStart()

        println("onStart is executed")

    }

    override fun onResume() {
        super.onResume()

        println("onResume is executed")

    }

    override fun onStop() {
        super.onStop()
        println("onStop is executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy is executed")

    }



    fun nextScreen(view: View) {
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("data", binding.dataTxt.text.toString())
        startActivity(intent)
        finish()
    }
}