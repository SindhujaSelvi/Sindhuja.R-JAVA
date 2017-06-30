import java.util.*;
public class Lib
{
    String name;
    List<Book> books;
    Lib(String name,List<Book> books)
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