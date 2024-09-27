/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Najmi Mukia Barkah
 */
public abstract class Produk {
    String nama;
    double harga;
    
    // constructor
    public Produk(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    // method infoproduk
    public void infoproduk(){
        System.out.println("Nama produk : " + nama);
        System.out.println("Harga asli  : " + harga);
    }
    public abstract double hitungdiskon();
}
