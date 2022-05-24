package problem3;

public class Student {
int roll;
String nameString;
String address;
String collageName;
public Student(int roll, String nameString, String address, String collageName) {
	super();
	this.roll = roll;
	this.nameString = nameString;
	this.address = address;
	this.collageName = collageName;
}
public Student(int roll, String nameString, String address) {
	super();
	this.roll = roll;
	this.nameString = nameString;
	this.address = address;
	this.collageName="NIT";
}



public void setAddress(String address) {
	this.address = address;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public void setNameString(String nameString) {
	this.nameString = nameString;
}
public void setCollageName(String collageName ,boolean isFromNIT) {
	if (isFromNIT) {
		this.collageName = "NIT";
	}
	else {
		this.collageName=collageName;
		
	}
}
public int getRoll() {
	return roll;
}
public String getNameString() {
	return nameString;
}
public String getAddress() {
	return address;
}public String getCollageName() {
	return collageName;
}


public static Student getStudent(boolean isFromNIT) {
	if(isFromNIT) {
		Student  s1 =new Student(21,"Ratan","UP");
		
		return s1;
		
	}else
	{
		Student s2 =new Student(2, "Kapil", "Haryana", "MDU ;Rohtak");
		return s2;
		
	}
}


}
