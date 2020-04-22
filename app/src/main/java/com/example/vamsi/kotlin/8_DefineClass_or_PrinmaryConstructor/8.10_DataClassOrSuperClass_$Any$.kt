package com.example.vamsi.kotlin.`8_DefineClass_or_PrinmaryConstructor`

/*          Data Class or Super class --> "Any"
*           -->  "Any" class contains function such as
*                   1. equals () : boolean
*                   2. toString() : String
*                   3. hashCode() : Int
*
*           Kotlin creates copy too
*
*           Data class provides those mentioned methods
* */




fun main(args : Array<String>){

    val user1 = StudentDetails("vamsi", 10)
    val user2 = StudentDetails("vamsi", 10)


    print(user1) //   // we use data as prefix then we get StudentDetails(name = vamsi, id = 10) else give reference location.


    if(user1 == user2){  // we use data as prefix it give equal but in case no prefix befor class StudentDetails then it gives not equal
        println("Equal")
    }else{
        println("Not Equal")
    }
}


data class StudentDetails(var name : String, var id : Int){    // we use class data as prefix it give equal but in case no prefix befor class StudentDetails then it gives not equal

}