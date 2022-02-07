public class Kirja {
    
    private String nimi;
    private int suositusika;

    public Kirja(String nimi, int suositusika) {
        this.nimi = nimi;
        this.suositusika = suositusika;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getSuositusika() {
        return suositusika;
    }

    public void setSuositusika(int suositusika) {
        this.suositusika = suositusika;
    }

    @Override
    public String toString() {
        return this.nimi +" ("+ this.suositusika+" vuotiaille ja vanhemmille)";
    } 
    
}
