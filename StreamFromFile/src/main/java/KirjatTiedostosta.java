import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KirjatTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // lue kirjat annetusta tiedostosta
        List<Kirja> uudet = lueKirjat("kirjat.txt");
        for(Kirja kirja: uudet){
            System.out.println(kirja);
        }
    }

    // luetaan tiedosto Files-luokan lines-metodin avulla syötevirtana
    public static List<Kirja> lueKirjat(String tiedosto) {
        List<Kirja> kirjat = new ArrayList<>();
        try {
            Files.lines(Paths.get(tiedosto))
                    // splitataan rivi taulukkoon pilkkujen kohdilta
                    .map(rivi -> rivi.split(","))
                    //taulukossa pitää olla neljä alkiota eli muut mahdolliset poistetaan
                    .filter(palat -> palat.length == 4)
                    // luodaan palojen perusteella kirjoja
                    .map(palat -> new Kirja(palat[0], Integer.valueOf(palat[1]), Integer.valueOf(palat[2]), palat[3]))
                    // ja lisätään kirjat listalle
                    .forEach(kirja -> kirjat.add(kirja));

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        return kirjat;
    }

}
