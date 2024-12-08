import java.util.LinkedList;

public class Dadu {
    private LinkedList<Integer> daduIntegers = new LinkedList<>();
    int total = 0;
    public Dadu(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            daduIntegers.add(acakNilai());
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + daduIntegers.get(i));
            total += daduIntegers.get(i);
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
        return;
    }
    public int acakNilai() {
        return (int) (Math.random() * 6) + 1;
    }

}