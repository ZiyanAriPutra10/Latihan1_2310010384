package Hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Matematika dengan nama panggilan dan parameter 8, 4
        Matematika Ari = new Matematika(8, 4);

        // Menampilkan hasil dari setiap operasi
        System.out.println("Hasil Penjumlahan: " + Ari.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " + Ari.setPengurangan());
        System.out.println("Hasil Perkalian: " + Ari.setPerkalian());
        System.out.println("Hasil Pembagian: " + Ari.setPembagian());
    }
 
}
