package com.example.vamsi.kotlin.`9_1`.HighLevelFunctionsAndLambdas

// "it" implicit name of single parameter

fun main(args: Array<String>) {
    val test1 = Test1()
    test1.revrseAndDisplay("hello", { s -> s.reversed() })
    // using it keyword having single parameter in lambda
    test1.revrseAndDisplay("helloWord", { it.reversed() })
}

class Test1 {
    fun revrseAndDisplay(s: String, function: (String) -> String) {
        var result = function(s)
        println(result)
    }
}
