package com.kgfsl.log4jtest.app;
import org.apache.log4j.Logger;
/*import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.SimpleLayout;*/
public class Sample
{
    static Logger l = Logger.getLogger(Sample.class);
    public static void main(String args[])
    {
       // Appender a;
      //  Layout l1 = new SimpleLayout();
       // a = new FileAppender(l1,"logging.log", false);
        method();
       // l.addAppender(a);
        l.debug("Debug message");
        l.info("Info");
        l.warn("Warn");
        l.fatal("Fatal");
        l.error("Error message");
        
    
        System.out.println("Successfull..");
    }
    
   static public void method()
    {
        
        try {int num = 4/0;
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
            l.error(e.getMessage());
           
        }

    }
}