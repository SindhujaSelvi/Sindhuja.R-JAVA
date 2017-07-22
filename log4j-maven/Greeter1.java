public void greet(action){
	action();
}


//Function as value

public void say() {
		System.out.println("Hello World");
		
	}
	
aBlockOfCode=public void say() {
		System.out.println("Hello World");
		
	}	

Lambda Expression

aBlockOfCode=() {
		System.out.println("Hello World");
		
	}	

	
aBlockOfCode=() -> {
		System.out.println("Hello World");
		
	}	


aBlockOfCode=() -> System.out.println("Hello World");

greet(greetingFunction);

public void greet(____){
_____
}


greet(() -> System.out.println("Hello World"););

public void greet(____){
_____
}


doubleNumberFunction=public int double(int a){
return a * 2;
}

doubleNumberFunction=(int a) -> a * 2;

addFunction = (int a, int b) -> a+b;

divideFunction = (int a, int b) -> {
if (b==0) return 0;
};

stringLength=(String s) -> s.length();


package javalambada;

public class Greeter1 {
public void greet(Greeting greeting){
	greeting.say();
}


public static void main(String[] args) {
	Greeter1 greeter=new Greeter1();
	HelloGreeting helloGreeting=new HelloGreeting();
	greeter.greet(helloGreeting);
	
	myLambda myLambdaFunction=()->System.out.println("Hello World from Java Lambda !");
	myLambdaFunction.sayHello();
}
}
