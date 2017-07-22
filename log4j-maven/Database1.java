package com.kgfsl.log4jtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Database1 {

    public static void main(String args[])throws SQLException{
String filename="csvfile.csv";
String tablename="table1";

Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","");
Statement state=conn.createStatement();

String qry = "LOAD DATA LOCAL INFILE '" + filename + "' INTO TABLE " + tablename + " FIELDS TERMINATED BY ','"
             + " LINES TERMINATED BY '\n'";
state.execute(qry);
}
}
