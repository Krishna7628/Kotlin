package com.example.vamsi.kotlin.Part_7_Function_Structure

/* infix function can be a member function or Extension function
    1. they have single parameters
    2. they have prefix with : "Infix"

    ** All Infix function are extension function but  all extension function are not infix function
 */

fun main(args: Array<String>) {

    val x = 10
    val y = 20

    print("Greatest Value: " + x.greatestNumber(y))  // the benefit  of infix we can call it in simple  form ---> x greaterNumber y

}

infix fun Int.greatestNumber(y: Int): Int {
    val c = if (this > y) {
        this
    } else {
        y
    }
    return c
}