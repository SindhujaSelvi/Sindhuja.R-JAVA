class Multilevel
{
    String driver_name;
    int car_no;
    void car( String Driver_name,int Car_no)
    {
        this.driver_name=Driver_name;
        this.car_no=Car_no;
    }
    void display()
    {
        System.out.println(driver_name);
         System.out.println(car_no);
          //System.out.println(car_color);
    }
}
class Multilevel1 extends Multilevel
{
    String car_color;
    void car1(String Car_color)
    {
        this.car_color=Car_color;
    super.display();
    }

    
}
class Multilevel2 extends Multilevel1
{
    void display()
    {
        System.out.println(driver_name);
         System.out.println(car_no);
          System.out.println(car_color);
          
    }
    
}
class Multilevel_Inheritance
{
    public static void main(String args[])
    {
        Multilevel2 multi=new Multilevel2();
        multi. car("Switha",123);
        multi.car1("Red");
        multi.display();
        
    }
}