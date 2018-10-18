package com.aleapp.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aleapp.coderswag.R
import com.aleapp.coderswag.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

    }
}
