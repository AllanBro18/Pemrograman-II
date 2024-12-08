package soal2;

import java.util.HashMap;


public class Negara {
    String nama;
    String jenis;
    String pemimpin;
    int tanggal;
    int bulan;
    int tahun;
    
    public Negara(String nama, String jenis, String pemimpin) {
        this.nama = nama;
        this.jenis = jenis;
        this.pemimpin = pemimpin;
    }
    public Negara(String nama, String jenis, String pemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenis = jenis;
        this.pemimpin = pemimpin;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }


    
    public String getBulan(int bulan) {
        HashMap<Integer, String> namaBulan = new HashMap<Integer, String>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        return namaBulan.get(bulan);

    }

    void info(){
        if (!this.jenis.equals("Monarki")){
            System.out.println("Negara " + this.nama + " mempunyai " + this.jenis + " bernama " + this.pemimpin);
            System.out.println("Deklarasi kemerdekaan pada tanggal " + this.tanggal + " " + getBulan(this.bulan)+ " " + this.tahun);
        } else {
            System.out.println("Negara " + this.nama + " mempunyai Raja bernama " + this.pemimpin);

        }
    }
}