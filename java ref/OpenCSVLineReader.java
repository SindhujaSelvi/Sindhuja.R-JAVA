//package com.kgfsl.opencsvapp;

import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

public class OpenCSVLineReader {
public static void main(String[] args) throws IOException {
CSVReader reader = new CSVReader(new FileReader("emps.csv"), ',');

String[] row = null;
// Looping reader
while ((row = reader.readNext()) != null) {
System.out.println(row[0] + " # " + row[1] + " # " + row[2]+ " # " + row[3]);
}
}
}