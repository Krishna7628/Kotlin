package com.example.vamsi.kotlin.Part_7_Function_Structure

import java.math.BigInteger

/*
TailRec Function (Recursion Functions):
1. Used recursion in optimised way
2. Recursion means :  Calling it own function with in function.
In java stack over flow.
--> fibonacciNumber ---> 0 1 1 2 3 5 8 13 21...
*/



fun main(args: Array<String>) {

    println(getfibonacciOfANumber(6, BigInteger("1"), BigInteger("0")))
}

tailrec fun getfibonacciOfANumber(i: Int, i1: BigInteger, i2: BigInteger) {
    if (i == 0) {
        return print(i2)
    } else if (i2.equals(BigInteger("0"))) {
        print("${i2} " + "${i1} ")
        print("${i1 + i2} ")
        return getfibonacciOfANumber(i - 1, i1 + i2, i1)
    } else {
        print("${i1 + i2} ")
        return getfibonacciOfANumber(i - 1, i1 + i2, i1)
    }
}
