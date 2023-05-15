package com.example.wordjumble

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("InflateParams", "CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val word = intent.getStringExtra("word")
        val clue = intent.getStringExtra("clue")
        val wordLength = word?.length
        val restLength = 16 - wordLength!!
        val clueButton = findViewById<ImageButton>(R.id.imageButton)
        val resetButton = findViewById<Button>(R.id.button2)
        val checkButton = findViewById<Button>(R.id.button3)
        val heart1 = findViewById<ImageView>(R.id.imageView4)
        val heart2 = findViewById<ImageView>(R.id.imageView6)
        val heart3 = findViewById<ImageView>(R.id.imageView5)

        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPref.edit()
        var highScore = sharedPref.getInt("highScore", 0)

        var outputList = outputGenerator(word, restLength)
        val text1x1 = findViewById<TextView>(R.id.textView11)
        val text1x2 = findViewById<TextView>(R.id.textView12)
        val text1x3 = findViewById<TextView>(R.id.textView13)
        val text1x4 = findViewById<TextView>(R.id.textView14)
        val text2x1 = findViewById<TextView>(R.id.textView21)
        val text2x2 = findViewById<TextView>(R.id.textView22)
        val text2x3 = findViewById<TextView>(R.id.textView23)
        val text2x4 = findViewById<TextView>(R.id.textView24)
        val text3x1 = findViewById<TextView>(R.id.textView31)
        val text3x2 = findViewById<TextView>(R.id.textView32)
        val text3x3 = findViewById<TextView>(R.id.textView33)
        val text3x4 = findViewById<TextView>(R.id.textView34)
        val text4x1 = findViewById<TextView>(R.id.textView41)
        val text4x2 = findViewById<TextView>(R.id.textView42)
        val text4x3 = findViewById<TextView>(R.id.textView43)
        val text4x4 = findViewById<TextView>(R.id.textView44)

        val choiceFiller = findViewById<TextView>(R.id.textView16)

        val choiceDash = dashCreator(wordLength)
        text1x1.text = outputList[0].toString()
        text1x2.text = outputList[1].toString()
        text1x3.text = outputList[2].toString()
        text1x4.text = outputList[3].toString()
        text2x1.text = outputList[4].toString()
        text2x2.text = outputList[5].toString()
        text2x3.text = outputList[6].toString()
        text2x4.text = outputList[7].toString()
        text3x1.text = outputList[8].toString()
        text3x2.text = outputList[9].toString()
        text3x3.text = outputList[10].toString()
        text3x4.text = outputList[11].toString()
        text4x1.text = outputList[12].toString()
        text4x2.text = outputList[13].toString()
        text4x3.text = outputList[14].toString()
        text4x4.text = outputList[15].toString()
        choiceFiller.text = choiceDash
        val choiceList = choiceDash.toMutableList()
        clueButton.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.activity_clue_button)
            dialog.show()
            val button = dialog.findViewById<Button>(R.id.button4)
            val clueMessage = dialog.findViewById<TextView>(R.id.textView7)
            clueMessage.text = clue
            button.setOnClickListener {
                dialog.dismiss()
            }
        }
        var index: Int
        text1x1.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[0].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text1x1.setTextColor(Color.parseColor("#FFFFFF"))
                text1x1.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text1x1.isClickable = false
            }
        }
        text1x2.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[1].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text1x2.setTextColor(Color.parseColor("#FFFFFF"))
                text1x2.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text1x2.isClickable = false
            }
        }
        text1x3.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[2].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text1x3.setTextColor(Color.parseColor("#FFFFFF"))
                text1x3.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text1x3.isClickable = false
            }
        }
        text1x4.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[3].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text1x4.setTextColor(Color.parseColor("#FFFFFF"))
                text1x4.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text1x4.isClickable = false
            }
        }
        text2x1.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[4].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text2x1.setTextColor(Color.parseColor("#FFFFFF"))
                text2x1.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text2x1.isClickable = false
            }
        }
        text2x2.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[5].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text2x2.setTextColor(Color.parseColor("#FFFFFF"))
                text2x2.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text2x2.isClickable = false
            }
        }
        text2x3.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[6].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text2x3.setTextColor(Color.parseColor("#FFFFFF"))
                text2x3.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text2x3.isClickable = false
            }
        }
        text2x4.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[7].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text2x4.setTextColor(Color.parseColor("#FFFFFF"))
                text2x4.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text2x4.isClickable = false
            }
        }
        text3x1.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[8].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text3x1.setTextColor(Color.parseColor("#FFFFFF"))
                text3x1.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text3x1.isClickable = false
            }
        }
        text3x2.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[9].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text3x2.setTextColor(Color.parseColor("#FFFFFF"))
                text3x2.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text3x2.isClickable = false
            }
        }
        text3x3.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[10].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text3x3.setTextColor(Color.parseColor("#FFFFFF"))
                text3x3.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text3x3.isClickable = false
            }
        }
        text3x4.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[11].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text3x4.setTextColor(Color.parseColor("#FFFFFF"))
                text3x4.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text3x4.isClickable = false
            }
        }
        text4x1.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[12].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text4x1.setTextColor(Color.parseColor("#FFFFFF"))
                text4x1.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text4x1.isClickable = false
            }
        }
        text4x2.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[13].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text4x2.setTextColor(Color.parseColor("#FFFFFF"))
                text4x2.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text4x2.isClickable = false
            }
        }
        text4x3.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[14].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text4x3.setTextColor(Color.parseColor("#FFFFFF"))
                text4x3.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text4x3.isClickable = false
            }
        }
        text4x4.setOnClickListener {
            index = choiceList.indexOf('_')
            if (index >= 0){
                choiceList[index] = outputList[15].uppercaseChar()
                choiceFiller.text = choiceList.joinToString("")
                text4x4.setTextColor(Color.parseColor("#FFFFFF"))
                text4x4.setBackgroundResource(R.drawable.custom_background_3)
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.selection_made)
                mediaPlayer?.start()
                text4x4.isClickable = false
            }
        }

        resetButton.setOnClickListener{
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.reset)
            mediaPlayer?.start()
            for (iterate in 0 until wordLength){
                choiceList[iterate] = '_'
                choiceFiller.text = choiceList.joinToString("")
            }
            outputList = outputList.shuffled()
            text1x1.isClickable = true
            text1x2.isClickable = true
            text1x3.isClickable = true
            text1x4.isClickable = true
            text2x1.isClickable = true
            text2x2.isClickable = true
            text2x3.isClickable = true
            text2x4.isClickable = true
            text3x1.isClickable = true
            text3x2.isClickable = true
            text3x3.isClickable = true
            text3x4.isClickable = true
            text4x1.isClickable = true
            text4x2.isClickable = true
            text4x3.isClickable = true
            text4x4.isClickable = true

            text1x1.text = outputList[0].toString()
            text1x2.text = outputList[1].toString()
            text1x3.text = outputList[2].toString()
            text1x4.text = outputList[3].toString()
            text2x1.text = outputList[4].toString()
            text2x2.text = outputList[5].toString()
            text2x3.text = outputList[6].toString()
            text2x4.text = outputList[7].toString()
            text3x1.text = outputList[8].toString()
            text3x2.text = outputList[9].toString()
            text3x3.text = outputList[10].toString()
            text3x4.text = outputList[11].toString()
            text4x1.text = outputList[12].toString()
            text4x2.text = outputList[13].toString()
            text4x3.text = outputList[14].toString()
            text4x4.text = outputList[15].toString()

            text1x1.setTextColor(Color.parseColor("#000000"))
            text1x1.setBackgroundResource(R.drawable.custom_button_2)
            text1x2.setTextColor(Color.parseColor("#000000"))
            text1x2.setBackgroundResource(R.drawable.custom_button_2)
            text1x3.setTextColor(Color.parseColor("#000000"))
            text1x3.setBackgroundResource(R.drawable.custom_button_2)
            text1x4.setTextColor(Color.parseColor("#000000"))
            text1x4.setBackgroundResource(R.drawable.custom_button_2)
            text2x1.setTextColor(Color.parseColor("#000000"))
            text2x1.setBackgroundResource(R.drawable.custom_button_2)
            text2x2.setTextColor(Color.parseColor("#000000"))
            text2x2.setBackgroundResource(R.drawable.custom_button_2)
            text2x3.setTextColor(Color.parseColor("#000000"))
            text2x3.setBackgroundResource(R.drawable.custom_button_2)
            text2x4.setTextColor(Color.parseColor("#000000"))
            text2x4.setBackgroundResource(R.drawable.custom_button_2)
            text3x1.setTextColor(Color.parseColor("#000000"))
            text3x1.setBackgroundResource(R.drawable.custom_button_2)
            text3x2.setTextColor(Color.parseColor("#000000"))
            text3x2.setBackgroundResource(R.drawable.custom_button_2)
            text3x3.setTextColor(Color.parseColor("#000000"))
            text3x3.setBackgroundResource(R.drawable.custom_button_2)
            text3x4.setTextColor(Color.parseColor("#000000"))
            text3x4.setBackgroundResource(R.drawable.custom_button_2)
            text4x1.setTextColor(Color.parseColor("#000000"))
            text4x1.setBackgroundResource(R.drawable.custom_button_2)
            text4x2.setTextColor(Color.parseColor("#000000"))
            text4x2.setBackgroundResource(R.drawable.custom_button_2)
            text4x3.setTextColor(Color.parseColor("#000000"))
            text4x3.setBackgroundResource(R.drawable.custom_button_2)
            text4x4.setTextColor(Color.parseColor("#000000"))
            text4x4.setBackgroundResource(R.drawable.custom_button_2)
        }
        var count = 3
        checkButton.setOnClickListener{
            var dashCheck = 0
            var score = 0
            for (iterate in choiceList){
                if (iterate == '_'){
                    dashCheck = 1
                }
            }
            if(dashCheck > 0){
                Toast.makeText(this, "Enter all elements of word to check!", Toast.LENGTH_LONG).show()
            }
            else{
                val checkString = choiceList.joinToString("")
                if(checkString == word.uppercase()){
                   for(length in 0 until wordLength){
                       if(checkString[length] in "AEIOULNSTR"){
                            score += 1
                       }
                       if(checkString[length] in "DG"){
                           score += 2
                       }
                       if(checkString[length] in "BCMP"){
                           score += 3
                       }
                       if(checkString[length] in "FHVWY"){
                           score += 4
                       }
                       if(checkString[length] == 'K'){
                           score += 5
                       }
                       if(checkString[length] in "JX"){
                           score += 8
                       }
                       if(checkString[length] in "QZ"){
                           score += 10
                       }
                   }
                    if (count == 3){
                        score *= 100
                    }
                    if (count == 2){
                        score *= 70
                    }
                    if (count == 1){
                        score *= 30
                    }

                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.game_win)
                    mediaPlayer?.start()

                    if(score > highScore){
                        editor.apply{
                            putInt("highScore", score)
                            apply()
                        }
                    }

                    val scoreDiag ="Your score is $score!"
                    val dialog1 = Dialog(this)
                    dialog1.setContentView(R.layout.activity_score_display)
                    dialog1.show()
                    val homeButton = dialog1.findViewById<Button>(R.id.button5)
                    val scoreMessage = dialog1.findViewById<TextView>(R.id.textView8)
                    scoreMessage.text = scoreDiag
                    homeButton.setOnClickListener{
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    }

                }
                else{
                    Toast.makeText(this, "Wrong word entered!", Toast.LENGTH_LONG).show()
                    count -= 1
                    when(count){
                        2 -> heart3.isVisible = false
                        1 -> heart2.isVisible = false
                        0 -> heart1.isVisible = false
                    }
                    if(count == 2){
                        val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.life_lost)
                        mediaPlayer?.start()
                    }
                    if(count == 1){
                        val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.life_lost)
                        mediaPlayer?.start()
                    }
                    if(count == 0){
                        val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.game_over)
                        mediaPlayer?.start()
                        val lossDiag ="Better luck next time!"
                        val dialog2 = Dialog(this)
                        dialog2.setContentView(R.layout.activity_score_display)
                        dialog2.show()
                        val homeButton = dialog2.findViewById<Button>(R.id.button5)
                        val scoreMessage = dialog2.findViewById<TextView>(R.id.textView8)
                        scoreMessage.text = lossDiag
                        homeButton.setOnClickListener{
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        }
                    }
                }
            }
        }
    }
}

private fun outputGenerator(givenWord : String, givenLength: Int): List<Char> {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var outString = ""
    var randomGenerated: Int
    var i = 0
    while (i < givenLength) {
        randomGenerated = Random.nextInt(0, 26)
        if (alphabet[randomGenerated] in givenWord) {
            continue
        } else {
            outString += alphabet[randomGenerated]
        }
        i++
    }
    outString += givenWord
    val charList: List<Char> = outString.toList()
    val outputList = charList.shuffled()
    return(outputList)
}


private fun dashCreator(givenLength: Int?): String {
    var dash = ""
    for (i in 1..givenLength!!) {
        dash += "_"
    }
    return (dash)
}

