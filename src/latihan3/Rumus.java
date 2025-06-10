package latihan3;

/**
 * Nama  : Ari
 * NPM   : 2310010384
 * Kelas : 4B
 */

public class Rumus {
    //Membuat Atribut
    int sisi;
    int panjang;
    int lebar;
    int hasil;

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

}
