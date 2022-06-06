package question1;

public interface X {

	void sayHelloX();

	default void sayDefaultX() {
		System.out.println("Hi from interface X from default method ");

	}

	static void sayStaticX() {
		System.out.println("Hi from interface X from Static method ");

	}

}
