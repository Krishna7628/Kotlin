package com.example.vamsi.kotlin.`10_Collections`

//////////////////////////////////////  Set /////////////////////////////////////

fun main(args: Array<String>) {
    // "Set" contains unique elements
    // "HashSet" also contains unique elements but sequence is not guranteed in output

    val mySet = setOf<Int>(2, 4, 54, 6, 1, 0, 9, 9, 9) // Immutable , Read only operation
    for (elements in mySet){
        println(elements)
    }
    //Mutable --> read and write both
    //mutableSetOf -->returns output in sequences
    //hashSetOf --> dn't returns output in sequences
       val mySetSmall = mutableSetOf<Int>(2, 43, 45, 5)
            mySetSmall.remove(2)
}