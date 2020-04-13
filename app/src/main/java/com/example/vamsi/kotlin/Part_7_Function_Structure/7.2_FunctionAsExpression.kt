package com.example.vamsi.kotlin.Part_7_Function_Structure

import android.os.Build
import android.support.annotation.RequiresApi

fun main(args: Array<String>) {
    val greaterValue = maxValue(5, 7)
    println("Greatest number is $greaterValue")
}


// Using return keyword
//fun maxValue(i: Int, i1: Int): Any {
//    if (i > i1) {
//        return i;
//    } else {
//        return i1;
//    }
//}

/* or --> with out using return keyword  */

//fun maxValue(i: Int, i1: Int): Any {
//    if (i > i1) {
//        i
//    } else {
//        i1
//    }
//}

/* or --> Function as Expression  */

// last line of if condition is return

fun maxValue(i: Int, i1: Int): Any = if (i > i1) {
    println("$i is a greater value")
    i
} else {
    println("$i1 is a greater value")
    i1
}
