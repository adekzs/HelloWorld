package com.adeks.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var texVal : Int = 0
    var textView : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
    }

    fun incrementTextView(view: View) {
        texVal += 1
        textView?.setText(texVal.toString())
    }
    fun decrementTextView(view: View) {
        texVal -= 1
        textView?.setText(texVal.toString())
    }
}