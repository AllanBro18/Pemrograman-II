import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dadu = new Dadu(input.nextInt());
        input.close();
    }
}