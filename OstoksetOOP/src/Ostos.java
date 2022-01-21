public class Ostos {

    private String nimi;
    private double hinta;
    private int lukumaara;

    public Ostos(String nimi, double hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
        this.lukumaara = 1;
    }

    public int lukumaara() {
        return lukumaara;
    }

    public void kasvataLukumaaraa() {
        this.lukumaara = this.lukumaara + 1;
    }

    public double yhteishinta() {
        return this.lukumaara * this.hinta;
    }

    @Override
    public String toString() {
        return this.nimi + ", hinta: " + this.hinta + ", lukumaara: " + this.lukumaara + ", yhteishinta: "
                + this.yhteishinta();
    }

}
