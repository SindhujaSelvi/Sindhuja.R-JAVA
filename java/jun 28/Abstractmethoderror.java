import java.util.*;
 /*public abstract class AbsClass {
    public abstract void hello();
 }*/
class AbsClass {


    public void hello() {
     System.out.println("Hello! I belong to AbsClass");

    }
}

public class Abstractmethoderror extends AbsClass {
    public static void main(String[] args) {
      Abstractmethoderror obj = new Abstractmethoderror();
        obj.hello();
  }

}
