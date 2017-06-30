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

public class Para2Test {


public int arg1;


public Para2Test(int p1) {

arg1 = p1;

}


public Boolean actual;
@Parameters

public static Collection<Object[]> data() {

Object[][] data = new Object[][] { { 11 }, { 5 }, { 7 } };

return Arrays.asList(data);

}
Prime p = new Prime();
@Test
public void parmeterisedConstructorprimenumTest() {

actual = p.primenum(arg1);

assertEquals("Test Result", true , actual);

}


}


