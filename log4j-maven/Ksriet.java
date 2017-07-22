package com.kgfsl.log4jtest.app;
import java.util.*;
public class Ksriet implements College
{
//int no_of_students;
    //int no_of_depts;
    String principal_name;
    public Ksriet(String principal_name)
    {
        this.principal_name=principal_name;
        //this.no_of_students=no_of_students;
//this.no_of_depts=no_of_depts;
    }
    public String toString()
    {
        return "Principal_name:" +principal_name;
    }
}