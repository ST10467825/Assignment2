package za.co.varsitycollege.Assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        //Declarations

        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)
        val startButton = findViewById<Button>(R.id.startButton)


        startButton.setOnClickListener {
            //explicit intent
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)

        }

    }
}
