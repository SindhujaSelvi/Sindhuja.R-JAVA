
import java.util.*;
class Composition1
{
    public static void main(String args[])
    {
        Book b=new Book("c","vani");
        //Book b1=new Book("java","vanitha");
        //Book b2=new Book("PHP","vanitha.v");
        //List<Book> boo=new ArrayList<Book>();
        //boo.add(b);
        //boo.add(b1);
        //boo.add(b2);
        Lib1 l=new Lib1("v",b);
        System.out.println(l);
    }
}