package classOOP_interface;

public class Berbiji extends Klasifikasi_Tumbuhan implements Spermatophyta {
    String kelas;
    String latin;

    public Berbiji(String nama, String latin, String kelas) {
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
    public void displaySpermatophyta() {
        System.out.println(" [+] Divisi      : Tumbuhan" + " " +jenis);
        System.out.println(" [+] Kelas       : " +kelas);
        System.out.println(" [+] Habitat     : " +habitat);
    }

    public void displayDeskripsi() {
        System.out.println("\n [] ========== DESKRIPSI TUMBUHAN ======== []\n");
        displayTumbuhan();
        displaySpermatophyta();
        System.out.println("\n [] ====================================== []\n");
    }
}