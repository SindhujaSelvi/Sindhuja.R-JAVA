import java.util.*;
 class Books
{
  public int id;
  public String name, author, publiser;
  public int quantity;
 
public Books setId(int id)
{
    this.id=id;
    return this;
}
/*public int getId()
{
    return id;
}*/
public Books setName(String name)
{
    this.name=name;
    return this;
}
/*public String getName()
{
    return name;
}*/
public Books setAuthor(String author)
{
    this.author=author;
    return this;
}
/*public String getAuthor()
{
    return author;
}*/
public Books setPubliser(String publiser)
{
    this.publiser=publiser;
    return this;
}
/*public String getPubliser()
{
    return publiser;
}*/
public Books setQuantity(int quantity)
{
    this.quantity=quantity;
    return this;
}
/*public Books getQuantity()
{
    return quantity;
    
}*/

//Override
public  Books1 getBook1()
 {
return new Books1(id,name,author,publiser,quantity);
}
}