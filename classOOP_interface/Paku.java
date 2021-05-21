package classOOP_interface;

public class Paku extends Klasifikasi_Tumbuhan implements Pteridophyta {
    String kelas;
    String latin;

    public Paku(String nama, String latin, String kelas) {
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
    public void displayPteridophyta() {
        System.out.println(" [+] Divisi      : Tumbuhan" + " " +jenis);
        System.out.println(" [+] Kelas       : " +kelas);
        System.out.println(" [+] Habitat     : " +habitat);
    }

    public void displayDeskripsi() {
        System.out.println("\n [] ========== DESKRIPSI TUMBUHAN ======== []\n");
        displayTumbuhan();
        displayPteridophyta();
        System.out.println("\n [] ====================================== []\n");
    }
}