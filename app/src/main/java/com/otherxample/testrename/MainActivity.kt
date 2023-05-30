package com.otherxample.testrename

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import com.google.gson.Gson
import java.io.InputStreamReader

data class Config(val offerLink: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myWebView = WebView(this)
        setContentView(myWebView)

        val inputStream = this.assets.open("config.json")
        myWebView.loadUrl(Gson().fromJson(InputStreamReader(inputStream), Config::class.java).offerLink)
    }
}
