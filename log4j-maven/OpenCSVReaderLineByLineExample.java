package com.kgfsl.log4jtest;
//package com.journaldev.csv.opencsv.parser;


import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

//import com.journaldev.csv.model.Employee;
import com.opencsv.CSVReader;


/**
 * OpenCSV CSVReader Example, Read line by line
 * 
 * @author pankaj
 *
 */
public class OpenCSVReaderLineByLineExample {

	public static void main(String[] args) throws IOException {

		CSVReader reader = new CSVReader(new FileReader("D://swisindhu//log4jtest//src//main//emps.csv"), ',');

		List<Employee> emps = new ArrayList<Employee>();

		// read line by line
		String[] record = null;

		while ((record = reader.readNext()) != null) {
			Employee emp = new Employee();
			emp.setId(record[0]);
			emp.setName(record[1]);
			emp.setAge(record[2]);
			emp.setCountry(record[3]);
			emps.add(emp);
		}

		System.out.println(emps);
		
		reader.close();
	}

}