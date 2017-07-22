package com.kgfsl.log4jtest;
import java.util.*;
 interface Mona1{
   public void method1() ;    
}
 class Mona {
    public static void main(String args[]){
        String name="Mona";
        Mona1 m=()->{
            System.out.println("Name"+name);
        };
        m.method1();
    }
}