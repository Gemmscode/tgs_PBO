/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Buku extends Produk {
    double diskon;
    
    // constructor
    public Buku (String nama, double harga, double diskon){
        super(nama, harga);
        this.diskon = diskon;
    }
    // method hitung diskon
    public double hitungdiskon(){
        return harga - ( harga * 0.5);
    }
    // menampilkan info diskon
    @Override
    public void infoproduk() {
        super.infoproduk();
            System.out.println("Diskon  : " + diskon + "%");
            System.out.println("Harga setelah diskon: Rp " + hitungdiskon() + "\n");
    }
}
