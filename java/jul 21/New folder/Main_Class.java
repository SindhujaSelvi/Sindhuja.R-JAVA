package com.kgfsl.log4jtest.app;

import java.util.*;

public class Main_Class
{
    public static void main(String args[])
    {
       List<District> districtlist1 = new ArrayList<District>();
       District district1 = new District("Erode");
       District district2 = new District("Salem");
       District district3 = new District("Namakkal");
       districtlist1.add(district1);
       districtlist1.add(district2);
       districtlist1.add(district3);
       List<District> districtlist2 = new ArrayList<District>();
       District district4 = new District("ranikunda");
       District district5 = new District("kadappa");
       districtlist2.add(district4);
       districtlist2.add(district5);

//List<State> statelist = new ArrayList<State>();
       List<List<District>> statelist = new ArrayList<List<District>>();
       State state1 = new State("tamilnadu",districtlist1);
       State state2 = new State("kerala",districtlist2);
       statelist.add(state1);
       statelist.add(state2);
       //List<List<District>> statelist = Arrays.asList(state1, state2);



       //List<Country> countrylist = new ArrayList<Country>();
       List<List<List<District>>> countrylist = new ArrayList<List<List<District>>>();
       Country country1=new Country("India",statelist);
       //Country country2=new Country("pakistan",statelist);
       countrylist.add(country1);
       //countrylist.add(country2);

 
       
       

    }
}