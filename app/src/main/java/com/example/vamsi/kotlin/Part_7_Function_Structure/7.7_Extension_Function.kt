package com.example.vamsi.kotlin.Part_7_Function_Structure

/* Extension Functions: Adds new Function to the classes
    1. Can "add" functions to class without declaring it.
    2. the new functions added behaves like "static function similar to java.
 */


// Example : 1
fun main(args: Array<String>) {

    //Example --> 1
    val studentData = Student()
    println("Student pass : ${studentData.studentPassOrNOt(59)}")
    println("Student pass : ${studentData.scholarShip(59)}")


    // Example --> 2
    val str1 = " Hello "
    val str2 = " World "
    val str3 = " Hey "

    println(str3.add(str1,str2))

}

fun Student.scholarShip(marks: Int) : Boolean{    /* Extension Class  --> declare with Class dot function / method */
    return marks > 90
}

class Student{  // my own class
    fun studentPassOrNOt(marks: Int): Boolean {
        return marks > 40
    }
}


// Example : 2

private fun String.add(str1: String, str2: String): String {
return this+ str1 + str2
}