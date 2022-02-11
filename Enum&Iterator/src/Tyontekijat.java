import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tyontekijat {

    private List<Henkilo> tyontekijat;

    public Tyontekijat() {
        this.tyontekijat = new ArrayList<>();
    }


    public void lisaa(Henkilo lisattava) {
        this.tyontekijat.add(lisattava);
    }

    // lisää kaikki listan henkilöt työntekijöiksi
    public void lisaa(List<Henkilo> lisattavat) {
        for (Henkilo henkilo : lisattavat) {
            this.tyontekijat.add(henkilo);
        }
    }

    public void tulosta() {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
    }

    // tulostaa parametrina saadun koulutuksen työntekijät
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
        while (iteraattori.hasNext()) {
            Henkilo seuraava = iteraattori.next();
            if (seuraava.getKoulutus() == koulutus) {
                System.out.println(seuraava);
            }
        }
    }

    // tulostaa listan työntekijöiden tutkinnoista ilman nimiä
    public void tulostaTutkinnot() {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next().getKoulutus().getTutkintoNimike());
        }
    }

    // poistaa parametrina saadun koulutuksen työntekijät
    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus() == koulutus) {
                iteraattori.remove();
            }
        }
    }

}
