package com.kgfsl.log4jtest.app;
public class Team
{
 private int teamId;
 Employee employee;
 private String empName;
 Team(int teamId,String empName)
 {
     this.teamId = teamId;
     this.empName = employee.getName();
 }
 public int getTeamId()
 {
     return teamId;
 }
 public String getEmpName()
 {
     return empName;
 }
public String toString()
{
    return "TeamId: "+teamId+ "EmployeeName: "+empName;
}
}