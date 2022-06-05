package question2;

public abstract class Student {

	public Student(String name, String address) {
		super();
		this.name = name;
		Address = address;
	}

	String name;
	String Address;

	abstract int getPercentage();

}

class ScienceStudent extends Student {

	public ScienceStudent(String name, String address) {
		super(name, address);

	}

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;

	@Override
	int getPercentage() {
		return (phisicsMarks + chemistryMarks + mathsMarks) / 3;

	}

}

class HistoryStudent extends Student {

	public HistoryStudent(String name, String address) {
		super(name, address);

	}

	int historyMarks;
	int civicsMarks;

	@Override
	int getPercentage() {
		return (historyMarks + civicsMarks) / 2;

	}
}
