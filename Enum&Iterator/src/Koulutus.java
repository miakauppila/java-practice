public enum Koulutus {

    // vakioarvot, joiden konstruktorin parametrit määritellään tässä
    FT("Filosofian tohtori"),
    FM("Filosofian maisteri"),
    YAMK("Ylempi ammattikorkeakoulututkinto"),
    KAND("Kandidaatin tutkinto"),
    AMK("Alempi ammattikorkeakoulututkinto"),
    YO("Ylioppilas");

    // oliomuuttuja Enum-luokassa on private
    private String tutkintonimike;

    // myös konstruktori private
    private Koulutus(String tutkintonimike) {
        this.tutkintonimike = tutkintonimike;
    }

    public String getTutkintoNimike() {
        return this.tutkintonimike;
    }

}
