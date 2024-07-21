package com.example.loginpage

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var phone: Button
    private lateinit var email: Button
    private lateinit var name: TextView
    private lateinit var textHint: EditText
    private lateinit var passwordName: TextView
    private lateinit var passHide: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initUI()
        eventHandler()
    }

    private fun initUI(){
        phone = findViewById(R.id.PhoneNumberButton)
        email = findViewById(R.id.emailButton)
        name = findViewById(R.id.emailName)
        textHint = findViewById(R.id.emailText)
        passwordName = findViewById(R.id.passwordName)g
        passHide = findViewById(R.id.passwordText)
    }

    @SuppressLint("SetTextI18n")
    private fun eventHandler(){
        phone.setOnClickListener{
            name.text = "Phone Number"
            textHint.hint = "Enter your Phone Number"
            textHint.inputType = InputType.TYPE_CLASS_NUMBER
            passwordName.visibility = View.GONE
            passHide.visibility = View.INVISIBLE
        }
        email.setOnClickListener{
            name.text = "Email"
            textHint.hint = "Enter your mail"
            textHint.inputType = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            passwordName.visibility = View.VISIBLE
            passHide.visibility = View.VISIBLE
        }
    }
}