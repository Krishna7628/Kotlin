package com.example.vamsi.kotlin.Learning.Part_5.FlowControl

/*   Using Expression:  */

fun main(args: Array<String>) {
    val number1 = 4
    val numberProvided = when (number1) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    }
    println("You provide $numberProvided")


    /*  Using when Without Expression */

    val number2 = 4
    when (number2) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("invalid number")
    }


    /*    Multiple Statement of when Using Braces  */
    val number3 = 1
    when (number3) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }


    /*    Multiple branches of when    */
    val number8 = 8
    when (number8) {
        3, 4, 5, 6 ->
            println("It is summer season")
        7, 8, 9 ->
            println("It is rainy season")
        10, 11 ->
            println("It is autumn season")
        12, 1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    }


    /*    Using when in the range  */
    val number = 7
    when (number) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
}
