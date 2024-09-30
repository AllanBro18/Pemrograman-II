import java.util.Scanner;
public class PRAK104_2310817210004_AllanoLintangErtantora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int skorAbu = 0;
        int skorBagas = 0;

        System.out.print("Tangan Abu: ");
        String abu = input.nextLine().replace(" ", "");
        System.out.print("Tangan Bagas: ");
        String bagas = input.nextLine().replace(" ", "");
        
        for (int i = 0; i < 3; i++) {
            int hasil = suit(abu.charAt(i), bagas.charAt(i));
            if (hasil == 1) {
                skorAbu++;
            } else if (hasil == -1) {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        input.close();
    }

    static int suit(char a, char b) {
        if (a == b) {
            return 0;
        }else if (a == 'G' && b == 'K' || a == 'B' && b == 'G' || a == 'K' && b == 'B'){
            return 1;
        }else{
            return -1;
        }
    }
}
