package com.example.spinnerdropdawen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spinnerdropdawen.rv.SpinnerModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<SpinnerDropDawn>(R.id.dropDaven).setOnClickListener {
            val list = arrayListOf(
                SpinnerModel("0", "www", "w"),
                SpinnerModel("0", "111", "w"),
                SpinnerModel("0", "555", "w")
            )
            findViewById<SpinnerDropDawn>(R.id.dropDaven).setOnClick(list)
        }
    }
}