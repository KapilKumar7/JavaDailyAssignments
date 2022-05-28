package question4;

class Main {
	public static void main(String[] args) {

		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();
		for (Animal x : animals) {
			System.out.println();
			x.makeNoise();
			x.eat();
			x.walk();
		}
//create an array of Animal class with size 3
//initialize all 3 elements of this Animal class
//with //Dog, Cat and Tiger class object.
//call the all methods (eat,walk,makeNoise) from all
//the 3 objects.
	}
}

class Animal {
	public void makeNoise() {
		System.out.println("Animal making Noise");
	}

	public void eat() {
		System.out.println("Animal is eating");
	}

	public void walk() {
		System.out.println("Animal is walking");
	}
}

class Dog extends Animal {

	public void makeNoise() {
		System.out.println("Barking...");
	}

}

class Cat extends Animal {
	public void makeNoise() {
		System.out.println("Mew...");
	}
}

class Tiger extends Animal {
	public void makeNoise() {
		System.out.println("Roaring...");
	}

}