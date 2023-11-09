package com.example.myapplication

import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.FrameLayout
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private var webView: WebView? = null
    private var container: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        container = findViewById(R.id.container)
        webView = findViewById(R.id.webview)
        webView?.loadUrl("about:blank")

        findViewById<Button>(R.id.destroy_button).setOnClickListener {
            container?.removeAllViews()
            webView?.destroy()
        }
    }
}
