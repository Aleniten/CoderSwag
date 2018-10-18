package com.aleapp.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.GridLayout
import com.aleapp.coderswag.Adapters.ProductsAdapter
import com.aleapp.coderswag.R
import com.aleapp.coderswag.Services.DataServices
import com.aleapp.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataServices.getProducts(categoryType))

        var spancount = 2
        val orientation = resources.configuration.orientation

        if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spancount = 3
        }

        val screenSize = resources.configuration.screenWidthDp

        if (screenSize > 720){

            spancount = 3
        }

        val layoutManager = GridLayoutManager(this, spancount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
