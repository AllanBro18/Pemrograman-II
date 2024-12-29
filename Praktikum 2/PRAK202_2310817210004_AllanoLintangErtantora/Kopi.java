package PRAK202_2310817210004_AllanoLintangErtantora;

public class Kopi {
    String namaPembeli;
    String namaKopi;
    String ukuran;
    float harga;
    
    void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: " + harga);
    }

    void setPembeli(String nama) {
        this.namaPembeli = nama;
    }

    String getPembeli() {
        return namaPembeli;
    }
    
    float getPajak() {
        return this.harga * 0.11f;
    }
}
