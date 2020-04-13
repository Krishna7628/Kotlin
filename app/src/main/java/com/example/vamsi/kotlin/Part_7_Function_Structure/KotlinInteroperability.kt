@file:JvmName("KotlinFile")
package com.example.vamsi.kotlin.Part_7_Function_Structure

//7.3, 7.4

/* Interoperability : -->
    1. you can call java functions from kotlin and kotlin functions from java.
    2. you can have java and kotlin in same package or different package
 */



fun main(args: Array<String>) {
    val sum = JavaInteroperability.addSum(4, 6)
    print("Sum is $sum")
}

fun sumValue(i: Int, i1: Int): Any {
    return  i + i1
}