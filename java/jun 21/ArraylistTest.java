import java.util.*;
class ArraylistTest
{
    public static void main(String args[])
    {
        List<String> arrlist=new ArrayList<String>();
        arrlist.add("Chinnasamy");
        arrlist.add("Parimaladevi");
        arrlist.add("Switha");
        arrlist.add("Kiritharan");
        System.out.println(arrlist);
        String[] array=new String[5];
        array=arrlist.toArray(array);
        //array=arrlist.toArray();
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}