package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`

fun main(args: Array<String>) {

    DogClass2("Black", "labar")
}


open class AnimalClass2 {
    var color: String = ""

    constructor(color: String){
        this.color = color
        println("From Animal class : $color")
    }
}

class DogClass2 : AnimalClass2 {
    var breed: String = ""
    constructor(color: String, breed: String) : super(color)
    {
        this.breed = breed
        println("From DogClass $breed and color is $color")
    }
}


