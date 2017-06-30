class Student
{
String student_name;
int roll_no;
Department dept_name;
Student(String student_name, int roll_no,Department dept_name)
{
    this.student_name=student_name;
    this.roll_no=roll_no;
    this.dept_name=dept_name;
}
public String toString()
{
    return student_name+ " " +roll_no+ " " +dept_name;
}
}
