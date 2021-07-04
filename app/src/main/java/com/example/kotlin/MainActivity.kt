package com.example.kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value = getRandomValue(MIN, MAX)
        Log.d("TAG", "Random number is " + value)

        var circleArea = Math.PI * value * value
        var squareArea = value * value
        Log.d("TAG", "Circle area is " + circleArea)
        Log.d("TAG", "Square area is " + squareArea)

        if (circleArea > squareArea)
            Log.d("Tag", "Circle area is greater then square area" )
        else if (circleArea < squareArea)
            Log.d("TAG", "Circle area is smaller then square area" )
        else
            Log.d("TAG", "Circle area is equal to square area" )

    }
    val MIN = 1
    val MAX = 100

    private fun getRandomValue(minValue: Int, maxValue: Int): Int {
        return Random.nextInt(maxValue, minValue)
    }
}