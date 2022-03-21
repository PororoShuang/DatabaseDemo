package com.example.databasedemo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databasedemo.database.ProductDB
import com.example.databasedemo.databinding.ActivityMainBinding
import com.example.databasedemo.entity.Product

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInsert.setOnClickListener(){
            val p = Product(0,"iPhone",3500.00)

            val dao = ProductDB.getInstance(applicationContext).productDao

            dao.addProduct(p)
        }

        binding.btnRead.setOnClickListener(){

        }

    }
}