package com.example.vamsi.kotlin.`11_Lambdas_HighFunction_And_Collections`

import android.app.Person

/*   Important Functions:
*               filter : filter our desired elements from collection
*               map :   perform operations modify elements
*
*       Predicates : Or a condition that returns TRUE or False
*               "all" : Do all elements satisfy the predicate / condition ?
*               "any" : Do any element in list satisfy the predicate?
*               "count": total elements that satisfy the predicate
*               "find": Returns the FIRST element that satisfy predicate
*
*       More Functions :
*           "flatmap"  : Filter elements from a collection of collection
*           "distinct" : return unique results
*
*
*  Defination :
*    FILTER : returns a list containing only elements matching the given predicate or condition
*    MAP : returns a list containing the results of applying the given *[transform]* function to each element in the original collections*/


fun main(args: Array<String>) {
    val myNumbers = listOf(2, 3, 4, 6, 16, 44)


    /*  FILTER  */
    val mySmallNumbers = myNumbers.filter { v -> v < 10 } // {} lambdas functions
    //or
    //myNumbers.filter { it < 10 }

    for (item in mySmallNumbers) {
        println(item)
    }


    /*  MAP  */

    val mySquareOfANumber = myNumbers.map { num -> num * num }  //or {it * it}

    for (item in mySquareOfANumber){
        println("Square Of Number : $item")
    }


    /* Both At Time */
    val mySmallSquareNumber = myNumbers.filter { it < 10 }.map { it * it }

    for (item in mySmallSquareNumber){
        println("Both : $item")
    }


    /*  Example With Model Class  */
    val people = listOf<Details>(Details(10,"vamsi"), Details(27,"krishna"), Details(100,"yandrapragada"))
        var  names = people.map { p -> p.name } // or {it.name} give list of name

        for (item in names){
            println("Names : $item")
        }

}

class Details(var age : Int,var name : String){

}