package com.example.vamsi.kotlin.Learning

fun main(args : Array<String>){
    val myName = "Ram Krishna"  // Base on value the data type is fixed by compiler
    val myNumber = 10           // int type
    val MyDecimal = 1.0         // float type

    println(myName)
    println(myNumber)
    println(MyDecimal)


    val myNameIs : String               //Mutable mean can be change
    myNameIs = "Krishna"

    println(myNameIs)

    val amyAnotherStr = "My Constant String Value" // Constant value --> Immutable in nature (Immutable means can not be changed)

println(amyAnotherStr)

    // three ways we can declare
    val name = "Ram Krishna"
    val nameto = "hello"
    val nameOfAPersion ="ram krishna"
        println(name)
    println(nameto)
    println(nameOfAPersion)

}