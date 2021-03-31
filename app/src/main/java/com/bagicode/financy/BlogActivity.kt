package com.bagicode.financy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_blog.*

class BlogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        // Implementasi website dengan webview
        webview.loadUrl("https://www.google.com/")

        // Memberitahu pengguna bahwa sedang me-load website, berikan message dengan Toast
        Toast.makeText(this, "Silahkan tunggu...", Toast.LENGTH_SHORT).show()

        // Mengaktifkan setting untuk JavaScript
        webview.settings.javaScriptEnabled
        // Karena ada beberapa website yang harus mengaktifkan JavaScript, bisa saja jika JavaScript tidak
        // diaktifkan.. web tidak tampil dengan sempurna
    }
}