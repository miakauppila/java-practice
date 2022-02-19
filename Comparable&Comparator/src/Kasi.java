import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Kasi implements Comparable<Kasi> {
    
    private List<Kortti> kortit;

    public Kasi() {
        this.kortit = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti){
        this.kortit.add(kortti);
    }
    
    // prints the hand (not ordering)
    public void tulosta(){
        Iterator<Kortti> iteraattori = kortit.iterator();
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
    }
    
    // orders the hand by values = Kortti compareTo
    public void jarjesta(){
        Collections.sort(kortit);
    }
    
    // orders the hand by value within a suit
    public void jarjestaMaittain(){
        Collections.sort(kortit, new MaatVierekkainArvojarjestykseen());
    }

    // orders the hand by total value and if equal value,
    // then return 0
    @Override
    public int compareTo(Kasi toinen) {
        int summa = 0;
        int summa2 = 0;
        Iterator<Kortti> iteraattori = kortit.iterator();
        while (iteraattori.hasNext()) {
            summa = summa + iteraattori.next().getArvo();
        }
        Iterator<Kortti> iteraattori2 = toinen.kortit.iterator();
        while (iteraattori2.hasNext()) {
            summa2 = summa2 + iteraattori2.next().getArvo();
        }
        // return negative if second hand sum is greater
        return summa - summa2;
    }
    
    
}
