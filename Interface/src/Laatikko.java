import java.util.ArrayList;

public class Laatikko implements Talletettava {

    private double maksimipaino;
    private ArrayList<Talletettava> sisalto;

    public Laatikko(double maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.sisalto = new ArrayList<>();
    }

    public void lisaa(Talletettava tavara) {
        if (this.maksimipaino - this.paino() < tavara.paino()) {
            return;
        }
        this.sisalto.add(tavara);
    }

    // painoa ei ylläpidetä oliomuuttujassa vaan lasketaan tarpeen tullen
    public double paino() {
        double yhteispaino = 0;
        for (Talletettava tavara : this.sisalto) {
            yhteispaino = yhteispaino + tavara.paino();
        }
        return yhteispaino;
    }

    @Override
    public String toString() {
        return "Laatikko: " + this.sisalto.size() + " esinettä, paino yhteensä " + this.paino() + " kg";
    }

}
