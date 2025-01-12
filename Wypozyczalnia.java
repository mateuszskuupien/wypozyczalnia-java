public class Wypozyczalnia {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager();
        ReportGenerator reportGenerator = new ReportGenerator(db);

        db.dodajKlienta(new Klient("Dawid", "Janowicz", 1));
        db.dodajKlienta(new Klient("Mateusz", "Skupień", 2));
        db.dodajKlienta(new Klient("Jarosław", "Kowalewicz", 3));

        db.dodajKsiazke(new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 101));
        db.dodajKsiazke(new Ksiazka("Władca Pierścieni", "J.R.R. Tolkien", 102));
        db.dodajKsiazke(new Ksiazka("Nic mnie nie złamie", "David Goggins", 103));

        Wypozyczenie wyp1 = new Wypozyczenie(db.getKlienci().get(0), db.getKsiazki().get(0));
        db.dodajWypozyczenie(wyp1);

        reportGenerator.generujRaportKlientow();
        reportGenerator.generujRaportKsiazek();
        reportGenerator.generujRaportWypozyczen();
    }
}
