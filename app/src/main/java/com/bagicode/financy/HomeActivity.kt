package com.bagicode.financy

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        menu_blog.setOnClickListener {
            startActivity(Intent(this, BlogActivity::class.java))
        }
    }

    override fun onBackPressed() {
        // Panggil AlertDialog yang androidx.appcompat.app, karena menggunakan Kotlin dan Library terbaru
        AlertDialog.Builder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah Anda ingin keluar dari aplikasi?")
            .setPositiveButton("Ya") { _, _ ->
                Toast.makeText(
                    this, "Terima kasih telah menggunakan Aplikasi Financy", Toast.LENGTH_SHORT
                ).show()
                finish()
            }
            .setNegativeButton("Batal") { _, _ ->

            }.show()
    }
}