import java.util.*;
public class ArraylistSample
{
    public static void main(String args[])
    {
    ArrayList <String> object = new ArrayList <String>();
    //To add element in arraylist
    object.add("Switha");
    object.add("Mona");
    object.add("Sindhu");
    object.add("Subi");
    System.out.println(object);
    //To add an element at particular index
    object.add(1,"Swi");
    System.out.println(object);
    //To remove an element
     object.remove("Subi");
    System.out.println(object);
    //To remove element from speciifed index
     object.remove(1);
     System.out.println(object);
     //To set or replace a element in the list
     object.set(1,"Mohana");
     System.out.println(object);
     //To get the index of an element
     int position=object.indexOf("Sindhu");
     System.out.println(position);
     //To return the object at specified index
     String str= object.get(2);
     System.out.println(str);
     //To get the length of arraylist
     int length=object.size();
     System.out.println(length);
     //To check the object presence
     if(object.contains("swi"))
     System.out.println("Present");
     else
     System.out.println("Absent");
     //To remove all the elements in the list
     object.clear();
     System.out.println(object);
    }
}