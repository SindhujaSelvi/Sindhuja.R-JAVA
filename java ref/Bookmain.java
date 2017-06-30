import java.util.*;
class Bookmain
{
public static void main(String args[])
{
Books books = new Books();//setId(1).getBooks();
//Books1 books1 = new Books1;//setId(2).getBooks();
books.setId(1);
books.getId();
books.setName("Novel");
books.getName();
books.setAuthor("Switha");
books.getAuthor();
books.setPubliser("xyz");
books.getPubliser();
books.setQuantity(10);
books.getQuantity();
System.out.println(books);
//System.out.println(books1);
}
}