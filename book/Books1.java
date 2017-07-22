//package com.mycompany.app;

import java.util.*;

public class Books1
{
int id;
String name,author,publiser;
int quantity;

public Books1(){}

public Books1(int id,String name,String author,String publiser,int quantity)
{
   //super();
    this.id=id;
    this.name=name;
    this.author=author;
    this.publiser=publiser;
    this.quantity=quantity;
}

public String toString() {
return ("id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity);
}

public void create(){
    List<Books2> arraylist = new ArrayList<Books2>();
    arraylist.add(1);
     arraylist.add("swi");
    

//System.out.println("Created");
}
public void update(){
    System.out.println("Update");
}
public void retrieve(){

    System.out.println("Elements retrieved");
}
}