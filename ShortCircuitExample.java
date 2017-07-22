package com.kgfsl.log4jtest.app;
//import java.util.*;
class ShortCircuitExample
{
    public static void main(String args[])
    {
        int a=0;
        int c=0;
        
        if(a == 1 && c++ == 3)
        System.out.println(a);
        else
        System.out.println(c);
    }
}