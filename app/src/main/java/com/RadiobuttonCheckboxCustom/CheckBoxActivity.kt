package com.RadiobuttonCheckboxCustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class CheckBoxActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonSelect: AppCompatButton
    private lateinit var choseBoxView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        buttonSelect = findViewById(R.id.button_select)
        choseBoxView = findViewById(R.id.chose_box_text)

        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)

        checkBox.setOnClickListener(this)
        checkBox2.setOnClickListener(this)
        checkBox3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
buttonSelect.setOnClickListener {
    if (v is CheckBox) {
        if (v.isChecked) {
            choseBoxView.text=v.text
        }
    }
}
    }
}