package Student;
import static org.junit.Assert.assertEquals;


import java.util.Arrays;

import java.util.Collection;


import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameter;

import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Param3Test {


public String arg1;


public Param3Test(String p1) {

arg1 = p1;

}


public String actual;
@Parameters

public static Collection<Object[]> data() {

Object[][] data = new Object[][] { { "hi" }, { "hi" }, { "hi" } };

return Arrays.asList(data);

}
Prime1 p = new Prime1();
@Test
public void parmeterisedConstructorprimenumTest() {

actual = p.primenum(arg1);

assertEquals("Test Result", "hi" , actual);

}


}


