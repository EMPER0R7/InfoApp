package com.example.kotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var currentimg=0
    lateinit var image:ImageView
    var nm= arrayOf("Aditya","Amey","Harish","Kavyansh","Nainesh","Raghav","Shourya")
    var info1= arrayOf("Mai app banaya💀","Mai jab serious hota hu to mazak nahi karne ka","Lodaaa a kya yaarr🤡","Bhai yar vo bahut jyada green flag 🚩 hai🙂","Aaj bass 69 times hilaya💦","Shit bhai iCloud ka pswrd bhul gaya👍","Double drop +female quota se IIT aya hu🥸")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var next=findViewById<ImageButton>(R.id.btnnxt)
        var prev=findViewById<ImageButton>(R.id.btnback)
        var name=findViewById<TextView>(R.id.name)
        var info=findViewById<TextView>(R.id.info)
        next.setOnClickListener{
            var idCurrentImageString="pic$currentimg"
            var idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f

            currentimg=(7+currentimg+1)%7
            var idImageToShowString="pic"+currentimg

            var idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            name.text=nm[currentimg]
            info.text=info1[currentimg]
        }
        prev.setOnClickListener {
            var idCurrentImageString="pic$currentimg"
            var idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f

            currentimg=(7+currentimg-1)%7
            var idImageToShowString="pic"+currentimg

            var idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            name.text=nm[currentimg]
            info.text=info1[currentimg]

        }
    }
}