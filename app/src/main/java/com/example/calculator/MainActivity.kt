package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one: TextView = findViewById(R.id.one)
        val two: TextView = findViewById(R.id.two)
        val three: TextView = findViewById(R.id.three)
        val four: TextView = findViewById(R.id.four)
        val five: TextView = findViewById(R.id.five)
        val six: TextView = findViewById(R.id.six)
        val seven: TextView = findViewById(R.id.seven)
        val eight: TextView = findViewById(R.id.eight)
        val nine: TextView = findViewById(R.id.nine)
        val zero: TextView = findViewById(R.id.zero)
        val clear: TextView = findViewById(R.id.clear)
        val plus: TextView = findViewById(R.id.plus)
        val minus: TextView = findViewById(R.id.minus)
        val multiply: TextView = findViewById(R.id.multiply)
        val divide: TextView = findViewById(R.id.divide)
        val equal: TextView = findViewById(R.id.equal)
        val result: TextView = findViewById(R.id.result)

        var calculationResult: Int = 0
        var x: Int = 0
        var lastSign: String = ""

        one.setOnClickListener {
            result.setText("${x}1")
            x = result.text.toString().toInt()
        }

        two.setOnClickListener {
            result.setText("${x}2")
            x = result.text.toString().toInt()
        }

        three.setOnClickListener {
            result.setText("${x}3")
            x = result.text.toString().toInt()
        }

        four.setOnClickListener {
            result.setText("${x}4")
            x = result.text.toString().toInt()
        }

        five.setOnClickListener {
            result.setText("${x}5")
            x = result.text.toString().toInt()
        }

        six.setOnClickListener {
            result.setText("${x}6")
            x = result.text.toString().toInt()
        }

        seven.setOnClickListener {
            result.setText("${x}7")
            x = result.text.toString().toInt()
        }

        eight.setOnClickListener {
            result.setText("${x}8")
            x = result.text.toString().toInt()
        }

        nine.setOnClickListener {
            result.setText("${x}9")
            x = result.text.toString().toInt()
        }

        zero.setOnClickListener {
            result.setText("${x}0")
            x = result.text.toString().toInt()
        }

        clear.setOnClickListener {
            result.setText("")
            x = 0
            calculationResult = 0
            lastSign = ""
        }

        plus.setOnClickListener {
            calculationResult = calculate(calculationResult, x, lastSign)
            result.setText("${calculationResult}")
            x = 0
            lastSign = "+"
        }

        minus.setOnClickListener {
            calculationResult = calculate(calculationResult, x, lastSign)
            result.setText("${calculationResult}")
            x = 0
            lastSign = "-"
        }

        multiply.setOnClickListener {
            calculationResult = calculate(calculationResult, x, lastSign)
            result.setText("${calculationResult}")
            x = 0
            lastSign = "*"
        }

        divide.setOnClickListener {
            calculationResult = calculate(calculationResult, x, lastSign)
            result.setText("${calculationResult}")
            x = 0
            lastSign = "/"
        }

        equal.setOnClickListener {
            calculationResult = calculate(calculationResult, x, lastSign)
            result.setText("${calculationResult}")
            x = 0
            calculationResult = 0
            lastSign = ""
        }
        
    }
    fun calculate(calculation: Int, x: Int, lastSign: String): Int{
        var calculationResult: Int = calculation
        when(lastSign){
            "+" -> {
                calculationResult += x
            }
            "-" -> {
                calculationResult -= x
            }
            "*" -> {
                calculationResult *= x
            }
            "/" -> {
                calculationResult /= x
            }
            "" -> {
                calculationResult = x
            }
        }
        return calculationResult
    }

}