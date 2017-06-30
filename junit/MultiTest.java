package com.mycompany.app;
import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith (Parameterized.class)
 

public class MultiTest
{
    @Parameter(0)
    public int a1;
    @Parameter(1)
    public int b1;

    //public int expected;
    public int actual;
    /* public MultiTest (int a, int b) {
        this.a= a;
        this.b = b;
    }*/

    @Parameters
    public static Collection <Object[]> data() {
        Object[][] data=new Object[][]{{1,2},{34,45}};
        return Arrays.asList(data);
    }
 Multi m=new Multi();
    @Test
 public void MultiTest()
        {
            
            actual=m.method(a1,b1);
            assertEquals(actual,a1*b1);
        }
}
    
