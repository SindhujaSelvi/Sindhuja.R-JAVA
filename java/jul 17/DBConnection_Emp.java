package com.kgfsl.log4jtest.app;
import java.sql.Connection;
import java.sql.DriverManager;

//import com.mysql.jdbc.Statement;

//import java.sql.*;

public class DBConnection_Emp {

    static Connection conn = null;

  private DBConnection_Emp() {
   }

    public static Connection getDBConnection() {

        try {
            if (conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_details", "root", "");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
