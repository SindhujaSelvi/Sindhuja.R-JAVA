
interface Walk {
 public String walk();
}

abstract class Animal implements Walk {
 abstract String MakeNoise();
}    

class cat extends Animal{
 public String MakeNoise()
 {
 System.out.println("Meow");
 return "meow";
 }
 public String walk()
 {
 System.out.println("CAT IS WALKING");
 return  "WALKING";
 }

}
class dog extends Animal{
 public String MakeNoise()
 {
 System.out.println("Bark");
 return "bark";
 }
 public String walk()
{
 System.out.println("DOG WALKING");
 return "DOG WALKING";
}
}
class MainClass
{
 public static void main(String args[])
 {
 Animal w=new dog(); 
 w.MakeNoise();

 }
}