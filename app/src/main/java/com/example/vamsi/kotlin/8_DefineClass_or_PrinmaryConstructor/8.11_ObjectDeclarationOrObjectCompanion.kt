package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`

/*   Object Declarations --> Alternative Static in java
*
*           Singleton : when we have just one instance of a class in the whole application
*               -> Meaning : if class "Student" is declared singleton then we cannot create objects for this class
*                       --> there exists only one object for this class by default
*                       --> And we cannot create objects like student1, student2 etc
*                  --> In java, we define Singleton, by using keyword "static" variables and methods
*                  --> In kotlin, we can't declare "static" variables and methods
*                           So, we have alternative to that
*                               -> declare " Object"
*                               -> this creates a "Singleton" object when program runs
*
* Conclusion:
*       -> When we use keyword 'object'
*           > kotlin internally, creates a class and an object / instance
*       -> These objects
*           > can have properties, methods, and initializers
*           > can't have constructors
*                   > as we cannot create object / instance manually
*           > "object" can also have super class
*                   > supports inheritance
* */


fun main(args: Array<String>) {


    CustomerData.count = 90
    println(CustomerData.count)
    println(CustomerData.typeOfFCustomer())

    CustomerData.count = 220
    println(CustomerData.count)
    println(CustomerData.typeOfFCustomer())
    CustomerData.myMethod("Hello")

/////////////// Object Companion
    MyClass.count =30
    println(MyClass.count)
    print(MyClass.typeOfCustomers())

}


object CustomerData : MySuperClass() {   // we create instance variable foe object CustomerData and it also treated as Singleton at compile it creates the instance of an object

    var count: Int = -1                       // Behave like static variable

    fun typeOfFCustomer(): String {            // Behave like static methods
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
    }
}

open class MySuperClass {

    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}


/******************************************* Object companion ********************************************* */



class MyClass{           // In Object we can call with class name

    companion object{

        var count : Int = -1                 // behaves like static variable

        @JvmStatic  // for to use in java file we need declare annotations
        fun typeOfCustomers() : String{      // behaves like static method
            return "myClass"
        }
    }
}