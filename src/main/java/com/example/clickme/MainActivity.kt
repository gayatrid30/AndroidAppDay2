package com.example.clickme

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    var c = 0

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cclick(view: View)
    {
        c++

        val textview = findViewById(R.id.count) as TextView
        textview.text = "You have clicked $c times."
    }
}

