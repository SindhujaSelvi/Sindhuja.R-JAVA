public class ThreadCons2 implements Runnable
{
    String name;
    ThreadCons2(String name)
    {
        this.name = name;
        System.out.println(name);
    }
    public void run()
    {
        System.out.println("Running...");
    }
    public static void main(String[] args) {
        ThreadCons2 t1 = new ThreadCons2("ss");
        ThreadCons2 t2 = new ThreadCons2("sv");
        Thread r1=new Thread(t1);
        Thread r2=new Thread(t2);
        
        r1.start();
        r2.start();
    }
}