/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Main {
    public static void main(String[] args) {
        Hewan kelly = new Kucing();
            kelly.bersuara();
            
            Kucing kucing = new Kucing();
            kucing.makan("ikan");  // Memanggil metode makan() dari kelas Hewan
            kucing.makan("ikan",3); // Memanggil metode makan() dari kelas Hewan yang overloaded
            
            Anjing anjing = new Anjing();
            anjing.bersuara(); // Memanggil metode bersuara() dari kelas Anjing 'Guk-guk'
            anjing.makan("daging", 3); // Memanggil metode makan()yg overloaded dari kelas Hewan
    }
}
