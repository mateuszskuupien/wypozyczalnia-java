public class Ksiazka {
    private String tytul;
    private String autor;
    private int idKsiazki;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int idKsiazki) {
        this.tytul = tytul;
        this.autor = autor;
        this.idKsiazki = idKsiazki;
        this.dostepna = true;
    }

    public boolean isDostepna() {
        return dostepna;
    }

    public void setDostepna(boolean dostepna) {
        this.dostepna = dostepna;
    }

    @Override
    public String toString() {
        String status = dostepna ? "Dostępna" : "Wypożyczona";
        return "Książka '" + tytul + "' autorstwa " + autor + " (ID: " + idKsiazki + ", Status: " + status + ")";
    }
}
