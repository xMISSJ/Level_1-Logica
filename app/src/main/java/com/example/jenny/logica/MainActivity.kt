package com.example.jenny.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Assigns value to each input field.
    private val firstInput = ptInput1.text.toString()
    private val secondInput = ptInput2.text.toString()
    private val thirdInput = ptInput3.text.toString()
    private val fourthInput = ptInput4.text.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener{
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        // First checks whether there is an empty input.
        if (!checkEmpty()) {

            // First input check. Answer needs to be T.
            if (firstInput == getString(R.string.True)) {
                Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
            }

            // Second input check. Answer needs to be F.
            if (secondInput == getString(R.string.False)) {
                Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
            }

            // Third input check. Answer needs to be F.
            if (thirdInput == getString(R.string.False)) {
                Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
            }

            // Fourth input check. Answer needs to be F.
            if (fourthInput == getString(R.string.False)) {
                Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun checkEmpty() : Boolean {
        var empty = false
        // Checks whether any of the inputs are empty.
        if (firstInput.trim().isEmpty() || secondInput.trim().isEmpty() || thirdInput.trim().isEmpty() || fourthInput.trim().isEmpty()) {
            Toast.makeText(this, getString(R.string.empty), Toast.LENGTH_LONG).show()
            empty = true
        }

        return empty
    }

}
