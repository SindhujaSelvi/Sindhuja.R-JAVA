import java.util.*;
class CompositionTest
{
    public static void main(String args[])
    {
        Books book1 = new Books("Fairytales","Disney");
         Books book2 = new Books("Fairy","Disdffd");
         List<Books> book3=new ArrayList<Books>();
         book3.add(book1);
         book3.add(book2);
        Library library = new Library("abc",book3);
       


        System.out.println(library);

    }
}