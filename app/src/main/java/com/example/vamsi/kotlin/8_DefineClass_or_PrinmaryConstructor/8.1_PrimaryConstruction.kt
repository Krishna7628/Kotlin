package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`

/*
How to define a class in kotlin
        class Customer{
               --> class body
        }

How to define a primary constructor

        class Customer( name : String){  ---> eg of primary constructor and init block
            init {
                    -> initial variable
        }

        1. in java we have constructor block for initialing
        2. in kotlin we use init block for initialing.

----------------> In this <-----------------

property of field variables in java
primary constructor:
   1. init block
   2. primary constructor with property
   3. primary constructor with parameters
* */


fun main(args: Array<String>) {

    val student = Student("vamsi")  // ---> Default way
    student.name
    val customer = Customer("Krishna") // --> short cut
        customer.name
}

class Customer(var name: String) {  //---------> in short cut --
    init {
        print("name is $name")
    }
}


class Student(name: String) {                  //  primary constructor

    //Default constructor                      ---------> in short cut --> simple way is class Student(var name : String)
    var name: String = "krishna"

    init {
        this.name = name
        println("name : $name")
    }
}