package com.connectivity;
import java.io.FileReader;
import java.util.*;
import java.io.*;
import java.sql.*;
public class CsvFile
{
public static void main(String args[])
{
read();
upload();


}
static void upload()
{
Connection connection = DBConnection.getDBConnection();
try
{

String loadQuery = "LOAD DATA LOCAL INFILE '" + "D://swi//csvfile.csv" + "' INTO TABLE stu FIELDS TERMINATED BY ','" + " LINES TERMINATED BY '\n' (Name, Rollno, college,department) ";
System.out.println(loadQuery);

Statement stmt = connection.createStatement();

stmt.execute(loadQuery);
System.out.println("Upload successfully");

}

catch (Exception e)
{
e.printStackTrace();
}




}
static public void read()
{
try
{
Scanner scanner = new Scanner(new File("D://swi//csvfile.csv"));
scanner.useDelimiter(",");
while(scanner.hasNext()){
System.out.print(scanner.next()+"-");
}
scanner.close();
}
catch(Exception ex)
{
ex.printStackTrace();
}


}
}