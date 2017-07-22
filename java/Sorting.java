package com.kgfsl.log4jtest.app;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class Sorting
{
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(4,5,2,7,9);
        System.out.println("Sorted order:" +list.stream().sorted().collect(Collectors.toList()));
    }
}