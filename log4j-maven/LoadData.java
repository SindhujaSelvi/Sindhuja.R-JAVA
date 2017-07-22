package com.kgfsl.log4jtest.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class LoadData {
public static void main(String[] args) throws Exception {
String filename = "emps.csv";
String tablename = "student";
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
// Load the data
String qry = "LOAD DATA LOCAL INFILE '" + filename + "' INTO TABLE " + tablename + " FIELDS TERMINATED BY ','"
+ " LINES TERMINATED BY '\n'";
Statement stmt = connection.createStatement();
stmt.execute(qry);
}
}
