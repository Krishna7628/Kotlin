package com.example.vamsi.kotlin.Learning.Part_5.FlowControl

fun main(args: Array<String>) {

    /* Break  */  //--> break loop
    for (i in 1..5) {  // o/p: 1  2
        if (i == 3) {
            break
        }
        println(i)
    }


    /*  Label Break */
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2)
                break@loop
        }
    }
    /*************************************************************************************************************/
    /* Continue*/ //--> Skip next steps

        for (i in 1..3) {
            println("i = $i")
            if (i == 2) {
                continue
            }
            println("this is below if")
        }


        labelname@ for (i in 1..3) {
            for (j in 1..3) {
                println("i = $i and j = $j")
                if (i == 2) {
                    continue@labelname
                }
                println("this is below if")
            }
        }

/******************************************************************************************************************/
    /*   Return  */

}



