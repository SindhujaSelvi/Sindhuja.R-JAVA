import java.util.*;
class ObjectCreation
{
     ObjectCreation()
  {
      int y=1+9;
      System.out.println(y);
  }

    void addition()
    { int x=2+3;
System.out.println(x);
}
public static void main(String args[])throws Exception
{
//using normal new() method
ObjectCreation obj1=new ObjectCreation();
obj1.addition();
//using new instance()
ObjectCreation obj2= ObjectCreation.class.newInstance();
obj2.addition();
//using constructor
ObjectCreation obj3= constructor.newInstance();
obj3.addition();
}


}