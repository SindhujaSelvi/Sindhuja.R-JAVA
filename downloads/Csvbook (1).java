
package com.kgfsl.log4jtest;
import java.util.*;
import java.util.Random;
import java.io.*;
import java.lang.*;
//import java.io.IOException;
import com.opencsv.CSVReader;
public class Csvbook{
    public static void main(String[] args) throws IOException  {
        CSVReader c = new CSVReader(new FileReader("D://sarisindhu//log4jtest//src//main//java//com//kgfsl//log4jtest//stud.csv"),',');
        String[] s = null;
        List<Book> b = new ArrayList<Book>();
        while((s = c.readNext()) != null)
        {
        Book bobj = new Book();
       bobj.setId(s[0]);
       //bobj.setName(s[1]);
      // bobj.setAname(s[2]);
      // bobj.setPrice(s[3]);
        b.add(bobj);
    }
    System.out.println(b);
    c.close();
}
}