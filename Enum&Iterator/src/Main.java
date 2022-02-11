public class Main {

    public static void main(String[] args) {
        // testikoodia
        Henkilo vilma = new Henkilo("Vilma", Koulutus.FT);
        Henkilo jukka = new Henkilo("Jukka", Koulutus.FT);
        Henkilo pekka = new Henkilo("Pekka", Koulutus.FM);

        Tyontekijat testiLista = new Tyontekijat();
        testiLista.lisaa(vilma);
        testiLista.lisaa(jukka);
        testiLista.lisaa(pekka);

        testiLista.tulosta();
        System.out.println("==");
        testiLista.tulosta(Koulutus.FT);

        testiLista.lisaa(new Henkilo("Petrus", Koulutus.FM));
        testiLista.lisaa(new Henkilo("Arto", Koulutus.AMK));
        testiLista.lisaa(new Henkilo("Elina", Koulutus.YAMK));

        System.out.println("==");
        testiLista.tulosta(Koulutus.AMK);

        // poistetaan koulutuksen mukaan
        testiLista.irtisano(Koulutus.FT);

        System.out.println("==");
        testiLista.tulosta();

        System.out.println("==");
        testiLista.tulostaTutkinnot();
    }
}
