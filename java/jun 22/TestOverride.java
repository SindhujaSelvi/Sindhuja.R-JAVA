class Animal{  
void eatSomething(){System.out.println("eating something");}  
}  
  
class Dog extends Animal{  
//@Override  // compilation error becoz the 
void eatSomething(){System.out.println("eating foods");}//should be eatSomething  
}  

class Cat extends Dog{  
//@Override  // compilation error becoz the 
void eatSomething(){System.out.println("eating fruits");}//should be eatSomething  
}  


class TestOverride{  
public static void main(String args[]){  
Animal a=new Dog();
Animal a1=new Cat();    
a.eatSomething();  
a1.eatSomething();  
}}  