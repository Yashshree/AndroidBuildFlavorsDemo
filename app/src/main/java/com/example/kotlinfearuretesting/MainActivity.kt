package com.example.kotlinfearuretesting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinfearuretesting.BuildConfig.API

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  println(getString(R.string.app_name))
        Log.e("app name",getString(R.string.app_name))

        //val view=RecyclerView(this)

        Log.e("API=",API)


    }
}
