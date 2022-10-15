package com.RadiobuttonCheckboxCustom

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton


class RadioGroupActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var textRadioGroup: ImageView
    private lateinit var radioButtonBlack: RadioButton
    private lateinit var radioButtonRed: RadioButton
    private lateinit var radioButtonGreen: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_group)

        textRadioGroup = findViewById(R.id.textRadioGroup)
        radioButtonBlack=findViewById(R.id.radioButtonBlack)
        radioButtonRed=findViewById(R.id.radioButtonRed)
        radioButtonGreen=findViewById(R.id.radioButtonGreen)

        radioButtonBlack.setOnClickListener(this)
        radioButtonRed.setOnClickListener(this)
        radioButtonGreen.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v is RadioButton) {

            val checked = v.isChecked

            when (v.getId()) {
                R.id.radioButtonBlack ->if (checked) textRadioGroup.setBackgroundColor(Color.BLACK)

                R.id.radioButtonRed ->if (checked) textRadioGroup.setBackgroundColor(Color.RED)

                R.id.radioButtonGreen ->if (checked)textRadioGroup.setBackgroundColor(Color.GREEN)
            }
        }
    }
}