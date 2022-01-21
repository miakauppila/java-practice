import java.util.ArrayList;

public class Ostoskori {

    private String omistaja;
    private ArrayList<Ostos> ostokset;

    public Ostoskori(String nimi) {
        this.omistaja = nimi;
        this.ostokset = new ArrayList<>();
    }

    public void lisaaOstos(Ostos ostos) {
        this.ostokset.add(ostos);
    }

    public double yhteishinta() {
        double summa = 0;
        for (Ostos ostos : ostokset) {
            summa = summa + ostos.yhteishinta();
        }
        return summa;
    }

    public int lukumaara() {
        int maara = 0;
        for (Ostos ostos : ostokset) {
            maara = maara + ostos.lukumaara();
        }
        return maara;
    }

    public void tulostaOstokset() {
        for (Ostos ostos : ostokset) {
            System.out.println(ostos);
        }
    }

    @Override
    public String toString() {
        return "Kori, " + "omistaja: " + this.omistaja + ", ostoksia: " + this.ostokset.size()
                + ", kaikkien tuotteiden lukumaara: " + this.lukumaara() + ", yhteishinta: " + this.yhteishinta();
    }

}
