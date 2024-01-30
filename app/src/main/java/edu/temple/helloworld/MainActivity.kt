package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    private lateinit var displayTextView: TextView
    private lateinit var clickMeButton: Button
    private lateinit var nameEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        clickMeButton = findViewById(R.id.clickMeButton)
        nameEditText = findViewById(R.id.nameEditText)
        
        // Respond to button click event per specifications
        clickMeButton.setOnClickListener(View.OnClickListener {
            displayTextView.text = "Hello ${nameEditText.text}"
        })

    }
}