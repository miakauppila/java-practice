import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Kirja testikirja = new Kirja("Hulabaloo", 15);
        //System.out.println(testikirja);

        List<Kirja> kirjat = new ArrayList<>();
        int kirjatLkm = 0;
        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            String kirja = lukija.nextLine();
            if (kirja.isEmpty()) {
                break;
            }
            kirjatLkm++;
            System.out.println("Syötä kirjan pienin kohdeikä:");
            int ika = Integer.valueOf(lukija.nextLine());
            kirjat.add(new Kirja(kirja, ika));
        }

        System.out.println("Yhteensä " + kirjatLkm + " kirjaa.");
        System.out.println("Kirjat:");

        jarjesta(kirjat);

        for (Kirja kirja : kirjat) {
            System.out.println(kirja);
        }

    }
    
    public static void jarjesta(List<Kirja> kirjalista){
        // luodaan Comparator, joka vertaa ikiä ja sen jälkeen nimiä
        Comparator<Kirja> vertailija = Comparator
                .comparing(Kirja::getSuositusika)
                .thenComparing(Kirja::getNimi);
        // sortataan lista Comparatorin avulla
        Collections.sort(kirjalista, vertailija);
    }

}
