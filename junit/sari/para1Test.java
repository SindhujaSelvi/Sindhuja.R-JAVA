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

public class para1Test {

@Parameter(0)

public int arg1;

@Parameter(1)

public Boolean expected;

public Boolean actual;
@Parameters

public static Collection<Object[]> data() {

Object[][] data = new Object[][] { { 11, true }, { 5, true }, { 9, false } };

return Arrays.asList(data);

}
Prime p = new Prime();


@Test

public void parmeterisedprimenumTest() {

actual = p.primenum(arg1);

assertEquals("Test Result", expected, actual);

}

}