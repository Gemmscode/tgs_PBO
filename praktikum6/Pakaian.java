/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Pakaian extends Produk {
    double diskon;
    
    // constructor
    public Pakaian (String nama, double harga, double diskon){
        super(nama, harga);
        this.diskon = diskon;
    }
    // method menghitung diskon
    public double hitungdiskon(){
        return (harga * 0.10);
    }
    // menampilkan info diskon
    @Override
    public void infoproduk(){
        super.infoproduk();
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Harga setelah diskon : " + hitungdiskon() + "\n");
    }
    
}