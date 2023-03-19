package com.example.multidiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.multidiceroller.R

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById<Button>(R.id.button)

        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        //Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        //Update the screen with the dice roll
        val resultTextView: TextView = findViewById<TextView>(R.id.textView)
        resultTextView.text = diceRoll.toString()

        val dice2 = Dice(6)
        val diceRoll2 = dice.roll()

        //Update the screen with the dice roll
        val resultTextView2: TextView = findViewById<TextView>(R.id.textView2)
        resultTextView2.text = diceRoll2.toString()

        Toast.makeText(this@MainActivity, "Two Dice Rolled", Toast.LENGTH_SHORT).show()
    }
}

/**
 * This class is used to mimic a dice roll
 */
class Dice(private val numSides: Int) {

    /**
     * returns the result of the dice roll
     */
    fun roll(): Int {
        return (1..numSides).random()
    }
}