import java.util.*;
class LastindexDemo
{
    public static void main(String args[])
    {
        ArrayList <String> array = new ArrayList <String>();
        //To print the last index of a character
        array.add("swi");
        array.add("with");
        array.add("apple");
        array.add("the");
        array.add("her");
        array.add("apple");
        int lastindex= array.lastIndexOf("apple");
        System.out.println(lastindex);
        

    }
}