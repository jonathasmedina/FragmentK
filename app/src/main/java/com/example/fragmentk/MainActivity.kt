package com.example.fragmentk

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var btn1: Button
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)

        btn1.setOnClickListener {
            carregaFragment(BlankFragment())
        }
        btn2.setOnClickListener {
            carregaFragment(BlankFragment2())
        }
    }

    private fun carregaFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout1, fragment)
            .commit()
    }
}