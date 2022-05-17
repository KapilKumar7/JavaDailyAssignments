package com.masai;

//import java.util.Scanner;

public class PrimeFactorial {
	 static void  primeFactorial (int n){
			if(n>=2 && n<=100 ) {
				for(int i=1;i<=n;i++) {
					if(n%i==0) System.out.println(i);
					
				}
			}else System.out.println("“Invalid number”");
			

			
		}

	public static void main(String[] args) {

	 primeFactorial(110);

	}
				
	

}
