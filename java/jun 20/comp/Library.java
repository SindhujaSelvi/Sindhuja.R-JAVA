import java.util.*;
class Library
{
    String lib_name;
   // Books book_name;
   //Books author_name;
    List<Books> book;
    Library( String lib_name,List<Books> book)
    {
        this.lib_name=lib_name;
        this.book=book;
    }
    public String toString()
    {
        //return book_name+ " " +author_name;
        return lib_name+" "+book;
    }
    
}