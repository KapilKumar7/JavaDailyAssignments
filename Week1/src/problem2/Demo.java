package problem2;

public class Demo {
static	String s="String";
static int i=5;
static float f =20;
	
	Demo(){
		this(s);
		System.out.println("Inside Demo()");
		
		
	};
	
	Demo(String s){
		this(i);
		System.out.println("Inside Demo(String s)"+s);
			
		}
	Demo(int i){
		this(f);
		System.out.println("Inside Demo(int i)" +i);
		
	}
	Demo(float f){
		System.out.println("Inside Demo(float f)"+f);
		
	}

	

	public static void main(String[] args) {
		
		Demo c1 = new Demo();
		

	}

}
