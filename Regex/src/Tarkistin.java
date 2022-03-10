public class Tarkistin {

    public Tarkistin() {
    }

    public boolean onViikonpaiva(String merkkijono) {
        if (merkkijono.matches("ma|ti|ke|to|pe|la|su")) {
            System.out.println("Muoto on oikea.");
            return true;
        }
        System.out.println("Muoto ei ole oikea.");
        return false;
    }

    public boolean kaikkiVokaaleja(String merkkijono) {
        if (merkkijono.matches("[aeiouyäö]*")) {
            System.out.println("Muoto on oikea.");
            return true;
        }
        System.out.println("Muoto ei ole oikea.");
        return false;
    }

    public boolean kellonaika(String merkkijono) {
        if (merkkijono.startsWith("2")) {
            if (merkkijono.matches("2[0-3]:[0-5][0-9]:[0-5][0-9]")) {
                System.out.println("Muoto on oikea.");
                return true;
            }
        }
        if (merkkijono.matches("[0-1][0-9]:[0-5][0-9]:[0-5][0-9]")) {
            System.out.println("Muoto on oikea.");
            return true;
        }
        System.out.println("Muoto ei ole oikea.");
        return false;
    }

    // 8-20 characters (alphanumeric, underscore)
    // must start with lower or uppercase letter
    public boolean validUsername(String merkkijono) {
        if (merkkijono.matches("^[a-zA-Z][a-zA-Z0-9_]{7,19}$")) {
            System.out.println("Muoto on oikea");
            return true;
        }
        System.out.println("Muoto ei ole oikea.");
        return false;
    }

    // prefix: 3 numbers (not 047/048) and subscriber part 5-10 numbers
    public boolean validateMobileNumber(String merkkijono) {
        if (merkkijono.matches("^[[04][0-9&&[^78]]|[050]]{3}[0-9]{5,10}$")) {
            System.out.println("Muoto on oikea");
            return true;
        }
        System.out.println("Muoto ei ole oikea.");
        return false;
    }

}
