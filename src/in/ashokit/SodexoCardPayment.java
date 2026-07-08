package in.ashokit;

public  class SodexoCardPayment implements IPayment {

	@Override
	public boolean pay(double amt) {
		System.out.println("SodexoCard Payment In Progress....!");
		return true;
	}

}
