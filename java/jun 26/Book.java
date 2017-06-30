import java.util.*;
 class Books
{
  public int id;
  public String name, author, publiser;
  public int quantity;
 
public void setId(int id)
{
    this.id=id;
}
public int getId()
{
    return id;
}
public void setName(String name)
{
    this.name=name;
}
public String getName()
{
    return name;
}
public void setAuthor(String author)
{
    this.author=author;
}
public String getAuthor()
{
    return author;
}
public void setPubliser(String publiser)
{
    this.publiser=publiser;
}
public String getPubliser()
{
    return publiser;
}
public void setQuantity(int quantity)
{
    this.quantity=quantity;
}
public int getQuantity()
{
    return quantity;
}

//Override
public String toString() {
return "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity;
}
}