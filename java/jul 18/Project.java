package com.kgfsl.log4jtest.app;
import java.util.*;
public class Project {
private int projectid;
private String name;
private List<Integer> tid;
//List<Integer> idList = students.stream().map(Student::getId).collect(Collectors.toList());
Project(int projectid,String name,List<Integer> tid)
{
    this.projectid=projectid;
    this.name=name;
    this.tid=tid;
}
public int getProjectid()
{
    return projectid;
}
public String getName()
{
    return name;
}
public List<Integer> getTid()
{
    return tid;
}
public String toString()
{
    return "Projectid: "+projectid+" Name: "+name+ "Tid:" +tid;   
}
}