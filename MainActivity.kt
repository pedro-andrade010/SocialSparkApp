package com.example.socialsparkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connects to the layout
        setContentView(R.layout.activity_main)


        // Connect layout elements to the ID(s)
        val inputTime = findViewById<EditText>(R.id.inputTime)
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val txtResult = findViewById<TextView>(R.id.txtResult)


        // When the "Get suggestion" button is clicked
              btnSuggest.setOnClickListener {

            val time = inputTime.text.toString().trim().lowercase()


            val suggestion = when {
                time == "morning" -> "Send a 'Good morning' text to a family member."
                time == "mid-morning" -> "Reach out to a colleague with a quick 'Thank you.'"
                time == "afternoon" -> "Share a funny meme or interesting link with a friend."
                time == "afternoon snack time" -> "Send a quick 'thinking of you' message."
                time == "dinner" -> "Call a friend or relative for a 5-minute catch-up."
                time == "night" || time == "after dinner" -> "Leave a thoughtful comment on a friend's post."
                time.isEmpty() -> "Please enter a time of day."
                else -> "Invalid input. Try: Morning, Afternoon, Dinner, etc."
            }


            //Show suggestion in Text View
            txtResult.text = suggestion
        }


        // when the "reset" button is clicked
        btnReset.setOnClickListener {
            inputTime.text.clear()
            txtResult.text = "Your suggestion will appear here"

        }

    }

}