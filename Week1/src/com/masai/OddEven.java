package com.masai;

public class OddEven {
	
	void oddEven(int x) {
		if(x<0) System.out.println("Error");
	    else if(x%2==1) System.out.println(x);
		else System.out.println(10+ (int)(Math.ceil(x/10))*10);
		
	}

	public static void main(String[] args) {
		
		OddEven d1 = new OddEven();
		d1.oddEven(46);

	}

}
