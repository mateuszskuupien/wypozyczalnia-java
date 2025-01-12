public class ReportGenerator {
    private DatabaseManager db;

    public ReportGenerator(DatabaseManager db) {
        this.db = db;
    }

    public void generujRaportKlientow() {
        System.out.println("\nRaport klientów:");
        for (Klient klient : db.getKlienci()) {
            System.out.println(klient);
        }
    }

    public void generujRaportKsiazek() {
        System.out.println("\nRaport książek:");
        for (Ksiazka ksiazka : db.getKsiazki()) {
            System.out.println(ksiazka);
        }
    }

    public void generujRaportWypozyczen() {
        System.out.println("\nRaport wypożyczeń:");
        for (Wypozyczenie wypozyczenie : db.getWypozyczenia()) {
            System.out.println(wypozyczenie);
        }
    }
}
