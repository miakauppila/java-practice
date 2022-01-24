
import java.io.File;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mistä luetaan? ");
        String tiedostonNimi = lukija.nextLine();
        System.out.println("Komennot:\n"
                + "listaa - listaa reseptit\n"
                + "lopeta - lopettaa ohjelman\n"
                + "hae nimi - hakee reseptiä nimen perusteella\n"
                + "hae keittoaika - hakee reseptiä keittoajan perusteella\n"
                + "hae aine - hakee reseptiä raaka-aineen perusteella\n");

        Reseptilista reseptit = new Reseptilista();

        try (Scanner tiedostonLukija = new Scanner(new File(tiedostonNimi))) {
            // luetaan tiedostoa kunnes kaikki rivit on luettu
            while (tiedostonLukija.hasNextLine()) {
                // 2:lla ensimmäisellä rivillä on nimi ja keittoaika
                String nimi = tiedostonLukija.nextLine();
                int aika = Integer.valueOf(tiedostonLukija.nextLine());

                Resepti uusi = new Resepti(nimi, aika);
                reseptit.lisaa(uusi);

                while (tiedostonLukija.hasNextLine()) {
                    String aine = tiedostonLukija.nextLine();
                    uusi.lisaaAine(aine);
                    // tyhjä rivi
                    if (aine.trim().length() == 0) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        while (true) {
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                break;
            }
            if (komento.equals("listaa")) {
                System.out.println("");
                System.out.println("Reseptit:");
                reseptit.tulosta();
                System.out.println("");
            }
            if (komento.equals("hae keittoaika")) {
                System.out.print("Keittoaika korkeintaan: ");
                int maksimi = Integer.valueOf(lukija.nextLine());
                System.out.println("");
                System.out.println("Reseptit:");
                reseptit.etsiReseptiKeittoajalla(maksimi);
                System.out.println("");
            }
            if (komento.equals("hae nimi")) {
                System.out.print("Mitä haetaan: ");
                String haettava = lukija.nextLine();
                System.out.println("");
                System.out.println("Reseptit:");
                reseptit.etsiReseptiNimella(haettava);
                System.out.println("");
            }
            if (komento.equals("hae aine")) {
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String aine = lukija.nextLine();
                System.out.println("");
                System.out.println("Reseptit:");
                reseptit.etsiReseptiAineella(aine);
                System.out.println("");
            }

        }
        lukija.close();

    }

}
