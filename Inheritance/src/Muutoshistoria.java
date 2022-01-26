import java.util.ArrayList;
import java.util.List;

public class Muutoshistoria {
    private List<Double> historia;
    
    public Muutoshistoria(){
        this.historia = new ArrayList<>();
    }
    
    public void lisaa(double tilanne){
        this.historia.add(tilanne);
    }
    
    public void nollaa(){
        this.historia.clear();
    }
    
    public double maxArvo(){
        if(this.historia.isEmpty()){
            return 0;
        }
        double maksimiArvo=0.0;
        for(Double muutos : this.historia){
            if(muutos>maksimiArvo){
                maksimiArvo = muutos;
            }
        }
        return maksimiArvo;
    }
    
    public double minArvo(){
        if(this.historia.isEmpty()){
            return 0;
        }
        // vertailuarvoksi doublen maksimi
        double minimiArvo=Double.MAX_VALUE;
        for(Double muutos : this.historia){
            if(muutos<minimiArvo){
                minimiArvo = muutos;
            }
        }
        return minimiArvo;
    }
    
    public double keskiarvo(){
       if(this.historia.isEmpty()){
            return 0;
        }
        double summa = 0;
        int laskuri = 0;
        for(Double muutos : this.historia){
            summa = summa + muutos;
            laskuri++;
            }
        return summa/laskuri; 
    }

    @Override
    public String toString() {
        return this.historia + "";
    }
    
    
}
