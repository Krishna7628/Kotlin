package com.example.vamsi.kotlin.Learning

/*
*  Byte -- > 8 bit  --> 1 byte
*  Short --> 16 bit  --> 2 byte
*  Integer --> 32bit --> 4 byte
*  Long --> 64 bit  --> 8 byte
*  Float --> 32 bit --> 4 byte
*  Double --> 64 bit --> 8 byte
*  char  --> 16 bit  --> 2 byte
*  Boolean -- > 8 bit  --> 1 byte  */



fun main(args: Array<String>) {
    val a = 10000
    val d = 100.00
    val f = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1
    val c = 'A'
    val bool = true

    println("Your Int Value is " + a)
    println("Your Double  Value is " + d)
    println("Your Float Value is " + f)
    println("Your Long Value is " + l)
    println("Your Short Value is " + s)
    println("Your Byte Value is " + b)
    println("Your Char Value is " + c)
    println("Your Boolean Value is " + bool)


    /*  String Type */
    // 1. Escape String -->(\n, \t, \b) where we can use escape character
    val sName = "hello World"
    //or
    val sName1 = "hello World\n"
    println("Your String Value is" + sName + "  " + sName1)

    // 2. Raw String -->(\n, \t, \b) where we can use escape character
    val sName2 = """ hello World 
                             to 
                             All
                             """
    println("Your String Value is" + sName2)


    /*  Array */

    // 1. arrayof()method

    val id = arrayOf(1, 2, 3, 4, 5)
    val firstId = id[0]
    val lasted = id[id.size - 1]
    println(firstId)
    println(lasted)
    // 2. Array() constructor

    val asc = Array(5, { i -> i * 2 }) //asc[0,2,4,6,8]
    println(asc)


}

