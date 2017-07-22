package com.kgfsl.log4jtest.app;
import java.util.*;
import java.util.function.Predicate;
public class Predicate_MAIN_Ex1
{
    public static void main(String args[])
{
    Predicate_POJO_Ex1 p1 = new Predicate_POJO_Ex1("sindhu",001);
    Predicate_POJO_Ex1 p2 = new Predicate_POJO_Ex1("gokul",002);
    List <Predicate_POJO_Ex1> list = new ArrayList<Predicate_POJO_Ex1>();
    //list.add(p1);
    list.addAll(Arrays.asList(new Predicate_POJO_Ex1[]{p1,p2}));
   // Predicate<Predicate_POJO_Ex1> predicate = Predicate_EXE_Ex1::checkDetails;
//boolean result = predicate.test(token_num);
  System.out.println();
}
}