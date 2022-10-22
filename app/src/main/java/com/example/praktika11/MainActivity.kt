package com.example.praktika11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onClick(view: View) {
        val ImageButton: ImageView = findViewById(R.id.imageButton)
        ImageButton.visibility = View.INVISIBLE
    }
    fun onClick1(view: View) {
        val imageButton1:ImageView=findViewById(R.id.imageButton1)
        imageButton1.visibility=View.GONE
        val ImageButton:ImageView=findViewById(R.id.imageButton)
        ImageButton.visibility=View.VISIBLE

    }
    fun onClick0(view: View){
        val imageView2 : ImageView = findViewById(R.id.imageView2)
        imageView2.setVisibility(View.INVISIBLE)
    }
}