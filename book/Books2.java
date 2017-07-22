//package com.mycompany.app;

import java.util.*;

public class Books2
{
  public int id;
  public String name, author, publiser;
  public int quantity;
 
public Books2 setId(int id)
{
    this.id=id;
    return this;
}
/*public int getId()
{
    return id;
}*/
public Books2 setName(String name)
{
    this.name=name;
    return this;
}
/*public String getName()
{
    return name;
}*/
public Books2 setAuthor(String author)
{
    this.author=author;
    return this;
}
/*public String getAuthor()
{
    return author;
}*/
public Books2 setPubliser(String publiser)
{
    this.publiser=publiser;
    return this;
}
/*public String getPubliser()
{
    return publiser;
}*/
public Books2 setQuantity(int quantity)
{
    this.quantity=quantity;
    return this;
}
/*public Books2 getQuantity()
{
    return quantity;
    
}*/

//Override
public  Books1 getBook1()
 {
return new Books1(id,name,author,publiser,quantity);
}
}