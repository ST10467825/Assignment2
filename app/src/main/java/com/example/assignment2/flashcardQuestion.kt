package za.co.varsitycollege.Assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.R
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flashcard_question)

        //Declarations
        val questionView = findViewById< TextView>(R.id.questionTextView)
        val answerEditText = findViewById<EditText>(R.id.answerEditText)
        val feedbackTextView = findViewById<TextView>(R.id.feedbackTextView)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)


    }
}
