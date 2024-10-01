/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_PBO;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Main {
    public static void main(String[] args) {
        // untuk memberikan objek pada Produk
        Produk Kulkas = new Elektronik("Kulkas", 5000000, 2);
        Produk makan = new Makanan ("Roti", 10000, "12-12-2012");
        // untuk menampilkan info dari pegawai
        Kulkas.tampilkaninfo();
        makan.tampilkaninfo();
        
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println(" ");
        
        // untuk memberikan objek pada Pegawai
        Pegawai Tetap = new Pegawaitetap("Gema", 12.000000, 12.000000);
        Pegawai Kontrak = new Pegawaikontrak("Ucok", 5.000000, 36);
        // untuk menampilkan info dari pegawai
        Tetap.tampilkaninfo();
        Kontrak.tampilkaninfo();
    }
}
