package com.example.vamsi.kotlin.Learning.Funactions

/* First Example */
//fun main(ags: Array<String>) {
//    val name : String = "hello"
//     println(name)
//}


/* Second Example */
//fun main(ags: Array<String>) {
//    val name : String = "hello"
//     display(name)
//}

//fun display(name: String) {
//    println(name+" World")
//}

/* third Example */
//fun main(ags: Array<String>) {
//    val name: String = "hello"
//    var person = Person();
//        person.display(name)
//}

//class Person {
//    fun display(name: String) {
//        println(name + " World")
//    }
//}

/* four Example */
//fun main(ags: Array<String>) {
//    var person = Person();
//     person.name = "hey! Ram"
//        person.display(person.name)
//}

//class Person {
//      var name: String = ""
//    fun display(name: String) {
//        println(name)
//    }
//}



/* five Example */   /********** Interpolation ********/
fun main(ags: Array<String>) {
    val person = Person()
    person.name = "hey! Ram"
    println(person.name)
    //or
    println("Name is" + person.name)
    //or
    println("Name is -->${person.name}")                    /********** Interpolation ********/
}

class Person {
    var name: String = ""
}