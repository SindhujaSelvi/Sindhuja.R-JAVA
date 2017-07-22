package com.kgfsl.log4jtest.app;
import java.sql.*;

//import utility.DBConnection;

public class DBConnection_Emp1 {

    public static void main(String[] args) {
        

        try {
            Connection conn = DBConnection_Emp.getDBConnection();
            //String query = "select project.EmpName,team1.EmpName from project LEFT JOIN team1 ON project.EmpName=team1.EmpName";
            //String query1="select * from project LEFT JOIN team1 ON project.EmpName=team1.EmpName WHERE project.teamId=team1.teamId";
//String query = "SELECT Name FROM employee WHERE DOJ BETWEEN '2017/03/03' AND '2017/05/03'";
//String query = "select Name from employee ORDER BY  salary desc limit 3";
           String query = "select Name from employee where salary>10000 AND salary<25300"; 
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
        // ResultSet resultSet1 = statement.executeQuery(query1);


            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
//System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5)+" "+resultSet.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}