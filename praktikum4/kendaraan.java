/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class kendaraan {
    private String nama;            // hanya bisa diakses dalam class ini
    protected int kecepatanmaks;    // bisa diakses dipackage yg sama dan subclass
    public String jenismesin;       // bisa diakses dari mana saja
    
    // constructor
    public kendaraan(String nama, int kecepatanmaks, String jenismesin){
        this.nama = nama;
        this.kecepatanmaks = kecepatanmaks;
        this.jenismesin = jenismesin;
    }
    // Getter dan setter untuk varibel private nama
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    // method public untuk menampilkan informasi kendaraan
    public void infokendaraan(){
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan maksimum : " + kecepatanmaks + "Km/H");
        System.out.println("Jenis mesin : " + jenismesin);
    }

}
