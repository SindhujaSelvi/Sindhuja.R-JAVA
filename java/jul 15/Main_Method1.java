package com.kgfsl.log4jtest.app;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Function;
public class Main_Method1
{
    public static void main(String args[])
    {
        List<Department> dept = Arrays.asList(
         new Department("cse",new Student(001,"swi","cse")), new Department("cse",new Student(002,"sari","cse"))
        );
    }
}