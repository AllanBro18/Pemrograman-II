package soal2;

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
        System.out.println("Dengan ras : " + this.ras);
    }
}

class Kucing extends hewanPeliharaan {
    String warnaBulu;

    public Kucing(String r, String n, String w) {
        super(r, n);
        this.warnaBulu = w;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.warnaBulu);
    }

}

class anjing extends hewanPeliharaan {
    String warnaBulu;
    String[] kemampuan;

    public anjing(String r, String n, String w, String[] k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.warnaBulu);
        System.out.print("Memiliki kemampuan : ");
        for (String kemampuan : kemampuan) {
            System.out.print(kemampuan);
        }
    }
}