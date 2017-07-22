package com.kgfsl.log4jtest.app;
public class Team
{
 private int teamId;
 //Employee employee;
 private Employee empName;
 Team(int teamId,Employee employee)
 {
     this.teamId = teamId;
     this.empName = employee.getName();
 }
 public int getTeamId()
 {
     return teamId;
 }
 public Employee getEmpName()
 {
     return empName;
 }
public String toString()
{
    return "TeamId: "+teamId+ "EmployeeName: "+empName;
}
}