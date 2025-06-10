package latihan2;

public class DataDiri {
    // Atribut
    private String nama;
    private String npm;
    private String kelas;

    // Konstruktor
    public DataDiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    // Getter untuk menampilkan data (opsional, untuk testing atau tampilkan data)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getKelas() {
        return kelas;
    }

    // Method untuk menampilkan data (opsional)
    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Kelas : " + kelas);
    }
    
}
