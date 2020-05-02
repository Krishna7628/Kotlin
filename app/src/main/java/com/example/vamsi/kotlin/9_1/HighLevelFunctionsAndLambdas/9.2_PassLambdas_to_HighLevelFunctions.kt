package com.example.vamsi.kotlin.`9_1`.HighLevelFunctionsAndLambdas

// Lambdas and high level functions
    /* val myLambdaFunc : (Int, Int ) -> Int = { x,y -> x+ y}
        were : myLambdaFunc --> variable name
               (Int, Int ) -> Int -->  parameters and return type of method body
                 x,y  --> parameters
                 x + y --> method body


             addTwoNum(3, 8 , myLambdaFunc)  // passing lambda to  high level function


             //function
            fun addTowNum(a : Int, b : Int, myFunc: (Int, Int) -> Int){
                var result = myFunc(a, b)
                println(result)
*/



fun main(args : Array<String>){
    val program = ProgramTest()
    val myLambdaFun : (Int, Int) -> Int = {x, y -> x+y}
    program.addTwoNumbers(3, 6, myLambdaFun)
    //or
  //  val myLambdaFun : (Int, Int) -> Int = {x, y -> x+y} --> Simple way
    program.addTwoNumbers(3, 6, {x, y -> x + y })
    //or
    program.addTwoNumbers(3, 6) {x, y -> x + y } // {x, y -> x + y } --> luk like fun body
}

class ProgramTest {
    fun addTwoNumbers(a: Int, b :Int, action: (Int, Int) -> Int ){
        val result = action(a, b)
        println(result)
    }
}
