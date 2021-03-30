package me.denis.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zero: TextView = findViewById(R.id.zero_btn)
        val one: TextView = findViewById(R.id.one_btn)
        val two: TextView = findViewById(R.id.two_btn)
        val three: TextView = findViewById(R.id.three_btn)
        val four: TextView = findViewById(R.id.four_btn)
        val five: TextView = findViewById(R.id.five_btn)
        val six: TextView = findViewById(R.id.six_btn)
        val seven: TextView= findViewById(R.id.seven_btn)
        val eight: TextView = findViewById(R.id.eight_btn)
        val nine: TextView = findViewById(R.id.nine_btn)
        val division: TextView = findViewById(R.id.division_btn)
        val multiplication: TextView = findViewById(R.id.multiplication_btn)
        val plus: TextView = findViewById(R.id.plus_btn)
        val minus: TextView = findViewById(R.id.minus_btn)
        val ac: TextView = findViewById(R.id.AC_btn)
        val parenthesis1_btn: TextView = findViewById(R.id.parenthesis1_btn)
        val parenthesis2_btn: TextView = findViewById(R.id.parenthesis2_btn)
        val math_operation: TextView = findViewById(R.id.math_operation)
        val result_text: TextView = findViewById(R.id.result_text)
        zero.setOnClickListener{ setTextFields("0") }
        one.setOnClickListener{ setTextFields("1") }
        two.setOnClickListener{ setTextFields("2") }
        three.setOnClickListener{ setTextFields("3") }
        four.setOnClickListener{ setTextFields("4") }
        five.setOnClickListener{ setTextFields("5") }
        six.setOnClickListener{ setTextFields("6") }
        seven.setOnClickListener{ setTextFields("7") }
        eight.setOnClickListener{ setTextFields("8") }
        nine.setOnClickListener{ setTextFields("9") }
        division.setOnClickListener{ setTextFields("/") }
        multiplication.setOnClickListener{ setTextFields("*") }
        plus.setOnClickListener{ setTextFields("+") }
        minus.setOnClickListener{ setTextFields("-") }
        parenthesis1_btn.setOnClickListener{ setTextFields("(") }
        parenthesis2_btn.setOnClickListener{ setTextFields(")") }

        ac.setOnClickListener{
            math_operation.text = ""
            result_text.text
        }


    }
    fun setTextFields(str: String){
        val math_operation = findViewById<TextView>(R.id.math_operation)
        math_operation.append(str)
    }
}
