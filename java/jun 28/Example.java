import java.util.*;
import static java.lang.System.*;
class Example1
{
      int value=1;
     //System.out.println("output1:" + value);
  }

  class Example2 extends Example1


  {
      int value=2;
       //System.out.println("output2:" + value);
  } 


class Example 
{
    public static void main(String[] args) {
        Example1 example1= new Example1();
       // example2.method1();
     out.println(example1.value);
     example1 =new Example2();
     out.println(example1.value);
     
     
    }
}
