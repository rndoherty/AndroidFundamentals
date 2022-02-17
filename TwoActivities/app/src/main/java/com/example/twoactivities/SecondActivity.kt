package com.example.twoactivities

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {


    companion object {
        private val LOG_TAG = SecondActivity::class.qualifiedName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = this.intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE).toString()
        val textView: TextView = findViewById(R.id.text_message)
        Log.d(SecondActivity.LOG_TAG, message)
        textView.text = message


    }
}