package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButon:Button= findViewById(R.id.roll_button)
        rollButon.setOnClickListener {
          //  Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText:TextView=findViewById(R.id.result_text)
        //resultText.text="Dice Rolled!"
        val randomInt= Random().nextInt(6)+1
        resultText.text=randomInt.toString()
    }
}
