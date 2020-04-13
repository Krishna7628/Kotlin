package com.example.vamsi.kotlin.Part_7_Function_Structure;

//7.3, 7.4, 7.5

/* Interoperability : -->
    1. you can call java functions from kotlin and kotlin functions from java.
    2. you can have java and kotlin in same package or different package
 */

public class JavaInteroperability {

    public static void main(String[] args) {

        /*  Default calling method */           // --> filename and Kt at last
        //        KotlinInteroperabilityKt.sumValue(3,3);

        /*  With custom file name declared in kotlin class at top */
                KotlinFile.sumValue(9,9);



                            /*  7.5 Default Function -- > using @JvmOverLoaded */
                    DefaultFunctionKt.addSumValues(4,7);

    }

    public static int addSum(int i, int i1) {
        return i + i1;
    }
}
