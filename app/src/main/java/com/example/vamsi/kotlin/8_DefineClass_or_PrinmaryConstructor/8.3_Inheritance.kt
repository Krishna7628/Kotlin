package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`

/*
 By Default classes are : public and as well final
    --> To inheritance you need to make a class 'open'

Inheritance : in kotlin is a mechanism in which one object acquires all the properties from its parent class object.

Types of inheritance :
    1. single  B --> A -- > Any
    2. MultiLevel  C --> B --> A -- > Any
    3. Hierarchial  C,B -- > A

   # Super Class --> 'Any'
        "Any" class contains functions such as :
            -> equals() : boolean
            -> hashcode() : int
            - > toString() : String

:> Advantage :
    1. Code reusability
    2. Method Overriding.
*/


fun main(args : Array<String>){

    val dog = Dog()
    dog.bread = "labra"
    dog.color = "black"
    dog.eat()
    dog.brak()

    val cat = Cat()
    cat.age = 12
    cat.eat()
    cat.meow()

    val animal = Animal()
    animal.eat()
    animal.color = "White"

}


open class Animal{
   open var color : String ="White"
    open fun eat(){
        println("animal eating")
    }
}

class Dog: Animal(){ // inherit the animal class
    var bread : String = ""
    fun brak(){
        println("dog is barking")
    }

    override fun eat() {       // overriding function
//        super.eat()
        println("dog is eating")
    }

    override var color : String ="black"

}

class Cat: Animal(){ // inherit the animal class, implement any other class as well the how to difference state override method
    var age : Int = -1
    fun meow(){
        println("Meow")
    }

    override fun eat() {               // overriding
        super<Animal>.eat()
//        super<OtherClass>.eat() if we are overriding from any other class.
        println("cat is eating")
    }
}








