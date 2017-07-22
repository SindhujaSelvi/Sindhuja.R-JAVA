package com.kgfsl.log4jtest.app;
import java.util.*;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.sql.Date;
public class StreamEmployee
{
    public static void main(String args[])
    {
    String dt_1="2015-03-31";  
    Date date1=Date.valueOf(dt_1);
    System.out.println(date1);
    String dt_2="2015-03-31";  
    Date date2=Date.valueOf(dt_2);
    System.out.println(date2);
    String dt_3="2015-03-31";  
    Date date3=Date.valueOf(dt_3);
    System.out.println(date3);
    
        //List for employee
        //Employee e=new Employee(01,"sindhu","dolphin",date1,"sindhu@gmail.com",1000);
        Employee e1=new Employee(01,"switha","doors",date2,"switha@gmail.com",2000);
        Employee e2=new Employee(02,"subi","release",date3,"subi@gmail.com",3000);
        
        List<Employee> employee=new ArrayList<Employee>();
        employee.add(e1);
        employee.add(e2);
        //System.out.println(employee);
        //List for team
        Team t1 = new Team(101,e1.getName());
        Team t2 = new Team(102,e2.getName());

        List<Team> team = new ArrayList<Team>();
        team.add(t1);
        team.add(t2);
        
        //List for Project
        Project p1 = new Project(201,t1.getTeamId(),e1.getName());
        Project p2 = new Project(202,t2.getTeamId(),e2.getName());

        List<Project> project = new ArrayList<Project>();
        project.add(p1);
        project.add(p2);

        //List for ProjectEmployee
        ProjectEmployee pe1 = new ProjectEmployee();
        ProjectEmployee pe2 = new ProjectEmployee();

        List<ProjectEmployee> project_employee = new ArrayList<ProjectEmployee>();
        project_employee.add(pe1);
        project_employee.add(pe2);

    }
} 