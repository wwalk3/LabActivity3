package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var clickMeButton: Button
    lateinit var nameEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        clickMeButton = findViewById(R.id.clickMeButton)
        nameEditText = findViewById(R.id.nameEditText)


        clickMeButton.setOnClickListener {

            val errorText = "Please enter a name"
            val duration = Toast.LENGTH_SHORT
            val errorToast = Toast.makeText(this, errorText, duration)


            if (nameEditText.toString().isEmpty()) {
                errorToast.show()
            } else {
                displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
            }


        }
    }
}