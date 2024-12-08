package soal1;

public class hewanPeliharaan {
    String nama;
    String ras;

    public hewanPeliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
        System.out.println("Dengan ras : "+ this.ras);
    }
}