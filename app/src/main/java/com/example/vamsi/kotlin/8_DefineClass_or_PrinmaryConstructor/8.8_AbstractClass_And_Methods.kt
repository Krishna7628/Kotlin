package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`

/*Abstract Class, Methods, properties
*   1. Classes can be abstract in nature
*   2. The Role of abstract class is to just provide set of methods and properties
*   3. Abstract class are Partially defined class
*   4. abstract methods have no body when declared
*   5. abstract property cannot be initialized when declared
*   6. abstract class, method, and properties default open in nature with declare abstract keyword in prefix.
*
* Conclusion:
*   1. you cannot create instance / object of abstract class
*   2. you need to override abstract methods, properties, inside derived class or child class
*/


fun main(args : Array<String>){

}

abstract class PersonClass{             // we cn't create instance of PersonClass(cn't create val person  = PersonClass() )
    abstract val color : String         // abstract property and mehtod can be define but not initialize it
    val name = "vamsi"
    abstract fun eat()                  // abstract method should not contain any body and braces
    open fun getHeight(){}              // to inherit it should be open
    fun goToSchool(){                   // a normal function: public and final by nature
        //have a body
    }
}


class IndianClass : PersonClass(){

    override val color: String = "Black"
    override fun eat() {  // abstract method compulsory implemented in child class or derived class
        TODO("Not yet implemented")
    }

    override fun getHeight(){

    }
}