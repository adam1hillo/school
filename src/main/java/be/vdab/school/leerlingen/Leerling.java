package be.vdab.school.leerlingen;

public class Leerling {
    private final long nummer;
    private final String voornaam;
    private final String familienaam;

    public Leerling(long nummer, String voornaam, String familienaam) {
        this.nummer = nummer;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public long getNummer() {
        return nummer;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }
}
