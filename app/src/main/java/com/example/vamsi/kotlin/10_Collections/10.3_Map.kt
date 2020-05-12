package com.example.vamsi.kotlin.`10_Collections`

import android.os.Build

/*-------------------------------------------> Map <------------------------ */

    fun main(args : Array<String>){
         //Map --> key,value pair
        // mapOf --> Immutable in nature, fixed sized, read onl operation possible
        var myMap = mapOf<Int, String>( 1 to "samba", 2 to "laxmi", 3 to "johny", 4 to "vamsi")

        for (key in myMap.keys){
            println(myMap.getValue(key))
            //or
            println(myMap[key])
        }

    // Mutable Map --> read and write operation possible, no fixed size
    // HashMap, hashMapOf, mutableMapOf( mutableMapOf returns linkedHashMap)

        val maps = HashMap<Int, String>()
        maps.put(4, "aa")
        maps.put(3,"bb")
        maps.put(5,"vvv")

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            maps.replace(4, "bbb")
        } // replacing
        //or
        maps.put(4,"xxx")
    }