/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_PBO;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Elektronik extends Produk{
    private int garansi;
    
    public Elektronik(String NamaProduk, int harga, int garansi){
        super (NamaProduk, harga);
        this.garansi = garansi;  
    }
    
    public int getgaransi(){
        return garansi;
    }
    
    @Override
    public void tampilkaninfo(){
        System.out.println("- Produk Elektronik");
        super.tampilkaninfo();
        System.out.println("Garansi      : " + garansi);
    }
    
}
