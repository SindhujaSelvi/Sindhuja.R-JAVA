package com.kgfsl.log4jtest.app;

import java.util.*;

public class Department_Class
{
    private String dname;
    private int id;
    private List<Student_Class> stud;
    Department_Class(String dname, int id, List<Student_Class> stud)
    {
         this.dname = dname;
         this.id = id;
         this.stud = stud;
    }
    public String getDname()
    {
        return dname;
    }
    public int getId()
    {
        return id;
    }
    public List<Student_Class> getStud()
    {
        return stud;
    }
    public String toString()
    {
        return "DepartmentName: " +dname+ "DepartmentId: " +id+ "Student_Details: " +stud;
    }
    
}