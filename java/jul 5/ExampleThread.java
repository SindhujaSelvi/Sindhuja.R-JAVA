class ExampleThread extends Thread{
    
   public void run()
    {
  System.out.println("hai");
    }
public static void main(String args[])
{
           for(int i=0;i<5;i++)
        {
            ExampleThread ex1 = new ExampleThread();
             ex1.start();
             System.out.println("hello");
            System.out.println(Thread.currentThread().getName());
        }
      
//ExampleThread ex2= new ExampleThread();
//ex2.start();
}

}