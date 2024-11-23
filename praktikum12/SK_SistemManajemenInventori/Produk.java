/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12.SK_SistemManajemenInventori;

import java.io.*;

class Produk implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;
    
    public Produk (String namaProduk, double harga, int stok){
        this.namaProduk = namaProduk;
        this.harga = harga ;
        this.stok = stok;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok);
    }
    
    @Override
    public String toString() {
        return namaProduk + "," + harga + ',' + stok ;
    }
}
