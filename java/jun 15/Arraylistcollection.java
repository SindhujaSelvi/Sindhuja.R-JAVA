import java.util.*;
class Arraylistcollection
{
    public static void main(String args[])
    {
        //Create first arraylist
        ArrayList <String> object1 = new ArrayList <String>();
        object1.add("Switha");
        object1.add("Chinnasamy");
        System.out.println(object1);
        //Create second arraylist
        ArrayList <String> object2 = new ArrayList <String>();
        object2.add("Mohanapriya");
        object2.add("Perumal");
        System.out.println(object2);

        //Adding or combining two arraylists
        object1.addAll(object2);
        System.out.println("After combining");
        System.out.println(object1);
    }
}