class Student extends ref
{
String name;
int rollno;
int age;

public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

public void displayName()
{
System.out.println(getName());
}

public String toString()
{
    return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
}
}

class ref
{
public static void main(String args[])
{
Student std=new Student();
std.name=false;
std.displayName();
Student std1=new Student();
std1.name=true;
std1.displayName();
System.out.println(std);
}
}