package com.example.photoframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var currentImage = 0
    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val per = findViewById<ImageButton>(R.id.prv)
        val next = findViewById<ImageButton>(R.id.nex)

        per.setOnClickListener {
            val idCurrentImageString = "pic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString , "id" , packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
            currentImage = (3 + currentImage - 1)%3

            val idImageToShowString = "pic$currentImage"
            // convert string id into integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha= 1f

        }

        next.setOnClickListener {
            val idCurrentImageString = "pic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString , "id" , packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
            currentImage = (3 + currentImage + 1)%3

            val idImageToShowString = "pic$currentImage"
            // convert string id into integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha= 1f

        }


    }
}