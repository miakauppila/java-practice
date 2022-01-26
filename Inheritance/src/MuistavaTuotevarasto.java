public class MuistavaTuotevarasto extends Tuotevarasto {
    private Muutoshistoria historia;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.historia = new Muutoshistoria();
        this.historia.lisaa(alkuSaldo);
    }
    
    public String historia(){
        return this.historia + "";
    }
    
    @Override
    public void lisaaVarastoon(double maara){
        super.lisaaVarastoon(maara);
        double saldo1 = super.getSaldo();
        this.historia.lisaa(saldo1);
    }
    
    @Override
    public double otaVarastosta(double maara){
        double saldo1 = super.otaVarastosta(maara);
        double saldo2 = super.getSaldo();
        this.historia.lisaa(saldo2);
        return saldo1;
    }
    
    public void tulostaAnalyysi(){
        System.out.println("Tuote: "+ super.getNimi());
        System.out.println("Varastosaldojen historia: " + historia());
        System.out.println("Suurin tuotemäärä: "+ this.historia.maxArvo());
        System.out.println("Pienin tuotemäärä: " + this.historia.minArvo());
        // keskiarvon pyöristys
        System.out.println("Keskiarvo: " + String.format("%.2f", this.historia.keskiarvo()));
    }
    
    
    
    
    
}
