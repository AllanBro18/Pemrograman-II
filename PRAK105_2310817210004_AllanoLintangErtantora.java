import java.util.Scanner;
public class PRAK105_2310817210004_AllanoLintangErtantora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float phi = 3.14f;
        System.out.print("Masukkan jari-jari: ");
        float r = input.nextFloat();
        System.out.print("Masukkan tinggi: ");
        float t = input.nextFloat();
        float volume = phi * (r*r) * t;
        System.out.println("Volume tabung dengan jari-jari "+r+" cm dan tinggi "+t+" cm adalah "+String.format("%.3f", volume)+" m3");
        input.close();
    }
}
