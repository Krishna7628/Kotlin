package com.example.vamsi.kotlin.Learning.Part_5.FlowControl

fun main(args : Array<String>) {

    //Iterate through array

    val marks = arrayOf(80,85,60,90,70)
    for(item in marks){
        println(item)
    }

  // Iterate through range
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) println(i)

    print("for (i in 5..1) print(i) = ")
    for (i in 5 downTo 1) println(i)             // prints nothing

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) println(i)

    print("for (i in 5 downTo 2) print(i) = ")
    for (i in 5 downTo 2) println(i)

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) println(i)

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) println(i)

}

