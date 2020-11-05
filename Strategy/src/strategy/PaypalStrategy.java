package strategy;

public class PaypalStrategy implements PaiementStrategy{

	private String id;
	private String password;

	public PaypalStrategy(String email, String pass){
		this.id=id;
		this.password=pass;
	}

	@Override
	public void payer(int montant) {
		System.out.println(montant + "€ payés par Paypal.");
	}

}
