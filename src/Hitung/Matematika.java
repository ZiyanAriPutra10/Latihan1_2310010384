package Hitung;

public class Matematika {
    // Variabel bil1 dan bil2 bertipe data double
    private double bil1;
    private double bil2;

    // Constructor untuk mengisi nilai bil1 dan bil2
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

     // Method untuk penjumlahan
    public double setPenjumlahan() {
        return bil1 + bil2;
    }

    // Method untuk pengurangan
    public double setPengurangan() {
        return bil1 - bil2;
    }

    // Method untuk perkalian
    public double setPerkalian() {
        return bil1 * bil2;
    }

    // Method untuk pembagian
    public double setPembagian() {
        if (bil2 != 0) {
            return bil1 / bil2;
        } else {
            System.out.println("Error: Pembagian dengan nol.");
            return Double.NaN; // Not a Number
        }
    }


}
