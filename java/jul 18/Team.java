package com.kgfsl.log4jtest.app;
public class Team {
public int teamid;
public String name;
Team(int teamid,String name)
{
    this.teamid=teamid;
    this.name=name;
}
public int getTeamid()
{
    return teamid;
}
public String getName()
{
    return name;
}

public String toString()
{
    return "Teamid: "+teamid+" Name: "+name;   
}
}