package reservation;

public class Client {

    private String nom;
	private String paiement;
	private String contact;
	private String reference;

	public Client(String nom, String paiement, String contact, String reference) {
		this.nom = nom;
		this.paiement = paiement;
		this.contact = contact;
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPaiement() {
		return paiement;
	}

	public void setPaiement(String paiement) {
		this.paiement = paiement;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", paiement=" + paiement + ", contact=" + contact + ", reference=" + reference
				+ "]";
	}
}