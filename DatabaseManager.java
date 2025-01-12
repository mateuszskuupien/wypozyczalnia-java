import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private List<Klient> klienci;
    private List<Ksiazka> ksiazki;
    private List<Wypozyczenie> wypozyczenia;

    public DatabaseManager() {
        klienci = new ArrayList<>();
        ksiazki = new ArrayList<>();
        wypozyczenia = new ArrayList<>();
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki.add(ksiazka);
    }
    

    public void dodajWypozyczenie(Wypozyczenie wypozyczenie) {
        wypozyczenia.add(wypozyczenie);
    }

    public List<Klient> getKlienci() {
        return klienci;
    }

    public List<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public List<Wypozyczenie> getWypozyczenia() {
        return wypozyczenia;
    }
}
