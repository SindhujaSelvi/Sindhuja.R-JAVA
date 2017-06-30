class AssociationTest
{
    public static void main(String args[])
    {
        Student stu =new Student("Switha");
        Marks mar=new Marks(100); 
        System.out.println("Mark of" +stu.student_name+ "is" +mar.marks);
    }
}