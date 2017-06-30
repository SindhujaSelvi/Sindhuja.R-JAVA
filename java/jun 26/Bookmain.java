import java.util.*;
class Bookmain
{
public static void main(String args[])
{
Books1 books1 = new Books().setId(1).getBook1();
Books1 books2 = new Books().setId(2).getBook1();
/*books.setId(1);
books.getId();
books.setName("Novel");
books.getName();
books.setAuthor("Switha");
books.getAuthor();
books.setPubliser("xyz");
books.getPubliser();
books.setQuantity(10);
books.getQuantity();*/
System.out.println(books1);
System.out.println(books2);
}
}