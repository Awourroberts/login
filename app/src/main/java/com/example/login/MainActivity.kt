package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var gender: Spinner
    lateinit var email:EditText
    lateinit var phone:EditText
    lateinit var password:EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name=findViewById(R.id.etEmail)
        gender=findViewById(R.id.spGender)
        email=findViewById(R.id.Email)
        phone=findViewById(R.id.etPhone)
        password=findViewById(R.id.etPass)
        button=findViewById(R.id.btnSign)

        button.setOnClickListener {
            if(name.text.isEmpty()) {

                name.setError("Fill in your name")

            }
            if(email.text.isEmpty()){

                email.setError("Fill in your email")

            }
            if(phone.text.isEmpty()){

                phone.setError("Fill in your PhoneNumber")

            }
            if(password.text.isEmpty()){

                password.setError("Fill in your password")

            }else{
                var intent=Intent(baseContext,login::class.java)
                startActivity(intent)
            }
        }
        var variety=arrayOf("Female","Male","Binary","Other")
        var adapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,variety)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        gender.adapter=adapter
        }


    }
