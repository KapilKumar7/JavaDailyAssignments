package problem3;

public class Demo {


public static void main(String[] args) {
	
	
  Student s2=Student.getStudent(true);
    s2.setRoll(29);
    s2.setNameString("Arjun");
    s2.setAddress("Delhi");
    s2.setCollageName("",true);
	System.out.println("Roll: "+s2.roll);
	System.out.println("Name :"+s2.nameString);
	System.out.println("Adress: "+s2.address);
	System.out.println("Collage: "+s2.collageName);
}


}
