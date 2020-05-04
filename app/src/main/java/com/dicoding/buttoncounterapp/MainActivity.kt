package com.dicoding.buttoncounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.ActionMode
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userInput : EditText = findViewById(R.id.editText)
        val button : Button = findViewById(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text =" "
        textView?.movementMethod = ScrollingMovementMethod()

        button?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                textView?.append(userInput.text)
                textView?.append("\n")
                //userInput.text.clear()
                userInput.setText("")
            }
        })
    }

    override fun onStart() {
        Log.d(TAG, "on Start : calleld")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "on Restore : calleld")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Log.d(TAG, "onResume : calleld")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause : calleld")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        Log.d(TAG, "onSaveInstance : calleld")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onStop() {
        Log.d(TAG, "onStop : calleld")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy : calleld")
        super.onDestroy()
    }
    
}

