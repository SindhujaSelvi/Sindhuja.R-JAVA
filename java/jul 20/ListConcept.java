package com.kgfsl.log4jtest.app;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;


class ListConcept
{
public static void main(String[] args) {
List<String> tamilnadu=new ArrayList<String>();
tamilnadu.add("Erode");
tamilnadu.add("Salem");
tamilnadu.add("Coimbatore");
List<String> antra=new ArrayList<String>();
antra.add("ranikunda");
antra.add("kadappa");
List<String> kerala=new ArrayList<String>();
kerala.add("palaikadu");
kerala.add("ernakulam");
List<List<String>> india=new ArrayList<List<String>>();
india.add(tamilnadu);
india.add(antra);
india.add(kerala);
List<List<List<String>>> country=new ArrayList<List<List<String>>>();
country.add(india);

List<String> newyork=new ArrayList<String>();
newyork.add("dis1");
newyork.add("dis2");
newyork.add("Coimbatore");
List<String> washington=new ArrayList<String>();
washington.add("usdis1");
washington.add("usdis2");
List<String> california=new ArrayList<String>();
california.add("caldis1");
california.add("caldis");
List<List<String>> usa=new ArrayList<List<String>>();
usa.add(newyork);
usa.add(washington);
usa.add(california);

country.add(usa);
List<List<String>> s=country.stream().filter(str->str==india).flatMap(str->str.stream()).collect(Collectors.toList());//filter(str->str==tamilnadu).
System.out.println(s);
/*for (List<String> each : s) {
each.forEach(System.out::println);
}*/

}
}