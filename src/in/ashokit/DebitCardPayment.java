package in.ashokit;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean pay(double amt) {
		System.out.println("DebitCard Payment in Progress...!");
		return true;
	}

}
