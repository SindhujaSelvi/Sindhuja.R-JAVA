public class Greeter2 {
public void greet(Greeting greeting){
	greeting.say();
}


public static void main(String[] args) {
	Greeter2 greeter=new Greeter2();
	HelloGreeting helloGreeting=new HelloGreeting();
	greeter.greet(helloGreeting);
	
	myLambda myLambdaFunction=()->System.out.println("Hello World from Java Lambda !");
	myLambdaFunction.sayHello();
}
}



interface myLambda {
	void sayHello();
}
