package com.example.sayanadak11901941

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question2)

        // edit text box
        val etextbox=findViewById<EditText>(R.id.edittext1)
        val submitbtn:Button=findViewById(R.id.button)
        submitbtn.setOnClickListener {
            val msg:String?=etextbox.text.toString()
            if(msg.isNullOrEmpty())
            {
                Toast.makeText(this,"you have entered \"NULL\"",Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "you have entered \"$msg \"", Toast.LENGTH_SHORT).show()
            }
            etextbox.getText().clear()
        }

        // radio button
        val rgrp:RadioGroup=findViewById(R.id.rg)
        rgrp.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{group,i ->val radioButton = findViewById<RadioButton>(i)
            Toast.makeText(this, "you have selected \"${radioButton.text.toString()} \"", Toast.LENGTH_SHORT).show()})
        val clearbtn:Button=findViewById(R.id.button2)
        clearbtn.setOnClickListener {
            val rgrp:RadioGroup=findViewById(R.id.rg)
            val btn:RadioButton=findViewById(rgrp.checkedRadioButtonId)
            btn.isChecked=false
        }

        // checkbox
        val cb1:CheckBox=findViewById(R.id.checkBox1)
        val cb2:CheckBox=findViewById(R.id.checkBox2)
        val cb3:CheckBox=findViewById(R.id.checkBox3)

        cb1.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "you have checked \"${cb1.text}\"", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "you have unchecked \"${cb1.text}\"", Toast.LENGTH_SHORT).show()
            }
        }
        cb2.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "you have checked \"${cb2.text}\"", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "you have unchecked \"${cb2.text}\"", Toast.LENGTH_SHORT).show()
            }
        }
        cb3.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "you have checked \"${cb3.text}\"", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "you have unchecked \"${cb3.text}\"", Toast.LENGTH_SHORT).show()
            }
        }

        val clearbtn2:Button=findViewById(R.id.button3)
        clearbtn2.setOnClickListener {
            if(cb1.isChecked)cb1.isChecked=false
            if(cb2.isChecked)cb2.isChecked=false
            if(cb3.isChecked)cb3.isChecked=false
        }
    }
}