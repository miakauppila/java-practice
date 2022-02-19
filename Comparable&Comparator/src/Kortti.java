public class Kortti implements Comparable<Kortti> {

    private int arvo;
    private Maa maa;

    public Kortti(int arvo, Maa maa) {
        if (arvo < 2 || arvo > 14) {
            throw new IllegalArgumentException("Kortin arvon tulee olla väliltä 2...14.");
        }

        this.arvo = arvo;
        this.maa = maa;
    }

    @Override
    public String toString() {
        String kortinArvo = "" + arvo;
        if(arvo == 11) {
            kortinArvo = "J";
        } else if (arvo == 12) {
            kortinArvo = "Q";
        } else if (arvo == 13) {
            kortinArvo = "K";
        } else if (arvo == 14) {
            kortinArvo = "A";
        }
        
        return maa + " " + kortinArvo;
    }

    public int getArvo() {
        return arvo;
    }

    public Maa getMaa() {
        return maa;
    }
    
    // used to order the hand by values
    // if two cards have equal value,
    // then compare suit ordinal in enum
    @Override
    public int compareTo(Kortti toinen) {
        if(this.getArvo() == toinen.getArvo()){
            // enum order: club, diamond, heart, spade
            return this.getMaa().ordinal() - toinen.getMaa().ordinal();
        }
        return this.getArvo() - toinen.getArvo();
    }
    
    

}
