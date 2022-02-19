public class Main {

    public static void main(String[] args) {
        // testikoodia
        Kasi kasi1 = new Kasi();
        kasi1.lisaa(new Kortti(12, Maa.HERTTA));
        kasi1.lisaa(new Kortti(4, Maa.PATA));
        kasi1.lisaa(new Kortti(2, Maa.RUUTU));
        kasi1.lisaa(new Kortti(14, Maa.PATA));
        kasi1.lisaa(new Kortti(7, Maa.HERTTA));
        kasi1.lisaa(new Kortti(2, Maa.PATA));

        kasi1.jarjestaMaittain();
        kasi1.tulosta();

        Kasi kasi2 = new Kasi();
        kasi2.lisaa(new Kortti(11, Maa.RUUTU));
        kasi2.lisaa(new Kortti(11, Maa.PATA));
        kasi2.lisaa(new Kortti(11, Maa.HERTTA));
        kasi2.lisaa(new Kortti(4, Maa.RISTI));
        kasi2.lisaa(new Kortti(2, Maa.RISTI));
        kasi2.lisaa(new Kortti(14, Maa.RISTI));

        System.out.println("===");

        int vertailu = kasi1.compareTo(kasi2);

        if (vertailu < 0) {
            System.out.println("Arvokkaampi käsi sisältää kortit");
            kasi2.tulosta();
        } else if (vertailu > 0) {
            System.out.println("Arvokkaampi käsi sisältää kortit");
            kasi1.tulosta();
        } else {
            System.out.println("Kädet ovat yhtä arvokkaat");
        }

    }
}
