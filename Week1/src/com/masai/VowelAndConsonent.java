package com.masai;

public class VowelAndConsonent {
	
	void vowelAndConsonent(char x){
	String alp="aeiouAEIOUbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
	  boolean flag =true;
	 for(int i=0;i<alp.length();i++) {
		 if(i>=0 && i<10 && alp.charAt(i)==x) {
			 
			System.out.println("Character is vowel");
			flag=false;
			break;
			
		 }else if(i>=10 && alp.charAt(i)==x) {
			 System.out.println("Character is consonant");
			 flag=false;
			break; 
		 }
	 }
	 if(flag)	 System.out.println("Invalid character");
	 
	}

	public static void main(String[] args) {
		
		VowelAndConsonent d1 =new VowelAndConsonent();
		
		d1.vowelAndConsonent('E');
		d1.vowelAndConsonent('s');
		d1.vowelAndConsonent('4');
	
		

	}

}
