package soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = input.nextLine();
        System.out.print("Ras: ");
        String ras = input.nextLine();
        hewanPeliharaan h1 = new hewanPeliharaan(ras, nama);
        h1.display();
        input.close(); 
    }
}