import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // testikoodia, jossa kutsutaan ohjelmoitavia metodeja  
        
        Tarkistin tarkka = new Tarkistin();
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna merkkijono: ");
        String syote = lukija.nextLine();
                
        tarkka.onViikonpaiva(syote);
       
        tarkka.kaikkiVokaaleja(syote);
        
        tarkka.kellonaika(syote);

        tarkka.validUsername(syote);

        tarkka.validateMobileNumber(syote);
        
    }
}
