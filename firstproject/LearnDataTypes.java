package firstproject;

public class LearnDataTypes {
	
	//datatype VariableName = value;
	int price = 5500000;
	byte count = 13;
	long mobileNo = 98362964293L;
	double insurance = 18000.50;
	boolean saftyRating = true;
	char fuelType  = 'P';
	
	public void specs() {
		int price = 5500000;
		System.out.println(price);
	}
	
	public void stock() {
		byte count = 13;
		System.out.println(count);
	}
	
	public void contact() {
		long mobileNo = 98362964293L;
		System.out.println(mobileNo);
	}
	
	public void insurancePlolicy() {
		double insurance = 18000.50;
		System.out.println(insurance);
	}
	
	public void carSafetyTest() {
		boolean saftyRating = true;
		System.out.println(saftyRating);
	}
	
	public void vechileFuelType() {
		char fuelType  = 'P';
		System.out.println(fuelType);
	}

	public static void main(String[] args) {
		
		LearnDataTypes fullDetails = new LearnDataTypes ();
		
		fullDetails.specs();
		fullDetails.stock();
		fullDetails.contact();
		fullDetails.insurancePlolicy();
		fullDetails.carSafetyTest();
		fullDetails.vechileFuelType();
		

	}

}
