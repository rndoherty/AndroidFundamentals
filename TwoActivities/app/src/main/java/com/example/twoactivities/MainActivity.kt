package com.example.twoactivities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private val LOG_TAG = MainActivity::class.qualifiedName
        const val EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE"

    }

    private lateinit var mMessageEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessageEditText = findViewById(R.id.editText_main)


    }

    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG, "Button Clicked!")
        val intent = Intent(this, SecondActivity::class.java)
        val message = mMessageEditText.getText().toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}