package com.example.vamsi.kotlin.Part_7_Function_Structure

fun main(args : Array<String>){

    areaOfSquare(length = 3, breadth = 5)

}

fun areaOfSquare(length : Int, breadth: Int, height: Int = 10) : Int = length * breadth * height
