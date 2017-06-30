class AggregationTest
{
    public static void main(String args[])
    {
        Department department=new Department("CSE");
        Student student=new Student("Swi",33,department);
        
        //student.toString();
        System.out.println(student);
        System.out.println(student.roll_no);
        System.out.println(student.dept_name);
        //System.out.println(student.dept_name);
        //department.toString();
        System.out.println(department);
    }
}