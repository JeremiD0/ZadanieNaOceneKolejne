package com.example.zadanie221122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val s1 = findViewById<Switch>(R.id.switch1)
        val s2 = findViewById<Switch>(R.id.switch2)
        val s3 = findViewById<Switch>(R.id.switch3)
        val s4 = findViewById<Switch>(R.id.switch4)
        val s5 = findViewById<Switch>(R.id.switch5)
        val s6 = findViewById<Switch>(R.id.switch6)
        val s7 = findViewById<Switch>(R.id.switch7)
        val s8 = findViewById<Switch>(R.id.switch8)
        val s9 = findViewById<Switch>(R.id.switch9)

        findViewById<Button>(R.id.Losuj).setOnClickListener {
            s1.text = Random.nextInt(0,9).toString()
            s2.text = Random.nextInt(0,9).toString()
            s3.text = Random.nextInt(0,9).toString()
            s4.text = Random.nextInt(0,9).toString()
            s5.text = Random.nextInt(0,9).toString()
            s6.text = Random.nextInt(0,9).toString()
            s7.text = Random.nextInt(0,9).toString()
            s8.text = Random.nextInt(0,9).toString()
            s9.text = Random.nextInt(0,9).toString()
        }

        findViewById<Button>(R.id.Sortuj).setOnClickListener {

        }




    }
}