package problem1;

public class StudentObect {

	public static void main(String[] args) {
		
//parameterized constructor
		Student s1 = new Student(21,"Shivam" , 25, 90);
	    System.out.println("Details of s1 student using parameterized constructor");
		System.out.println();
        System.out.println("Roll : "+s1.getRoll());
        System.out.println("Name : "+s1.getName());
        System.out.println("Age : "+s1.getAge());
        System.out.println("Marks : "+s1.getMarks());
		
//Object using zero-argument constructor
         Student s2 =new Student();
         s2.setRoll(22);
         s2.setName("Ratan");
         s2.setAge(28);
         s2.setMarks(96);
         
         
		 System.out.println();      
         System.out.println("Details of s2 student using zero-argument constructor");
         System.out.println("Roll : "+s2.getRoll());
         System.out.println("Name : "+s2.getName());
         System.out.println("Age : "+s2.getAge());
         System.out.println("Marks : "+s2.getMarks());
	}

}
