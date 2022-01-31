public class Main {

    public static void main(String[] args) {
        // tehdään 'pieni' laatikko
        Laatikko pieni = new Laatikko(10);
        pieni.lisaa(new Kirja("Fjodor Dostojevski", "Rikos ja Rangaistus", 2));
        pieni.lisaa(new Kirja("Robert Martin", "Clean Code", 1));
        pieni.lisaa(new Kirja("Kent Beck", "Test Driven Development", 0.7));

        // tehdään toinen 'pieni' laatikko
        Laatikko pieni2 = new Laatikko(15);
        pieni2.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
        pieni2.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
        pieni2.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(pieni);
        System.out.println(pieni2);

        Laatikko mini = new Laatikko(3);
        mini.lisaa(pieni);
        // laatikko tyhjä, jos lisättävä tavara ylittää maksimipainon
        System.out.println(mini);

        Laatikko iso = new Laatikko(100);
        iso.lisaa(new Kirja("Fjodor Dostojevski", "Karamazowin veljekset", 1.3));
        iso.lisaa(new CDLevy("Coolio", "Gangsta’s Paradise", 1995));
        iso.lisaa(pieni);
        iso.lisaa(pieni2);
        System.out.println(iso);

        Laatikko iso2 = new Laatikko(110);
        iso2.lisaa(iso);
        System.out.println(iso2);

        // laatikon laittaminen itsensä sisään onnistuu
        iso2.lisaa(iso2);
        // mutta printtaus aiheuttaa virheen
        // System.out.println(iso2);
    }

}
