interface Car
{
    String car_color="White";
    void price();
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
 void price(int Price)
 {
   this.price=Price;
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
        System.out.println(pricecalculation);
    }
}