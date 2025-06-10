package latihan3;

/**
 * Nama  : Ari
 * NPM   : 2310010384
 * Kelas : 4B
 */

public class Rumus {
    // Atribut
    int sisi;
    int panjang;
    int lebar;
    int hasil;

    // Konstruktor: set semua atribut ke 0
    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }

    // Method untuk menghitung luas persegi
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil);
    }

    // Method untuk menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + hasil);
    }

    // Accessor untuk mengembalikan nilai hasil
    public int getHasil() {
        return hasil;
    }

}
