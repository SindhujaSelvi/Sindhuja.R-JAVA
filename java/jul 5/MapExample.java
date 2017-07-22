import java.util.*;
class MapExample
{
    public static void main(String args[])
    {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(101,"switha");
        map.put(102,"chinnasamy");
        System.out.println(map);
        //TO SET THE ENTRIES
        Set set = map.entrySet();
        //to continuously print the output
        Iterator i = set.iterator();
        while(i.hashNext())
        {
            
        }
    }
}