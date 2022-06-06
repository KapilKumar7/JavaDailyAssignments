package question1;

public interface Y {

	void sayHelloY();

	default void sayDefaultY() {
		System.out.println("Hi from interface y from default method not overridden in Zimp ");

	}

	static void sayStaticY() {
		System.out.println("Hi from interface y from Static method ");

	}

}
