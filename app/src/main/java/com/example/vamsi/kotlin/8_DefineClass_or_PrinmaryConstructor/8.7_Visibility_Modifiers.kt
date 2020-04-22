package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`

/* Visibility Modifiers :
*           1. public --- > can be used any were
*           2. protected --> can be used by its child class
*           3. private -- > can't used other
*           4. internal --> can used by module
* */


class Hello{
    // A,d   --> can be use
    // b,c -- > can't be use


    val person = Person()
    fun tester(){
        person.a
        person.d
    }
}


open class Person{
    val a = 10
    private val b = 22
    protected val c = 33
    internal val d = 44
}



class Indian : Person(){
    // A,c,d   --> can be use
    // b -- > can't be use

    fun test(){
        //println(b) --> cant be used
    }

}
