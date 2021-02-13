package com.example.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tArea: EditText
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tArea = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)
    }
    fun EditMe(view: View) {
        val editString = tArea.text.toString()
        textView.text = editString
    }
}