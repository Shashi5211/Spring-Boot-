package in.ashokit;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean pay(double amt) {
	   System.out.println("CreditCard Payment in Progress...!");
		return true;
	}

}
