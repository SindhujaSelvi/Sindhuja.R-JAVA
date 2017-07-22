package com.kgfsl.log4jtest.app;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.lang.*;
import java.util.stream.*;
//import java.util.Date;
 import java.text.DateFormatSymbols;
 import java.lang.IllegalArgumentException;
 import java.sql.Date;
class Main
{
public static void main(String[] args)throws ParseException {
 List<Team> team = new ArrayList<Team>();

Team t1 = new Team(001,"developing");
Team t2 = new Team(001,"developing");

team.add(t1);
team.add(t2);

List<Integer> tid1 = team.stream().map(Team::getTeamid).collect(Collectors.toList());

Project p1 = new Project(1,"ntrust",tid1);

List<Project> pro=new ArrayList<Project>();
pro.add(p1);
List<Integer> proid = pro.stream().map(Project::getProjectid).collect(Collectors.toList());

// Instantiate a Date object by invoking its constructor

String dt_1="2015-03-31";  
    Date date1=Date.valueOf(dt_1);
    String dt_2="2015-03-31";
    System.out.println(date1);   
    Date date2=Date.valueOf(dt_2);
    String dt_3="2015-03-31";
    System.out.println(date2);   
    Date date3=Date.valueOf(dt_3);
    System.out.println(date3); 
    String dt_4="2015-03-31";  
    Date date4=Date.valueOf(dt_4);
    System.out.println(date4); 
    String dt_5="2015-03-31";  
    Date date5=Date.valueOf(dt_5);
    System.out.println(date5); 
    String dt_6="2015-03-31";  
    Date date6=Date.valueOf(dt_6);  
    System.out.println(date6); 
/*SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
Date dt_1 =objSDF.parse("20-03-1981");
 Date dt_2 = objSDF.parse("10-08-1981");
 Date dt_3 = objSDF.parse("20-08-1995");
 Date dt_4 = objSDF.parse("9-11-1981");
 Date dt_5 = objSDF.parse("20-11-1981");
 Date dt_6 = objSDF.parse("20-08-1981");
 System.out.println("date");*/
 //System.out.println(dt_1);
//Month m = dt_1.getMonth();

//LocalDate currentDate = LocalDate.now(); // 2016-06-17
//int dom = currentDate.getDayOfMonth(); 
//System.out.println(dom);
//String[] monthString = new DateFormatSymbols().getMonths()[month-1];
 //DateFormatSymbols dfs = new DateFormatSymbols();
 //int[] months = objSDF.getMonthValue();
 
//System.out.println("Date1 : " + objSDF.format(dt_1));
    
Employee e1 = new Employee(1,"vani","developing",date1,"vani@gmail.com",60000,3);
Employee e2 = new Employee(2,"subi","testing",date2,"subi@gmail.com",20000,8);
Employee e3 = new Employee(3,"switha","developing",date3,"swi@gmail.com",10000,8);
Employee e4 = new Employee(4,"saritha","testing",date4,"sar@gmail.com",90000,11);
Employee e5 = new Employee(5,"sindhuja","developing",date5,"sindhu@gmail.com",40000,11);
Employee e6 = new Employee(6,"sugan","testing",date6,"sugan@gmail.com",50000,8);
//String[] month={new SimpleDateFormat("mm").format(e1.getDoj()};
 //System.out.println(n);
List<Employee> emp=new ArrayList<Employee>();
emp.add(e1);
emp.add(e2);
emp.add(e3);
emp.add(e4);
emp.add(e5);
emp.add(e6);
List<String> n=new ArrayList<String>();

List<Integer> empid = emp.stream().map(Employee::getId).collect(Collectors.toList());
//List<Integer> tid1 = team.stream().map(Team::getTeamid).collect(Collectors.toList());
//List<Employee> l3=emp.stream().filter((p->p.getDoj().getDayOfMonth()==1)).collect(Collectors.toList());
//System.out.println(l3);
//.collect(Collectors.toList());
ProjectEmployee pe = new ProjectEmployee(empid,proid);

System.out.println(pe.getEid());
System.out.println("all employees details");
for(Employee ee : emp)
{
System.out.println(ee);
}
System.out.println("employees per team");

List<Employee> l1=emp.stream().filter(s->s.getTeam()=="developing").collect(Collectors.toList());
        l1.stream().forEach(System.out::println);

        System.out.println("top 5 employees highest salary");
        List<Employee> l2 = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).collect(Collectors.toList());
		l2.forEach(System.out::println);
        System.out.println("print for particular month");
        List<Employee> l4=emp.stream().filter(s->s.getMonth()==11).collect(Collectors.toList());
        l4.stream().forEach(System.out::println);
        System.out.println("range wise ");
List<Employee> l5=emp.stream().filter(s->s.getSalary()>50000 && s.getSalary()<=90000).collect(Collectors.toList());
        l5.stream().forEach(System.out::println);



      }
}
