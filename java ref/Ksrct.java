//package com.kgfsl.log4jtest.app;
import java.util.*;
public class Ksrct implements College
{
    int no_of_students;
    int no_of_depts;
    String principal_name;
    public Ksrct(String principal_name, int no_of_students, int no_of_depts)
    {
        this.principal_name=principal_name;
        this.no_of_students=no_of_students;
        this.no_of_depts=no_of_depts;
    }
    public String toString()
    {
        return "Principal_name:" +principal_name+ "Number of students:" +no_of_students+ "Number of departments" +no_of_depts;
    }
}