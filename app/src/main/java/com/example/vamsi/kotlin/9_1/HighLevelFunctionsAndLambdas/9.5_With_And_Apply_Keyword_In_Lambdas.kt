package com.example.vamsi.kotlin.`9_1`.HighLevelFunctionsAndLambdas

fun main(args : Array<String>){

    val data = Data()
        data.age = 18
        data.name = "ram"


        //Using with keyword
        with(data){ //--- with is a part kotlin standrd library but nt kotlin
            name = "vamsi"
            age = 24
        }

    // Apply
    data.apply {    // returns a recevier and we can cal any method in data class.
        name = "shan"
        age = 64
    }.startRun()


    println(data.age)
    println(data.name)

}

class Data {

    var name: String = ""
    var age : Int = -1

    fun startRun(){

    }
}
