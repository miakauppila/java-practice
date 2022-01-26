public class Main {

    public static void main(String[] args) {

        // testataan toimintaa
        MuistavaTuotevarasto mehuVarasto = new MuistavaTuotevarasto("Mansikkamehu", 1000.0, 500.0);
        mehuVarasto.otaVarastosta(110.0);
        mehuVarasto.lisaaVarastoon(50.0);
        //System.out.println(mehuVarasto.historia()); // [500.0, 390.0, 440.0]

        mehuVarasto.tulostaAnalyysi();
    }

}
