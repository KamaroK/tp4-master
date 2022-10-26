// Auteurs : Passy-Kevis KAMARO & Arnaud NSENGIYUMVA
import aeroport.Compagnie;
import aeroport.Vol;
import reservation.Reservation;
import reservation.Client;
import reservation.Passager;

// import java.text.DateFormat;
// import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
// import java.util.Date;


public class Start {

    public static void main(String[] args) throws ParseException{
        Vol volFinal = new Vol();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        String dd = "21/10/2020 13:00";
        String da = "23/10/2020 02:15";

        try {
            volFinal.setDateDepart(format.parse(dd));
            volFinal.setDateArrivee(format.parse(da));
        } catch (Exception e){
            throw new RuntimeException("Unable to format to date");
        }

        System.out.println(volFinal.getDateArrivee());
        System.out.println(volFinal.obtenirDuree().toString().substring(2));






        //Bidirectional
        Vol vol = new Vol();
        vol.setNumero("abc1");

        Vol vol2 = new Vol();
        vol2.setNumero("abc2");

        Compagnie compagnie = new Compagnie();
        compagnie.setName("Air France");
        compagnie.addVol(vol);
        compagnie.addVol(vol2);

        for(Vol v : compagnie.getVols()){
            System.out.println(v.getNumero());
        }

        System.out.println(vol.getCompagnie().getName());
        System.out.println(vol2.getCompagnie().getName());

        vol2.setCompagnie(null);
        System.out.println(vol2.getCompagnie());

        for(Vol v : compagnie.getVols()){
            System.out.println(v.getNumero());
        }

        Client client1= new Client("Alice","512Euros","alice@gmail.com","ref13g");
		System.out.println(client1.toString());
		
		Client client2= new Client("Bob","400Euros","bob@gmail.com","ref13g");
		System.out.println(client2.toString());
		
		Passager passager1 = new Passager("Alice");
		System.out.println(passager1.toString());
		
		Passager passager2 = new Passager("Bob");
		System.out.println(passager2.toString());

        Reservation reservation1 = new Reservation(format.parse(dd), "20040065", volFinal , client1, passager1);		
		System.out.println(reservation1.toString());
		reservation1.confirmer();
		System.out.println(reservation1.toString());
		
		Reservation reservation2 = new Reservation(format.parse(da), "20040066", vol, client2, passager2);
		System.out.println(reservation2.toString());
		reservation2.annuler();
		System.out.println(reservation2.toString());

    }
}
