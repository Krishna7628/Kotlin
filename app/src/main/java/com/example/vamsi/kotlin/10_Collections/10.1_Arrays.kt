package com.example.vamsi.kotlin.`10_Collections`

/*                                 Collections
*   Array  : Multable but has fixed size
*   Collections : Immutable Collections : Read Only Operations
*               -> listOf, mapOf, setOf
*
*               : Mutable Collecitons :  Read and write  both
*               -> ArrayList, arrayListOf, mutableListOf
*               -> HashMap, hashMapOf, mutableMapOf
*               -> mutableSetOf, hashSetOf */


// Array :


fun main(args: Array<String>) {

    val myFirstArray = arrayOf(6, 6, 9, 9, 9, 9)
    val myArray = Array<Int>(6) { 0 }              //mutable in nature but fixed in size
    myArray[3] = 9
    myArray[0] = 88

    //Elements : 0 0 0 0 0 0
    //Index :    0 1 2 3 4 5
    for (elements in myFirstArray) {
        println(elements)
    }
}