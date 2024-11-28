package com.example.git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.store_activity)

        val city = intent.getStringExtra("city") ?: "Неизвестно"

        val tvStoreTitle = findViewById<TextView>(R.id.tvStoreTitle)
        tvStoreTitle.text = "Магазин в городе $city"

        val btnShowPhones = findViewById<Button>(R.id.btnShowPhones)
        val btnBuyPhone = findViewById<Button>(R.id.btnBuyPhone)
        val btnShowStatistics = findViewById<Button>(R.id.btnShowStatistics)
        val btnRepairPhone = findViewById<Button>(R.id.btnRepairPhone)
        val btnBackToMainMenu = findViewById<Button>(R.id.btnBackToMainMenu)

        btnShowPhones.setOnClickListener {
        }
        btnBuyPhone.setOnClickListener {
        }
        btnShowStatistics.setOnClickListener {
        }
        btnRepairPhone.setOnClickListener {
        }
        btnBackToMainMenu.setOnClickListener {
            finish()
        }
    }
}