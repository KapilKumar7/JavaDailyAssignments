package question1;

public class Demo {

	public static void main(String[] args) {
		ZImpl z1 = new ZImpl();
		z1.sayHelloX();
		z1.sayHelloY();
		z1.sayHelloZ();
		System.out.println("===========================");

		z1.sayDefaultX();
		z1.sayDefaultY();
		System.out.println("===========================");

		X.sayStaticX();
		Y.sayStaticY();

	}

}
