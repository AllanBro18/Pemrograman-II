import java.util.Scanner;
public class PRAK101_2310817210004_AllanoLintangErtantora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaBulan = "";
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempat = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();
        switch (bulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                break;
        }
        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        float berat = input.nextFloat();
        input.close();
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempat
                + " pada Tanggal "+tanggal+" "+ namaBulan +" "+tahun+" Tinggi Badan "+tinggi+" cm dan Berat Badan "+berat+" kilogram");
    }
    
}