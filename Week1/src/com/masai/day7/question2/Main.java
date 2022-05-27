package question2;

public class Main {

	public static void main(String[] args) {

		Hosteller h1 = new Hosteller();
		h1.hostelFee = 500;

		DayScholar h2 = new DayScholar();
		h2.transportFee = 100;
		System.out.println(h1.payFee());
		System.out.println(h2.payFee());
	}

}
