package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`


// Inheritance with primary and secondary constructor

fun main(args: Array<String>) {

    DogClass("Black", "labar")
    CatClass("grey", 12)
}


open class AnimalClass(var color: String = "White") { // super Class --> primary constructor with default value
    init {
        println("color of a animal is $color")
    }
}

class DogClass(color: String, var breed: String) : AnimalClass(color) { // inheritance with primary constructor

    init {   // initialization
        println("dog color is $color and breed is $breed")
    }

}

class CatClass(color: String, var age: Int) : AnimalClass(color) {  // inheritance with primary constructor
    init {       // initialization
        println("cat color is $color and age is $age")
    }
}