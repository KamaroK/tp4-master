package reservation;
import aeroport.Vol;

// import java.text.DateFormat;
import java.util.Date;
public class Reservation {

    private String numero;

    private Date date;

    private String etat;

    private Vol vol;

    private Client client;

    private Passager passager;
    
    public Reservation() {
        this.etat = Etat.CREE.toString();
    }
    
    public Reservation(Date date, String numero, Vol vol, Client client, Passager passager) {
        this.date = date;
        this.numero = numero;

        this.vol = vol;
        this.client = client;
        this.passager = passager;
        this.etat = Etat.CREE.toString();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }

    public Vol getVol() {
        return vol;
    }
    
    public void setVol(Vol vol) {
        this.vol = vol;
    }
    
    public Passager getPassager() {
        return passager;
    }
    
    public void setPassager(Passager passager) {
        this.passager = passager;
    }

    public void annuler() {
        this.etat = Etat.ANNULEE.toString();
    
    }
    public void confirmer() {
        this.etat = Etat.CONFIRMEE.toString();
    }

    @Override
    public String toString() {
	return "Reservation [date=" + date + ", identifiant=" + numero + ", etat=" + etat + ", vol=" + vol.getNumero()
			+ ", client=" + client.getNom() + ", passager=" + passager.getNom() + "]";
}
}
