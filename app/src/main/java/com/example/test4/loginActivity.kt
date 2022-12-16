package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        utils.blackIconStausBar(this , R.color.light_bg)

    }
}