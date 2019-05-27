package com.company;


public class FirstClass {
    @ReArgument(param1 = 7, param2 = 9)
    public static void sum(int a, int b)
    {
        System.out.println("sum = " + (a + b));
    }
}
