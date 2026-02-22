package firstproject;

public class DataTypes {
	
	String mobileModel = "SAMSUNG";
	int mobileWeight = 210;
	boolean isFullyCharged = true;
	double mobileCost=45000.50;

	public static void main(String[] args) {
		
		DataTypes mobile = new DataTypes();
		
		System.out.println("The Mobile model is "+mobile.mobileModel);
		System.out.println(mobile.mobileWeight);
		System.out.println(mobile.isFullyCharged);
		System.out.println(mobile.mobileCost);

	}

}
