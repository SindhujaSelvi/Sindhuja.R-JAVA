package com.kgfsl.log4jtest.app;

import java.util.*;

public class Country
{ 
    private String countryname;
    private List<List<District>> state; 
private List<List<List<District>>> district;
Country(String countryname, List<List<District>> state)
    {
        this.countryname = countryname;
        this.state = state;
    }
    public String toString()
    {
        return "Country: " +countryname+ "State: " +state+ "District: " +district;
    }
}