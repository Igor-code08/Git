package com.example.git

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoscowStore = findViewById<Button>(R.id.btnMoscowStore)
        val btnSpbStore = findViewById<Button>(R.id.btnSpbStore)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnMoscowStore.setOnClickListener {
            val intent = Intent(this, StoreActivity::class.java)
            intent.putExtra("city", "Москва")
            startActivity(intent)
        }

        btnSpbStore.setOnClickListener {
            val intent = Intent(this, StoreActivity::class.java)
            intent.putExtra("city", "Санкт-Петербург")
            startActivity(intent)
        }

        btnExit.setOnClickListener {
            finish()
        }
    }
}