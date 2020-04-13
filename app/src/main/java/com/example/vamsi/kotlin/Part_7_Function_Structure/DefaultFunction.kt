package com.example.vamsi.kotlin.Part_7_Function_Structure

// 7.5

fun main(args: Array<String>) {

    addSumValues(3, 3)
}

@JvmOverloads  // used for java dnt have default function we need delared @JvmOverLoads
fun addSumValues(i: Int, i1: Int, i2: Int = 10): Int = i + i1 + i2
