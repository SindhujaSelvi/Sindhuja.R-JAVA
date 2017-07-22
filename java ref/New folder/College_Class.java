package com.kgfsl.log4jtest.app;

import java.util.*;

public class College_Class
{
    private String cname;
    private List<Department_Class> dept;
    private List<Student_Class> stud;
    College_Class(String cname,List<Student_Class> stud,List<Department_Class> dept)
    {
         this.cname = cname;
         this.stud = stud;
         this.dept = dept;
    }
    public String getCname()
    {
        return cname;
    }
    public List<Student_Class> getStud()
    {
        return stud;
    }
    public List<Department_Class> getDept()
    {
        return dept;
    }
    public String toString()
    {
        return "CollegeName: " +cname+ "Student_Details: " +stud+ "Department_Details: " +dept;
    }
}