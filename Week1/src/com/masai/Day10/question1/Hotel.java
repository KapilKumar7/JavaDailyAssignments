package question1;

public interface Hotel {
	void chickenBiryani();

	void masalaDosa();

}

class TajHotel implements Hotel {

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("chickenBiryani from the TajHotel");

	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("masalaDosa from the TajHotel");

	}

	public void welcomeDrink() {
		System.out.println("Welcome Drink from the TajHotel");
	}

}

class RoadSideHotel implements Hotel {

	@Override
	public void chickenBiryani() {
		System.out.println("chickenBiryani --Normal hotel");

	}

	@Override
	public void masalaDosa() {
		System.out.println("masalaDosa --Normal hotel");

	}

}