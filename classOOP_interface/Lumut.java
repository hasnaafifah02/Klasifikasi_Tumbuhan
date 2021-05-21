package classOOP_interface;

public class Lumut extends Klasifikasi_Tumbuhan implements Bryophyta {
    String kelas;
    String latin;

    public Lumut(String nama, String latin, String kelas) {
        super(nama);
        this.latin = latin;
        this.kelas = kelas;
    }

    @Override
    public void displayTumbuhan() {
        System.out.println(" [+] Nama        : " +getNama());
        System.out.println(" [+] Latin       : " +latin);
        System.out.println(" [+] Kingdom     : " +getKingdom());
    }

    @Override
    public void displayBryophyta() {
        System.out.println(" [+] Divisi      : Tumbuhan" + " " +jenis);
        System.out.println(" [+] Kelas       : " +kelas);
        System.out.println(" [+] Habitat     : " +habitat);
    }

    public void displayDeskripsi() {
        System.out.println("\n [] ========== DESKRIPSI TUMBUHAN ======== []\n");
        displayTumbuhan();
        displayBryophyta();
        System.out.println("\n [] ====================================== []\n");
    }
}