package com.kgfsl.log4jtest.app;

import java.util.*;

public class Student_Class
{
    private String sname;
    private int regno;
    private Department_Class dept;
    Student_Class(String sname,int regno,Department_Class dept)
    {
        this.sname = sname;
        this.regno = regno;
        this.dept = dept;
    }
    public String getSname()
    {
        return sname;
    }
    public int getRegno()
    {
        return regno;
    }
    public Department_Class getDept()
    {
        return dept;
    }
    public String toString()
    {
        return "StudentName: " +sname+ "RegisterNumber: " +regno+ "Department: " +dept;
    }
} 