package com.example.materialchips

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity() {
    private lateinit var chip1:Chip
    private lateinit var chip2: Chip

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chip1=findViewById(R.id.chip1)
        chip2=findViewById(R.id.chip2)

        chip1.setOnCloseIconClickListener {
            chip1.visibility=View.GONE
        }

        chip2.setOnClickListener {
            chip2.isChecked=true
            //chip2.chipBackgroundColor= ColorStateList.valueOf(resources.getColor(R.color.purple_200))

            chip2.chipBackgroundColor=ColorStateList.valueOf(ContextCompat.getColor(applicationContext,R.color.purple_200))
        }


    }
}