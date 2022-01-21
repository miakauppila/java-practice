public class Ostokset {

    public static void main(String[] args) {

        Ostos maito = new Ostos("Maito", 1.19);
        Ostos kahvi = new Ostos("Kahvi", 4.99);
        maito.kasvataLukumaaraa();

        Ostoskori kori = new Ostoskori("Alicia");
        kori.lisaaOstos(maito);
        kori.lisaaOstos(kahvi);

        System.out.println(kori);
        System.out.println(kori.yhteishinta());

        System.out.println();

        maito.kasvataLukumaaraa();

        System.out.println(kori);
        System.out.println(kori.yhteishinta());
        kori.tulostaOstokset();

        System.out.println();

        kori.lisaaOstos(new Ostos("Kerma", 2.50));
        System.out.println(kori);
        kori.tulostaOstokset();

    }

}
