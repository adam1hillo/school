package be.vdab.school.lessen;

public class Les {

    private final String code;
    private final String naam;

    public Les(String code, String naam) {
        this.code = code;
        this.naam = naam;
    }

    public String getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }
}
