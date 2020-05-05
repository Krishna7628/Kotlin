package com.example.vamsi.kotlin.`10_Collections`

/* ----------------------------- List --------------------------------------
*
*       -> Immutable : listOf  ----------> only we can read out
*       -> Mutable :  arrayListOf, ArrayList, mutableListOf
* */


fun main(args: Array<String>) {

    var list = listOf<String>("samba", "laxmi", "johny", "vamsi")                // Immutable, fixed size, read only operations allowed

    for (elements in list) {
        print(elements)
    }

    for (index in 0..list.size - 1) {
        println(list.get(index))
    }


    val list1 = mutableListOf<String>()        // mutable in nature, size can be increase and we can add, remove, replace
    list1.add("aaa")                           // mutableListOf, ArrayList, arrayListOf are same(mutable in nature, size can be increase, remove, replace
    list1.add("bbb")
    list1.add("ccc")

    list1.removeAt(1)
    list1.add(1, "zzz") // replacing particular index
    // or
    list1[1] = "xxx"  // replacing particular index

    for (elements in list1) {
        println(elements)
    }
}