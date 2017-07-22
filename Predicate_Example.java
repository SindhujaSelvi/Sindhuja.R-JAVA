package com.kgfsl.log4jtest.app;
import java.util.function.Predicate;

public class Predicate_Example
{
   static Boolean method1(int a)
   {
      if(a>1200)
      return true;
      else
      return false;
   }
    public static void main(String args[]){
    Predicate<Integer> predicate= Predicate_Example::method1;
    boolean ans=predicate.test(10000);
    System.out.println(ans);
   } 
}