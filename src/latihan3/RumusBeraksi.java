package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Rumus dengan nama panggilan (misalnya: zailani)
        Rumus Ari = new Rumus();

        // Mengisi nilai sisi dan menghitung luas persegi
        Ari.sisi = 5;
        Ari.hitungLuasPersegi();
        System.out.println("Hasil Luas Persegi: " + Ari.getHasil());

        // Mengisi nilai panjang dan lebar, lalu menghitung luas persegi panjang
        Ari.panjang = 7;
        Ari.lebar = 4;
        Ari.hitungLuasPersegiPanjang();
        System.out.println("Hasil Luas Persegi Panjang: " + Ari.getHasil());
    }
}
    

