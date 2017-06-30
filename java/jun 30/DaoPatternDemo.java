import java.util.*;
class DaoPatternDemo
{
    public static void main(String[] args) {
//Student stu=new Student(10, "swisindhu");
             StudentDao simpl=new StudentDaoImpl();
//simpl.update(list);
//simpl.delete(list); 
             simpl.getAll();

    }
}