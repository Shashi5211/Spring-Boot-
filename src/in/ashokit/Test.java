package in.ashokit;

public class Test {

	public static void main(String[] args) {

		// Constructor injection
		PaymentProcess pp = new PaymentProcess(new SodexoCardPayment());

		// Setter injection
		pp.setPayment(new DebitCardPayment());
		
		pp.processPayment(1200.20);
	}

}
