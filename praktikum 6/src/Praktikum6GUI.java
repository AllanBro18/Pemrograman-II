import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Praktikum6GUI {
    public static void main(String[] args) {
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa(1, "2301194", "Andi"));
        daftarMahasiswa.add(new Mahasiswa(2, "22423423", "Budi"));
        daftarMahasiswa.add(new Mahasiswa(3, "223523", "Citra"));
        daftarMahasiswa.add(new Mahasiswa(4, "200235235", "Dewi"));
        daftarMahasiswa.add(new Mahasiswa(5, "2002352345", "Eko"));
        daftarMahasiswa.add(new Mahasiswa(6, "20234532453", "Fani"));
        daftarMahasiswa.add(new Mahasiswa(7, "20235", "Gita"));
        daftarMahasiswa.add(new Mahasiswa(8, "202345346", "Hadi"));
        daftarMahasiswa.add(new Mahasiswa(9, "212312319", "Intan"));
        daftarMahasiswa.add(new Mahasiswa(10, "29013421", "Joko"));

        String[] kolom = {"NIM", "Nama"};
        String[][] data = new String[daftarMahasiswa.size()][2];
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            data[i][0] = daftarMahasiswa.get(i).getNIM();
            data[i][1] = daftarMahasiswa.get(i).getNama();
        }

        JFrame frame = new JFrame("Data Mahasiswa");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTable tabel = new JTable(data, kolom);
        tabel.setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(tabel);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}