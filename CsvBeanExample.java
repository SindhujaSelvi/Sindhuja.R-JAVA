package com.kgfsl.log4jtest.app;
//import com.kgfsl.log4jtest.Employee;
//import com.mycompany.app.Employee;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

//import com.journaldev.csv.model.Employee;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class CsvBeanExample
{
        public static void main(String args[]) throws IOException
    {
CSVReader reader=new CSVReader(new FileReader("D://swisindhu//log4jtest//src//main//emps.csv"), ',');
   ColumnPositionMappingStrategy <Employee> column = new ColumnPositionMappingStrategy <Employee>();
   column.setType(Employee.class);
column.setColumnMapping(new String[] {"id","name","age","country"});
   CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
   List<Employee> emps = csvToBean.parse(column,reader);
   System.out.println(emps);
   /*public static List<Employee> parseCSVWithHeader() {
	CSVReader reader = new CSVReader(new FileReader("D://swisindhu//log4jtest//src//main//emps.csv"), ',');
	
	HeaderColumnNameMappingStrategy<Employee> beanStrategy = new HeaderColumnNameMappingStrategy<Employee>();
	beanStrategy.setType(Employee.class);
	
	CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
	List<Employee> emps = csvToBean.parse(beanStrategy, reader);
	
	System.out.println(emps);
	reader.close();
	
	return emps;
}*/

    }
}