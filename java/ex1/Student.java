class Student
{
String name;
int rollno;
int age;
boolean gradep=true;
boolean gradef=false;
boolean PASS,FAIL;
public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public void displayName(){
System.out.println(getName());
}

public String toString() {
    return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
}
public boolean result()
{
if(gradep && gradef)
return false;
else
return true;
}
public static void main(String args[])
{
Student std=new Student();
std.name="John";
std.rollno=01;
std.displayName();
std.result();
System.out.println(std);
}
}