package com.example.deprecationproblem

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.text.Html.fromHtml
import android.widget.AbsoluteLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Knows about deprecation of AbsoluteLayout and Space here but
        // lint does not report on either.
        val absLayout = AbsoluteLayout(this)
        val space = androidx.legacy.widget.Space(this)
    }
}