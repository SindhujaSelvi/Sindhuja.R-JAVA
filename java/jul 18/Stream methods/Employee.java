package com.kgfsl.log4jtest.app;
import java.util.*;

public class Employee
{
    private int empId;
   private String name;
   private String team;
   private Date DOJ;
   private String email;
   private int salary;
//Employee()
//{}
  Employee(int empId,String name,String team,Date DOJ,String email,int salary)
   {
       this.empId=empId;
       this.name = name;
       this.team = team;
       this.DOJ = DOJ;
       this.email = email;
       this.salary = salary;
   }   
   /*public void setEmpId(int empId)
   {
       this.empId=empId;
   }*/
   public int getEmpId()
   {
       return empId;
   }
/*public void setName(String name)
   {
       this.name = name;
   }*/
   public String getName()
   {
       return name;
   }
/*public void setTeam(String team)
   {
       this.team = team;
   }*/
   public String getTeam()
   {
       return team;
   }
/*public void setDOJ(Date DOJ)
   {
       this.DOJ = DOJ;
   }*/
   public Date getDOJ()
   {
       return DOJ;
   }
   /*public void setEmail(String email)
   {
       this.email = email;
   }*/
   public String getEmail()
   {
       return email;
   }
   /*public void setSalary(int salary)
   {
       this.salary = salary;
   }*/
   public int getSalary()
   {
       return salary;
   }
public String toString()
{
    return "EmpId: "+ empId +"Name: "+ name +"Team: "+ team + "DOJ: "+ DOJ +"Email: "+ email +"Salary: "+salary;
}

}