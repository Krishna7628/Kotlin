package com.example.vamsi.kotlin.`11_Lambdas_HighFunction_And_Collections`

/*  Predicate : return either true or false
*
*                "all" : Do all elements satisfy the predicate / condition ? -- > return either true or false
*               "any" : Do any element in list satisfy the predicate?       -->  return either true or false
*               "count": total elements that satisfy the predicate --> return count that satisfy the condition
*               "find": Returns the FIRST element that satisfy predicate -- > return the first item that satisfy the condition
* */


fun main(args: Array<String>) {

    val myNumbers = listOf(2, 3, 5, 6, 34, 66)
    val check1 = myNumbers.all({ it > 10 }) // checks where all elements greater than 10?
    println(check1)

    val check2 = myNumbers.any({ it > 10 })// checks where any single element greater than 10?
    println(check2)

    val check3 = myNumbers.count({ it > 10 })// checks where the element satisfy the condition and return count that satisfy the condition.
    println(check3)


    val check4 = myNumbers.find({ it > 10 })//return the first item that satisfy the condition.
    println(check4)



// { it > 10 } this condition repeated so in short cut
    val myNumbers1 = listOf(2, 3, 5, 6, 34, 66)

    val myPredicate = {num : Int -> num > 10}
    val check11 = myNumbers.all(myPredicate) // checks where all elements greater than 10?
    println(check11)

    val check22 = myNumbers.any(myPredicate)// checks where any single element greater than 10?
    println(check22)

    val check32 = myNumbers.count(myPredicate)// checks where the element satisfy the condition and return count that satisfy the condition.
    println(check32)


    val check42 = myNumbers.find(myPredicate)//return the first item that satisfy the condition.
    println(check42)


}