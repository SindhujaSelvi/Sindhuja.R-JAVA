package com.kgfsl.log4jtest.app;

//import java.util.*;
public class StreamMethods{
    private String name;
    private int id,salary;
    StreamMethods(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
   public String getName()
   {
       return name;
   }
   public int getId(){
       return id;
   }
   public int getSalary()
   {
       return salary;
   }
   public String toString(){
       return "Name:" +name+ "Id:" +id+ "Salary" +salary;
   }
}