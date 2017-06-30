package com.mycompany.app;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;
@RunWith(Parameterized.class)
public class ParameterconsTest
{
    //assign
    @Parameter(0)
    public int x;
    @Parameter(1)
    public int y;
    @Parameter(2)
    public int expected;
    public int actual;

    @Parameters
    public static Collection <Object[]> data(){
        Object[][] data=new Object[][]{{1,2,3},{2,2,4},{4,5,9}};
        return Arrays.asList(data);
    }
    ParamterPassing p=new ParamterPassing();
    @Test
    public void ParameterconsTest()
    {
      actual=p.method(x,y);
      assertEquals(expected,actual);
    }
    }

