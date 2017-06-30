import java.util.*;
public interface StudentDao
{
    public List<Student> getAll();
    public void update(Student list);
    public void delete(Student list);
}