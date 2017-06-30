class finally
{
    // A method that throws an exception and has finally. 
    
   // void method1()
  //      static void  A()
    public static void main(String args[])
    {
        System.out.println("1111");
    }
    void method1()
    {
        try
        {
            System.out.println("inside A");
            throw new RuntimeException("demo");
        }
        finally
        {
            System.out.println("A's finally");
        }
    }
   
}