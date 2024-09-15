/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Main {
    public static void main(String[] args) {
        // membuat objek dari class kendaraan
        kendaraan gems = new kendaraan ("Avanza ", 150, "NR-VE");
        // menampilkan informasi kendaraan dgn memanggil info kendaran
        gems.infokendaraan();
        //  membuat objek dari class mobil
        mobil gema = new mobil ("Toyota ", 200, "Wankel", 4);
        // menampilkan info kendaraan
        gema.infomobil();
        // Menggubah nama kendaraan
        gems.setnama("Xenia");
        // menampilkan info kendaraan yang telah diubah nama nya
        System.out.println("\n Setelah melakukan perubahan nama: ");
        gems.infokendaraan();  
    }
}
