/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

public class Main2 {
    public static void main(String[] args) {
        Pembayaran Pelektronik = new Elektronik();
        Pembayaran Pmakanan = new Makanan();
        
        // Hitung pajak Elektronik
        System.out.println("# Menghitung Pajak Elektronik");
        double hargaElektronik = 25000;
        double epajak = Pelektronik.hitungpajak(hargaElektronik);
        System.out.println("Harga Elektronik             : RP " + hargaElektronik);
        System.out.println("Jumlah pajak Elektronik      : RP " + epajak + " (10%)");
        System.out.println("Jumlah pembayaran Elektronik : RP " + (hargaElektronik + epajak)+ "\n");
        
        
        // Hitung pajak Makanan
        System.out.println("# Menghitung Pajak Elektronik");
        double hargamakanan = 9000;
        double mpajak = Pmakanan.hitungpajak(hargamakanan);
        System.out.println("Harga Makanan                : Rp " + hargamakanan);
        System.out.println("Jumlah pajak Makanan         : Rp " + mpajak + " (5%)");
        System.out.println("Jumlah pembayaran Makanan    : Rp " + (hargamakanan + mpajak));  
    }
}
