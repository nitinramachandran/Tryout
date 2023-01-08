package com.nix.tryout.java8.lambda;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String...strings) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWordGreeting = new HelloWorldGreeting();
		greeter.greet(helloWordGreeting);
		
		
		TryLambda myLAmbdaFn = () -> System.out.println("");
		
		myLAmbdaFn.foo();
		
	}


}

interface TryLambda {
	void foo();
}
