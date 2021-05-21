package classOOP_interface;

public class Main {
    public static void main(String[] args) {
        Berbiji mangga = new Berbiji("Mangga Arum Manis", "Mangifera indica l.", "Dikotil");
        mangga.displayDeskripsi();

        Paku semanggi = new Paku("Semanggi", "Marsilea crenata", "Pteropsida");
        semanggi.displayDeskripsi();

        Lumut campylopus = new Lumut("Campylopus", "Leucobryaceae", "Bryopsida");
        campylopus.displayDeskripsi();
    }
}