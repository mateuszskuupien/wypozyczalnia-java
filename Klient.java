public class Klient {
    private String imie;
    private String nazwisko;
    private int idKlienta;

    public Klient(String imie, String nazwisko, int idKlienta) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.idKlienta = idKlienta;
    }

    @Override
    public String toString() {
        return "Klient " + imie + " " + nazwisko + " (ID: " + idKlienta + ")";
    }
}
