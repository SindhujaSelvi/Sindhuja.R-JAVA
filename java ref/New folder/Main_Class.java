package com.kgfsl.log4jtest.app;

import java.util.*;

public class Main_Class
{
    public static void main(String args[])
    {
        List<Department_Class> departmentlist = new ArrayList<Department_Class>();
        
        Department_Class cse = new Department_Class("CSE",1314);
        Department_Class ece = new Department_Class("ECE",1312);
        Department_Class it = new Department_Class("IT",1313);
        
        List<Student_Class> studentlist = new ArrayList<Student_Class>();

        Student_Class stud1 = new Student_Class("Switha",1314238,cse);
    }
}