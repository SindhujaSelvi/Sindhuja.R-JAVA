import java.util.*;
public class Student
{ public int id;
    public String name;
    public Student(int id,String name)
    {
         this.id=id;
         this.name=name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName() 
    {
        return name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public  int getId()
    {
        return id;
    }
}