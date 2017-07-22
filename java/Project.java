package com.kgfsl.log4jtest.app;
public class Project
{
    private int projectId;
    private int teamId;
    private String empName;
    Team team;
    Employee employee;
    Project(int projectId, int teamId, String empName)
    {
        this.projectId = projectId;
        this.teamId = team.getTeamId();
        this.empName = employee.getName();
    }
    public int getProjectId()
    {
        return projectId;
    
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
        return "ProjectId: "+projectId+ "TeamId: "+teamId+"EmployeeName: "+empName;
    }
}