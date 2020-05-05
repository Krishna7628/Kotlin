package com.example.vamsi.kotlin.`9_1`.HighLevelFunctionsAndLambdas

import java.util.*

/*      High Level Functions and Lambdas :
*       1. Using Object Oriented Way : Interface
*       2. Using High Level Functions
*       3. Lambdas
*   --> Lambdas and high level Funcion in Detail
*          1. Explanation
*          2. Demo
*       ---> lambdas it just a function with no name
*
*   --> High Level Functions
*        > can accept functions as parameters
*        > can return a function
*        > Or can do  both
* */


fun main(args: Array<String>) {
    val program = Program()
    program.addTwoNumbers(2, 7)

    program.addTwoNumbers(2, 9, object : myInterface {  // Using interface / Object Oriented way
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val test: String = "Hello"

    val myLambda = { s: Int -> println(s) }       // lambda Expression {function}
    // or
    val myLambdas: (Int) -> Unit = { s: Int -> println(s) }

    program.addTwoNumbers(3, 6, myLambdas)
}

class Program {

    fun addTwoNumbers(a: Int, b: Int) {
        val sum = a + b        // body
        println(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: myInterface) {   // Using interface / Object Oriented way
        val sum = a + b        // body
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {   // High level function with lambda as parameter
        val sum = a + b        // body
        action(sum)
    }


}

interface myInterface {
    fun execute(sum: Int)
}