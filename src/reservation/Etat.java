package reservation;

public enum Etat 
{
    ANNULEE ("Reservation Annulee"),
    CONFIRMEE ("Reservation Confirmee"),
    CREE ("Reservation Cree");
    private String etat = "";
    private Etat(String etat) 
    {
        this.etat = etat;
    }
    public String toString()
    {
        return etat;
    }
        
}