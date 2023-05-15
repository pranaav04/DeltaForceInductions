package com.example.wordjumble

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val intent = Intent(this, MainActivity2::class.java)
            val inputField = findViewById<EditText>(R.id.TextInputBox)
            val inputField2 = findViewById<EditText>(R.id.textInputBox)
            val submitButton = findViewById<Button>(R.id.button)
            val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
            val highScore = sharedPref.getInt("highScore", 0)
            val highScoreText = findViewById<TextView>(R.id.textView10)
            highScoreText.text = "$highScore"
            submitButton.setOnClickListener{
                val word = inputField.text.toString()
                val clue = inputField2.text.toString()
                if (word.isEmpty() && clue.isEmpty()) {
                    Toast.makeText(this, "Please enter Word and Clue!", Toast.LENGTH_LONG).show()
                }
                else if(word.isEmpty() && clue.isNotEmpty()){
                    Toast.makeText(this, "Please enter a Word!", Toast.LENGTH_LONG).show()
                }
                else if(word.isNotEmpty() && clue.isEmpty()){
                    Toast.makeText(this, "Please enter the Clue!", Toast.LENGTH_LONG).show()
                }
                else {
                    Toast.makeText(this, "Let's Play!", Toast.LENGTH_LONG).show()
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.start)
                    mediaPlayer?.start()
                    intent.putExtra("word", word)
                    intent.putExtra("clue", clue)
                    startActivity(intent)
                }
            }

    }
}


//