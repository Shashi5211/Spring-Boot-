package in.ashokit;

public class PaymentProcess {

	private IPayment ip=null;

	public PaymentProcess(IPayment ip) {
		this.ip = ip;
	}
	
	public void setPayment(IPayment ip) {
		this.ip=ip;
	}
	
	public void processPayment(double amt) {
		boolean status = ip.pay(amt);
		
		if(status=true) {
			System.out.println("Payment Completed..ThankYou...!!");
		}else {
			System.out.println("Payment Failed....!!");
		}
	}

	
	
	
	
	
}
