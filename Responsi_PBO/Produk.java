/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_PBO;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Produk {
    private String NamaProduk;
    private int harga;
    
    public Produk(String NamaProduk, int harga){
        this.NamaProduk = NamaProduk;
        this.harga = harga;
    }
    
    public String getNamaProduk(){
        return NamaProduk;
    }
    public void setNamaProduk(String NamaProduk){
        this.NamaProduk = NamaProduk;
    }
    public double getharga(){
        return harga;
    }
    public void setharga(int harga){
        this.harga = harga;
    }
    public void tampilkaninfo(){
        System.out.println("Nama Produk  : " + getNamaProduk());
        System.out.println("Harga Produk : " + "Rp " + getharga());
                
    }
}
