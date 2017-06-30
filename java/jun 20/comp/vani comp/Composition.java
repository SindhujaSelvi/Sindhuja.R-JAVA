import java.util.*;
class Composition
{
    public static void main(String args[])
    {
        Book b=new Book("c","vani");
        Book b1=new Book("java","vanitha");
        Book b2=new Book("PHP","vanitha.v");
        List<Book> boo=new ArrayList<Book>();
        boo.add(b);
        boo.add(b1);
        boo.add(b2);
        Lib l=new Lib("v",boo);
        System.out.println(l);
    }
}