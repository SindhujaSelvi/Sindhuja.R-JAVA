package com.kgfsl.log4jtest.app;
import java.sql.*;
import java.util.*;
public class Connectioncsv
{
public static void main(String[] args) {
  /*Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(
//here sonoo is database name, root is username and password.
Statement stmt=con.createStatement();*/
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from stud");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}                  

