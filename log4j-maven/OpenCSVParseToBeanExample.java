package com.kgfsl.log4jtest.app;
//package com.kgfsl.log4jtest;


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

public class OpenCSVParseToBeanExample {

	public static void main(String[] args) throws IOException {
		
		CSVReader reader = new CSVReader(new FileReader("D://swisindhu//log4jtest//src//main//emps.csv"), ',');
		
		ColumnPositionMappingStrategy<Employee> beanStrategy = new ColumnPositionMappingStrategy<Employee>();
		beanStrategy.setType(Employee.class);
		beanStrategy.setColumnMapping(new String[] {"id","name","age","country"});
		
		CsvToBean <Employee> csvToBean = new CsvToBean<Employee>();
		
		List <Employee> emps = csvToBean.parse(beanStrategy, reader);
		
		System.out.println(emps);
		
      
         for (Employee em : emps) 
		 {
         try 
		{
		String sql;
        Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");


        //sql = INSERT INTO stud (id,name,college,dept) VALUES ("+e.getid(0)+"");
        sql = "INSERT INTO `employee` (`id`,`name`, `age`, `country`) VALUES (\"" + em.getId() + "\", \""
        + em.getName() + "\", \"" + em.getAge() + "\", \"" + em.getCountry() + "\");";
      		Statement st = con.createStatement();
            st.executeUpdate(sql);
			
		} catch (Exception e) {
			//TODO: handle exception
		}
		}
		reader.close();
	}
}
