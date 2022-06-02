package question2;

import java.util.Scanner;

class Child extends Parent {
	public Child(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	void method1() {

		System.out.println("Enter a number: ");

	}

	void method4() {
		System.out.println("method4");
	}

	public static void main(String[] args) {
		System.out.println("Enter x: ");
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		Child c1 = new Child(x);
		c1.method1();
		c1.method3();
		c1.method4();

	}

}
