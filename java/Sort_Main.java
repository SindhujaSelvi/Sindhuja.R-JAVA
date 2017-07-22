package com.kgfsl.log4jtest.app;
//import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
//import java.util.Optional;
class Sort_Main
{
    public static void main(String[] args) {
                List<Sort_POJO> persons=Arrays.asList(new Sort_POJO("ani",21),new Sort_POJO("vani",18),new Sort_POJO("vani",99),new Sort_POJO("azar",11));
    List<Sort_POJO> slist = persons.stream().sorted(Comparator.comparing(Sort_POJO::getName)).collect(Collectors.toList());
		slist.forEach(System.out::println);

    }}