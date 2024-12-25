public class Mahasiswa {
    private String NIM;
    private String nama;
    private int id;

    public Mahasiswa(int id, String NIM, String nama) {
        this.id = id;
        this.NIM = NIM;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
