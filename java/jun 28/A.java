class A
{
  public  A()
    {
      
            System.out.println("inside AB");
          
     }
 public  A(int x)
    {
      
            System.out.println("inside A");
          
     }
    
 public static void main(String args[])
    {
         A a=new A();
        A a1=new A(8);
    }
    
   
}