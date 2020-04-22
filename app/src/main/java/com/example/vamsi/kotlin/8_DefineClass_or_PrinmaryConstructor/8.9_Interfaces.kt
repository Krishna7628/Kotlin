package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`

/* Interface :
*   1. interface can contains both normal methods and abstract methods
*   2. But they only contains abstract property
*   3. interface are not class
*   4. you cannot create instance of an interface similar to an abstract class*/


fun main(args: Array<String>) {
    val button = Button()
    button.Touch()
    button.OnClick()
    print(button.name)
}


interface FirstInterface {       // we can't create instance of interface or abstract class as well
    var name: String             // abstract method and properties should not have initial value and body for method, property by default abstract in nature.
    fun Touch()                  // In interface method without braces are by default Abstract in nature.

    fun OnClick() {               // normal method are public in nature by default but not final
        println("FirstInterface")
    }
}

interface SecondInterface {

    fun Touch() {
        println("Second Interface normal touch method")
    }

    fun OnClick() {
        println("Second Interface normal click method")
    }
}


class Button : FirstInterface, SecondInterface {
    override var name = "krishna"
    override fun Touch() {
        super.Touch()                           // call for secondInterface because of FirstInterface is a abstract. so it dnt have any body.
        println("override from FirstInterface")
    }

    override fun OnClick() {            // optional for overriding // but in case of impleementing two interface having same method name then we have to implement that mehtod as well
        super<FirstInterface>.OnClick()
        super<SecondInterface>.OnClick()
        println("override from FirstInterface by clicking")
    }
}