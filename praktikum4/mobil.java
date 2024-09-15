/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class mobil extends kendaraan {
    private int jumlahpintu;  // Atribut tambahan khusus untuk mobil
    
    // Constructor
    public mobil(String nama, int kecepatanmaks, String jenismesin, int jumlahpintu){
        super (nama, kecepatanmaks, jenismesin);
        this.jumlahpintu = jumlahpintu;
    }
    
    // Method untuk menampilkan informasi mobil
    public void infomobil(){
        // Dapat mengakses kecepatanmaks kerna protected
        System.out.println("\nNama Kendaraan : " + getnama());
        System.out.println("Kecepatan maksimum : " + kecepatanmaks + "Km/H");
        System.out.println("Jenis mesin : " + jenismesin);
        System.out.println("Jumlah pintu mobil : " + jumlahpintu);
    }
    
}
