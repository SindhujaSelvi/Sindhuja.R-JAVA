import java.util.*;
//package com.mycompany.app;

public class Book
{
  public int id;
  String name;
  String author;
  String publiser;
  int quantity;
 /* public Book(int id,String name,String author,String publiser,int quantity)
{
    this.id=id;
    this.name=name;
    this.author=author;
    this.publiser=publiser;
    this.quantity=quantity;
}*/
public void setId(int id)
{
    this.id=id;
}
public int getId()
{
    return id;
}
public void setname(String name)
{
    this.name=name;
}
public String getname()
{
    return name;
}
public void setauthor(String author)
{
    this.author=author;
}
public String getnauthor()
{
    return author;
}
public void setpubliser(String publiser)
{
    this.publiser=publiser;
}
public String getpubliser()
{
    return publiser;
}
public void setquantity(int quantity)
{
    this.quantity=quantity;
}
public int getquantity()
{
    return quantity;
}

//Override
public String toString() {
return "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity;
}
}