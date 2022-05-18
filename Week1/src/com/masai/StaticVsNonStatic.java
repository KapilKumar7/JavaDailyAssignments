package com.masai;

//NonStatic Variables-are those variables which can't be accessed by our RAM whithout creating the object for their class.Example in line 6 we have make the non-static 
//age variable ,and as we try access this variable in main method in line 11 ,it cant be be accessed there because we can't make a reference to non-static variable there
//So we make object in line 13 ,and accessed the age variable in line 14. So non-static variables are specific to instance object in which they are created.

//Static-variables-A static variable acts as a global variable and is shared among all the objects of the class and can be accessble from everywhere in main method also.
//Example myAge variable declare in line 12.  

public class StaticVsNonStatic {
	int age = 30;
	static int myAge=25;
	
	
	public static void main(String[] args) {
//		System.out.println(age);
		StaticVsNonStatic d1 =new StaticVsNonStatic();
		System.out.println(d1.age);
		System.out.println(myAge);
		
	}

}
