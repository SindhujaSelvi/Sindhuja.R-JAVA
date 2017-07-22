import java.util.*;
import java.io.*;

interface Greeting {
	public void say();
}
//package javalambada;
 class HelloGreeting implements Greeting{

	public void say() {
		System.out.println("Hello World");
		
	}

}

//package javalambada;

public class Greeter {
public void greet(Greeting greeting){
	greeting.say();
}

public static void main(String[] args) {
	Greeter greeter=new Greeter();
	HelloGreeting helloGreeting=new HelloGreeting();
	greeter.greet(helloGreeting);
}
}


