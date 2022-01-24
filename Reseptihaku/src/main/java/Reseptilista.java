
import java.util.ArrayList;

public class Reseptilista {

    private ArrayList<Resepti> reseptit;

    public Reseptilista() {
        this.reseptit = new ArrayList<>();
    }

    public void lisaa(Resepti uusi) {
        this.reseptit.add(uusi);
    }

    public void tulosta() {
        for (Resepti resepti : this.reseptit) {
            System.out.println(resepti);
        }
    }

    public void etsiReseptiKeittoajalla(int maksimiaika) {
        boolean osuma = false;
        for (Resepti resepti : this.reseptit) {
            if (resepti.getAika() <= maksimiaika) {
                System.out.println(resepti);
                osuma = true;
            }
        }
        if (!osuma) {
            System.out.println("Ei sopivia reseptejä");
        }
    }

    public void etsiReseptiNimella(String nimi) {
        boolean osuma = false;
        for (Resepti resepti : this.reseptit) {
            if (resepti.getNimi().contains(nimi.toLowerCase())) {
                System.out.println(resepti);
                osuma = true;
            }
        }
        if (!osuma) {
            System.out.println("Ei sopivia reseptejä");
        }
    }

    public void etsiReseptiAineella(String aine) {
        boolean osuma = false;
        for (Resepti resepti : this.reseptit) {
            // haettavan aineen nimen pitää olla täysin sama kuin jokin raaka-aine
            if (resepti.getAineet().contains(aine.toLowerCase())) {
                System.out.println(resepti);
                osuma = true;
            }
        }
        if (!osuma) {
            System.out.println("Ei sopivia reseptejä");
        }
    }

}
