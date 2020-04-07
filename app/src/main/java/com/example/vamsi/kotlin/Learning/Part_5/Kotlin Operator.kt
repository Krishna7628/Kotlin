package com.example.vamsi.kotlin.Learning.Part_5

fun main(args: Array<String>) {

    /*  Arithmetic operator  */
    val a1 = 10
    val b1 = 5
    println(a1 + b1)
    println(a1 - b1)
    println(a1 * b1)
    println(a1 / b1)
    println(a1 % b1)

    /* Relation operator */   //--> >, <, >=, <=, ==, !=
    /* Assignment operator */  // =--> +=, -=, *=, /=, %=

    var a = 20
    val b = 5
    a += b  //--> a+b = 25(20+5)
    println("a+=b :" + a)
    a -= b  //--> antl-b = 20(25 - 5)
    println("a-=b :" + a)
    a *= b  //--> a*b = 100 ( 20 * 5)
    println("a*=b :" + a)
    a /= b  // a/b = 20 (100 / 5)
    println("a/=b :" + a)
    a %= b // a%b = 0
    println("a%=b :" + a)


    /* Unary operator */ //--> +,-, ++, --, !
    var a2 = 10
    var b2 = 5
    val bool = true
    println("+a :" + +a2)  // 10
    println("-b :" + -b2)  // -5
    println("++a :" + ++a2)  // 11
    println("--b :" + --b2)  // 4
    println("!flag : ${!bool}") // false


/* Logical Operator */ //--> &&, ||, !

    val a3 = 10
    val b3 = 5
    val c = 15
    val flag = false
    var result: Boolean
    result = (a3 > b3) && (a3 > c)
    println("(a3>b3) && (a3>c) :" + result)  /// false
    result = (a3 > b3) || (a3 > c)
    println("(a>b3) || (a3>c) :" + result)  // true
    result = !flag
    println("!flag :" + result)  // true




}