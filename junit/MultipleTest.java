package com.mycompany.app;


import static org.junit.Assert.assertEquals;


import java.util.Arrays;

import java.util.Collection;


import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameter;

import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class MultipleTest
{
 @Parameter(0)
 public int arg1;
 @Parameter(1)
 public int arg2;

 @Parameter(2)
 public int expected;
 public int actual;

 @Parameters
 public static Collection <Object[]> data() {
 Object[][] data=new Object[][]{{1,2,2},{4,4,16}};
 return Arrays.asList(data);
 }


 Man c=new Man();
 @Test
 public void MultipleTest()
 {

 actual=c.multiplication(arg1,arg2);
 assertEquals("Test Result", expected, actual);
 }
}