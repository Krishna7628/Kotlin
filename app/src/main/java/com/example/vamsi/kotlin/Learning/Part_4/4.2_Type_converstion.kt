package com.example.vamsi.kotlin.Learning.Part_4

fun main(args : Array<String>){


    /* Implicitly  or Widening  */
    val num1 = 10                   // Int
    val num2 : Long = num1.toLong()   // Long
    println ("Long value is $num2")

    val num3 : Float = num1.toFloat()   // float
    println ("Long value is $num3")

    val num4 : Double = num1.toDouble()   // float
    println ("Double value is $num4")

    val num5 : Byte = num1.toByte()   // Byte
    println ("Byte value is $num5")

    val num6 : Short = num1.toShort()   // Short
    println ("Short value is $num6")

    val num7 : Char = num1.toChar()   // Char
    println ("Char value is $num7")

    val num8 : String = num1.toString()   // String
    println ("String value is $num8")


    /* Explicitly    or  Narrowing*/

    val n1 = 97.567                    // Double

    val nn2 : Int = n1.toInt()   // Int
    println ("Int value is $nn2")

    val n2 : Long = n1.toLong()   // Long
    println ("Long value is $n2")

    val n3 : Float = n1.toFloat()   // float
    println ("Float value is $n3")

    val n5 : Byte = n1.toByte()   // Byte
    println ("Byte value is $n5")

    val n6 : Short = n1.toShort()   // Short
    println ("Short value is $n6")

    val n7 : Char = n1.toChar()   // Char
    println ("Char value is $n7")

    val n8 : String = n1.toString()   // String
    println ("String value is $n8")

}