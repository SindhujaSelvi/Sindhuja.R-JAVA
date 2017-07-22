package com.kgfsl.log4jtest.app;
public class Student {
private int rollno;
private String name;
private String department;
Student(int rollno,String name,String department)
{
    this.rollno=rollno;
    this.name=name;
    this.department=department;
}
public int getRollno()
{
    return rollno;
}
public String getName()
{
    return name;
}
public String getDepartment()
{
    return department;
}
public String toString()
{
    return "RollNo: "+rollno+" Name: "+name+ "Department:" +department;   
}
}



