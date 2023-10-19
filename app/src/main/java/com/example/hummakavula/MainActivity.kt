package com.example.hummakavula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hummakavula.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Declare the binding variable
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        // Call the super class to complete the creation of activity
        super.onCreate(savedInstanceState)

        // Initialize the binding for the activity
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Get the root view so we can use it to set the content view
        val view = binding.root

        // Set the content view to the root view
        setContentView(view)
    }
}