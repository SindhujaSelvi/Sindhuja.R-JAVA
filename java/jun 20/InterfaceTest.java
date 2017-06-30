interface Car
{
    String car_color="White";
    abstract void price(int Price);
}
class PriceCalculation implements Car
{
    String name;
    int mileage;
    int price;
    void setName(String Name, int Mileage)
    {
        this.name=Name;
        this.mileage=Mileage;
    }
public void price(int Price)
 {
   this.price=Price;
   System.out.println("Class called");
 }
 public String toString()
 {
     return name+ " " +mileage+ " " +car_color+ " " +price;
 }
}
class InterfaceTest
{
    public static void main(String args[])
    {
        PriceCalculation pricecalculation = new PriceCalculation();
        pricecalculation.setName("Tata",55);
        pricecalculation.price(1200000);
       //System.out.println(pricecalculation.name);
       //System.out.println(pricecalculation.mileage);
       //System.out.println(pricecalculation.car_color);
       //System.out.println(pricecalculation.price);
       System.out.println(pricecalculation); 
       
    }
}