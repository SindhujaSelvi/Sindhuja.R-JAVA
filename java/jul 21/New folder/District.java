package com.kgfsl.log4jtest.app;

import java.util.*;

public class District
{
    private String districtname;
    District(String districtname)
    {
        this.districtname = districtname;
    }
    public String getDistrictname()
    {
        return districtname;
    }
    public String toString()
    {
        return "Districts: " +districtname;
        }
} 