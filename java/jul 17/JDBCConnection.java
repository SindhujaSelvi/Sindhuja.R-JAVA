package com.kgfsl.log4jtest.app;
import java.sql.*;
public class JDBCConnection
{
    public static void main(String args[])
    {
        //Class.forName("com.mysql.jdbc.Driver");
        //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
        //Connection conn = DBConnection.getDBConnection();
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            
            String query="insert into Employee values (110,'bhuvaneshwari','DBL','2016-06-01','buvaneshwari.b@kggroup.com',100000)";
    
     Statement stmt=conn.createStatement();
     //ResultSet rs=stmt.executeQuery("select * from emp"); 
     stmt.executeUpdate(query); 
     System.out.println("executed succesfully"); 
     /*while(rs.next())  
     System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));  */
  //System.out.println("hii"); 
         
            
    } catch(Exception e) {
        System.out.println(e); 
            
    }
   try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee LEFT JOIN project_employee on employee.id=project_employee.id where team='NTRUST'"); 
     
     while(rs.next())  
     System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getInt(6)); 
      System.out.println("hii"); 
        conn.close(); 
            
    } catch (Exception e) {
        System.out.println(e); 
            
        }
     
    }
}