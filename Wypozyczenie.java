import java.time.LocalDate;

public class Wypozyczenie {
    private Klient klient;
    private Ksiazka ksiazka;
    private LocalDate dataWypozyczenia;

    public Wypozyczenie(Klient klient, Ksiazka ksiazka) {
        this.klient = klient;
        this.ksiazka = ksiazka;
        this.dataWypozyczenia = LocalDate.now();
        ksiazka.setDostepna(false);
    }

    @Override
    public String toString() {
        return "Wypożyczenie: Książka '" + ksiazka + "' przez " + klient + ", Data wypożyczenia: " + dataWypozyczenia;
    }
}
