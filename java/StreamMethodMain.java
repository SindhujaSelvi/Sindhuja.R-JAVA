package com.kgfsl.log4jtest.app;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamMethodMain {
    public static void main(String args[]) {
        List<StreamMethods> list = new ArrayList<StreamMethods>();
        list.add(new StreamMethods("Mohana", 001, 10000));
        list.add(new StreamMethods("Mona", 002, 8000));
        list.add(new StreamMethods("Priya", 003, 90000));
        list.add(new StreamMethods("Sona", 004, 5000));
        System.out.println("sorting....");
        List<StreamMethods> list1 = list.stream().sorted(Comparator.comparing(StreamMethods::getSalary).reversed()).collect(Collectors.toList());
        list1.forEach(l -> System.out.println("Name:" + l.getName() + "Id:" + l.getId() + "Salary:" + l.getSalary()));
    //list1.forEach(System.out::println);
      
        
    }
}