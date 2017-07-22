package com.kgfsl.log4jtest;
import java.io.IOException;
//import com.opencsv.CSVReader;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.CSVReader;
/*import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import java.sql.*;
import java.util.*;


//import com.journaldev.csv.model.Employee;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import org.omg.CORBA.StringSeqHelper;*/


/*import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;*/

class OpenCSVParse2BeanColumnPositionMapping {
        static String query = "INSERT INTO firstdatabase.table2 ('id','name', 'age','country') VALUES ";
        //static PreparedStatement state=null;

public static void main(String[] args) throws IOException,SQLException {
        

CSVReader reader = new CSVReader(new FileReader("csvfile1.csv"), ',');

ColumnPositionMappingStrategy<Employee> beanStrategy = new ColumnPositionMappingStrategy<Employee>();
beanStrategy.setType(Employee.class);
beanStrategy.setColumnMapping(new String[] { "id", "name", "age", "country" });

CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();

List<Employee> emps = csvToBean.parse(beanStrategy, reader);

System.out.println(emps);

        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","");

        for (Employee e : emps) {
        query += "(\"" + e.id+ "\", \"" + e.name + "\", \"" + e.age + "\",\""+e.country +"\"), ";
}
        Statement state=conn.createStatement();

        state.execute(query);
        
        reader.close();
        
        //state.executeUpdate(query);


}
}
