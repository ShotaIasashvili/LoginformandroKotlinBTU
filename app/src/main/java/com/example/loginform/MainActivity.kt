package com.example.loginform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

/**
 * A Login Form Example in Kotlin Android
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // get reference to all views
        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var edl_editTextTextEmailAddress = findViewById(R.id.edl_editTextTextEmailAddress) as EditText
        var et_firstName = findViewById(R.id.et_firstName) as EditText
        var et_lastName = findViewById(R.id.et_lastName) as EditText
        var et_age = findViewById(R.id.et_age) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
            edl_editTextTextEmailAddress.setText("")
            et_firstName.setText("")
            et_lastName.setText("")
            et_age.setText("")



        }

        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            val password = et_password.text;
            val email = edl_editTextTextEmailAddress.text;
            val firstName = et_firstName.text;
            val lastName = et_lastName.text;
            val age = et_age.text;
            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()




        }
    }
}