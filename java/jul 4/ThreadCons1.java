class ThreadCons1 extends Thread
{
    String name;
    ThreadCons1(String name){
        this.name = name;
        System.out.println(name);
        System.out.println("Constructor called...");
    }
    public void run()
    {
        System.out.println("Running");
    }
    public static void main(String args[])
    {



        ThreadCons1 t1 = new ThreadCons1("ss");
        ThreadCons1 t2 = new ThreadCons1("sv");

        t1.start();
        t2.start();
    }
} 