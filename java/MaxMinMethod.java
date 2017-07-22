package com.kgfsl.log4jtest.app;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

class MaxMinMethod
{
    public static void main(String[] args) {
       List<Person> persons=Arrays.asList(new Person("ani",21),new Person("arifa",18),new Person("vani",99),new Person("azar",11));
        persons.stream().max(Comparator.comparing(Person::getName)).ifPresent(p->System.out.println("sort by alphabet order person max"+p));
        persons.stream().min(Comparator.comparing(Person::getName)).ifPresent(s->System.out.println("sort by alphabet order person min "+s));
    }
}