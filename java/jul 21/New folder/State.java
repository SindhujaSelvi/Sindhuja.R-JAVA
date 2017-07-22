package com.kgfsl.log4jtest.app;

import java.util.*;

public class State
{
    private String statename;
    private List<District> district;
    
    State(String statename, List<District> district)
    {
         this.statename = statename;
         this.district = district;
    }
    public String getStatename()
    {
        return statename;
    }
    
    public List<District> getDistrict()
    {
        return district;
    }

    public String toString()
    {
        return "States: " +statename+ "District: " +district;
    }
    
}