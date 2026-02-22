package cellphone;

public class Mobile {
	
	public void androidMobile() {
		System.out.println("SAMSUNG, REDMAGIC, POCO, REALME");

	}
	
	public void iosMobile() {
		System.out.println("IPHONE, MACBOOK, IPAD");

	}

	public static void main(String[] args) {
		
		Mobile mobiledevice = new Mobile ();
		
		mobiledevice.androidMobile();
		
		mobiledevice.iosMobile();
		
	}
}
