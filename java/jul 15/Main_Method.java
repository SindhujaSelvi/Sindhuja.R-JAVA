package com.kgfsl.log4jtest.app;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Function;
class Main_Method
{
public static void main(String[] args) {
 List<Student>students = new ArrayList<Student>();
  List<Student>students1 = new ArrayList<Student>();
  List<Student>students2 = new ArrayList<Student>();
 // List<Student>students3 = new ArrayList<Student>();

Student s5 = new Student(001,"Sindhu","cse");
Student s1 = new Student(001,"Sindhu","cse");
Student s3 = new Student(003,"Swi","cse");
Student s2 = new Student(002,"Saritha","it");
Student s4 = new Student(004,"Saritha","ece");
students.add(s1);
students.add(s3);
students.add(s5);
students1.add(s2);
students2.add(s4);
Department d1 = new Department("cse",students);
Department d2 = new Department("ece",students1);
Department d3 = new Department("it",students2);
List<Department> dept = new ArrayList<Department>();
dept.add(d1);
dept.add(d2);
dept.add(d3);

//Map<String, List<Department>> mapgrp =
	//		dept.stream().collect(Collectors.groupingBy(Department::getName));
Map<Department,Long> c=dept.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
      //  System.out.println(mapgrp);
    System.out.println(c);

//List<List<Student>> d=dept.stream().map(Department::getStudent).collect(Collectors.toList());
     // Long l=d.stream().filter(p->p.getStudent()).collect(Collectors.groupingBy(e->e,Collectors.counting()));
  //  d1.forEach(System.out::println);


      }
}
