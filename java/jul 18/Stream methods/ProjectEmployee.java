package com.kgfsl.log4jtest.app;
public class ProjectEmployee
{
    Employee employee;
    Project project;
    private int employeeId;
    private int projectId;
    ProjectEmployee(int employeeId,int projectId)
    {
        this.employeeId = employee.getEmpId();
        this.projectId = project.getProjectId();
    }
    public int getEmployeeId()
    {
        return employeeId;
    }
    public int getProjectId()
    {
        return projectId;
    }
    public String toString()
    {
        return "EmployeeId: "+employeeId+"ProjectId: "+projectId;
    }
}