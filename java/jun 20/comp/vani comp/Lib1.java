import java.util.*;
public class Lib1
{
    String name;
    Book books;
    Lib1(String name,Book books)
    {
        this.name=name;
        this.books=books;
    }
   /*public String getname()
    {
        return name;
    }
    public List<Book> getbooks()
    {
        return books;
    }*/
    public String toString()
    {  
  return name+" "+books;  
    }

}