package demo.main;

import demo.beans.HelloWorld;
import demo.beans.HelloWorldEn;
import demo.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorld hello1 = new HelloWorldEn();
		
		callMethod(hello1);
		
		HelloWorld hello2 = new HelloWorldKo();
		
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
