package com.raykone.alc4phase1challenge1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_alcpage.*

class ALCPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alcpage)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        webViewALC.settings.javaScriptEnabled = true

        webViewALC.webViewClient = WebViewClient()

        webViewALC.loadUrl("https://www.andela.com/alc")

//        val webViewAlc = findViewById<WebView>(R.id.webViewALC)
//        webViewAlc.loadUrl("https://andela.com/alc")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
