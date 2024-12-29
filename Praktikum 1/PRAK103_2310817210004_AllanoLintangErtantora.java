import java.util.Scanner;
public class PRAK103_2310817210004_AllanoLintangErtantora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris = input.nextInt();
        int angka = input.nextInt();
        int counter = 0;
        do{
            if (angka % 2 != 0) {
                System.out.print(angka);
                counter++;
            }
            if (angka % 2 != 0 && counter != baris) {
                System.out.print(", ");
            }
            angka++;
        } while (counter < baris);
        input.close();
    }
}
