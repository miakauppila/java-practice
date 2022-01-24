
import java.util.ArrayList;

public class Resepti {
    private String nimi;
    private int aika;
    private ArrayList<String> aineet;
    
    public Resepti(String nimi, int aika){
        this.nimi = nimi;
        this.aika = aika;
        this.aineet = new ArrayList<>();   
    }
    
    public void lisaaAine(String aine){
        this.aineet.add(aine);
    }

    public String getNimi() {
        return nimi.toLowerCase();
    }

    public int getAika() {
        return aika;
    }

    public ArrayList<String> getAineet() {
        return aineet;
    }
    
    @Override
    public String toString() {
        return this.nimi + ", keittoaika: " + this.aika;
    }
    
    public static void main(String[] args) {
        Resepti testi = new Resepti ("Vegeburger", 50);
        
        System.out.println(testi);
    }
    
    
}
