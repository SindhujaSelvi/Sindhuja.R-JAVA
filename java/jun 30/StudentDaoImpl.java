import java.util.*;
public class StudentDaoImpl implements StudentDao
{ //public int id;
    //public String name;    
    List <Student> list ;
    public StudentDaoImpl()
    {
        list = new ArrayList<Student>();
        Student stu1 = new Student(10,"Sindhu");
        Student stu2 = new Student(11,"Swi");
        list.add(stu1);
        list.add(stu2);
        System.out.println(list);
    }
public void update(Student s)
    {
      if(s.getId()==1)

         System.out.println("StudentDetails" +id+ "" +name );
         //return name;
    }
   /* public List<Student> delete(Student list)
    {
        if(id==1)
        {
            return id;
        }
        else{
            return 0;
        }
    }*/
public List<Student> getAll()
{
    System.out.println("No of students");
    //System.out.println(list);
    return list;
}

}