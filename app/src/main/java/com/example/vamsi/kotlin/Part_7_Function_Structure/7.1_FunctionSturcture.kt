package com.example.vamsi.kotlin.Part_7_Function_Structure

import android.os.Build
import android.support.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {
    add(3, 4)
    val sumOfTwoNum = sum(8, 9)
    println("sum of two number is $sumOfTwoNum")
}

//with  return : any means any return type
fun sum(i: Int, i1: Int): Any {
    return i + i1
}

           /* or */

/* based data type */
//fun sum(i: Int, i1: Int): Int {
//    return i + i1;
//}


//with out return
fun add(i: Int, i1: Int) {
    println("sum is ${i + i1}")
}


