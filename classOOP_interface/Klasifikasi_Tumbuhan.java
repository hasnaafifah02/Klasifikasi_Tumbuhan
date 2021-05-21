package classOOP_interface;

public abstract class Klasifikasi_Tumbuhan {
    String nama;
    String kingdom = "Plantae";

    public Klasifikasi_Tumbuhan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getKingdom() {
        return kingdom;
    }

    abstract void displayTumbuhan();
}