package com.kgfsl.log4jtest;
import java.util.*;
import java.lang.*;
public class Book
{
    private String bookid;
    private String bookname;
    private String authorname;
    private String price;

    public Book setId(String id)
    {
        this.bookid=id;
        return this;
    }
     
     public Book setName(String name)
    {
        this.bookname=name;
        return this;
    }
     
     public Book setAname(String aname)
    {
        this.authorname=aname;
        return this;
    }
     
     public Book setPrice(String price)
    {
        this.price=price;
        return this;
    }

   public String toString()
    {
        return "id: "+ bookid + "bname: "+ bookname +"aname: "+ authorname +"price: "+ price;
    }
    
}