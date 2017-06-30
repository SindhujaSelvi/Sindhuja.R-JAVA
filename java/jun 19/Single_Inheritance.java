class Single
{
String driver_name;
int car_no;
void car(String Driver_Name,int Car_No)
{
    this.driver_name=Driver_Name;
    this.car_no=Car_No;
}
}
class Single1 extends Single 
{
    //System.out.println("Switha");
    //System.out.println(switha);
    void display()
    {
    System.out.println(driver_name);
    System.out.println(car_no);
    }
}
class Single_Inheritance
{
    public static void main(String args[])
    {
    Single1 single1=new Single1();
    single1.car("Mona",123);
    single1.display();
    }
}