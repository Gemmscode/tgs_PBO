/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_PBO;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Makanan extends Produk{
    private String tanggalKadaluwarsa;
    
    public Makanan(String NamaProduk, int harga, String tanggalkadaluwarsa){
        super (NamaProduk, harga);
        this.tanggalKadaluwarsa = tanggalkadaluwarsa;  
    }
    
    public String gettanggalKadaluwarsa(){
        return tanggalKadaluwarsa;
    }
    @Override
    public void tampilkaninfo(){
        System.out.println("- Produk Makanan");
        super.tampilkaninfo();
        System.out.println("Tgl Kadaluwarsa : " + tanggalKadaluwarsa);
    }
    
}
