package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Resource ID's
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    private val questionBank = listOf(  // key/value pairs calling on strings.xml
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true))

    private var currentIndex = 0    // Index counter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Finding Resources by ID's
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        // Setting up OnClickListener (What happens when the 'True' button is clicked...)
        trueButton.setOnClickListener {
            // This happens when button is clicked
            Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_SHORT).show()
        }
            // Setting up OnClickListener (What happens when the 'True' button is clicked...)
        falseButton.setOnClickListener {
                // This happens when button is clicked
            Toast.makeText(
                this,
                R.string.incorrect_toast,
                Toast.LENGTH_SHORT).show()
        }
    }
}