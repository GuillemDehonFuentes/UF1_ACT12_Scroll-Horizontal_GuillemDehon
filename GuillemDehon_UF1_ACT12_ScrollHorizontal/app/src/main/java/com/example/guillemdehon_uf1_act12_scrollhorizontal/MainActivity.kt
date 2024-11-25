package com.example.guillemdehon_uf1_act12_scrollhorizontal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val horizontalScrollView: HorizontalScrollView = findViewById(R.id.niggers)
        val toggleButton: ToggleButton = findViewById(R.id.niggereraser)

        toggleButton.setOnCheckedChangeListener { _, isCheked ->
            if(isCheked) {
                horizontalScrollView.isHorizontalScrollBarEnabled = true
            } else {
                horizontalScrollView.isHorizontalScrollBarEnabled = false
            }
        }
    }
}