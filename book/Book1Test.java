package com.mycompany.app;

import org.junit.Test;
import com.mycompany.app.Books1;

public class Book1Test{

Books1 book=new Books1();

@Test
public void createBooks(){
Books1 p1 = new Books2().setId(1).setAuthor("Author").setPubliser("Publiser").setQuantity(1).setName("C#").getBook1();
System.out.println(p1);
}
@Test
public void testmethod1(){

    book.create();
    System.out.println("testmehod1");
}

@Test
public void testmethod2(){
    book.update();
    System.out.println("testmehod2");

}
}