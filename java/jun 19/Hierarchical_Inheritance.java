class Hierarchical
{
    String driver_name;
    int car_no;
    String car_color;
    void car( String Driver_name,int Car_no)
    {
        this.driver_name=Driver_name;
        this.car_no=Car_no;
    }
     
    void car1(String Car_color)
    {
        this.car_color=Car_color;
    }
}
class Hierarchical1 extends Hierarchical
{
      void display()
    {
    System.out.println(car_color);
    }
}
class Hierarchical2 extends Hierarchical
{
    void display()
    {
        System.out.println(driver_name);
         System.out.println(car_no);
    }
}
class Hierarchical_Inheritance
{
    public static void main(String args[])
    {
        //Hierarchical multi=new Hierarchical();
         Hierarchical1 multi1=new Hierarchical1();
         multi1.car1("Red");
         multi1.display();
         Hierarchical2 multi2=new Hierarchical2();
         multi2.car("Switha",123);
         multi2.display();
    }
}