package strategy;

public class CarteDeCreditStrategy implements PaiementStrategy {

	private String numeroCarte;
	private String cryptogramme;
	private String dateExpiration;

	public CarteDeCreditStrategy(String num, String crypto, String date) {
		this.numeroCarte = num;
		this.cryptogramme = crypto;
		this.dateExpiration = date;
	}

	@Override
	public void payer(int montant) {
		System.out.println(montant + "� pay�s par carte de cr�dit.");
	}

}