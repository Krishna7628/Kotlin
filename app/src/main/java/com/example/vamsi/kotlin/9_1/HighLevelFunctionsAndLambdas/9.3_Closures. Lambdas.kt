package com.example.vamsi.kotlin.`9_1`.HighLevelFunctionsAndLambdas

/*
* Closures : in java 8, you cn't mutate (change) values of outsside variable inside lambdas
*  Bit in Kotlin you can change the values
*/

fun main(args : Array<String>){
    var resutl = 0
    val test = Test()
    test.addTwoNumbers(2,7){x,y -> resutl = x + y }

    println(resutl)
}

class Test {
    fun addTwoNumbers(i: Int, i1: Int, function: (Int, Int) -> Unit) {
        function(i , i1)
    }

}
