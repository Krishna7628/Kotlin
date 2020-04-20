package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`



/*
Secondary constructor :
 1. we can use secondary constructor as a short cut like primary constructor like (var name : String)
 2. secondary constructor call after the initialization of init block
*/


fun main(args: Array<String>){
    Student1("Vamsi", 12)
}

class Student1(var name: String) { // ---> primary constructor
    var id : Int = -1
    init {  // initialing variables
         println("Name of a Student : $name and $id")  // o/p : vamsi and -1
    }

    constructor(name: String, id: Int) : this(name) { // secondary constructor
        // body
        this.id = id
        print(id) // o/p : 12
    }
}
