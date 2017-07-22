import java.util.*;

public interface mona{
   public void method1(String name) ;    
}
public class Mona implements mona{
    public static void main(String args[]){
        mona m=()->{
            System.out.println(name);
        };
        m.method1("MonaSwi");
    }
}