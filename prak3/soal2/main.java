package soal2;

import java.util.Scanner;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> negaraList = new LinkedList<>();
        int banyaknya = input.nextInt();

        for (int i = 0; i < banyaknya; i++) {
            input.nextLine();
            String nama = input.nextLine();
            String jenis = input.nextLine();
            String pemimpin = input.nextLine();
            if (!jenis.equals("Monarki")) {
                int tanggal = input.nextInt();
                int bulan = input.nextInt();
                int tahun = input.nextInt();
                negaraList.add(new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun));
            } else {
                negaraList.add(new Negara(nama, jenis, pemimpin));
            }
        }

        for (int i = 0; i < banyaknya; i++) {
            negaraList.get(i).info();
            System.out.println();
        }
        
        input.close();
    }
}