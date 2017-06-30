package com.mycompany.app;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;
import java.util.Collection;
@RunWith(Parameterized.class)
public class ParamterPassingTest
{

    //assign
  // @Parameter(0)
    public int x;
   // @Parameter(1)
    public int y;
  //  @Parameter(2)
    public int expected;
   
 public int actual;
public ParamterPassingTest(int x,int y,int expected)
{
this.x=x;
this.y=y;
this.expected=expected;
}   
 @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }
    ParamterPassing p=new ParamterPassing();
    //action
    @Test
    public void methodTest()
    {
        actual=p.method(x,y);
        assertEquals("TestResult",expected,actual);
    }

}