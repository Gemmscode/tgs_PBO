/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Main2 {
    public static void main(String[] args) {
        // membuat objek kucing
        Kucing kucing = new Kucing ();
        kucing.nama = "Kelly";
        kucing.jenis = "Kucing";
        kucing.jeniskucing = "Anggora";
        kucing.tampilkaninfo();
        kucing.suarakhas();
        
        // Membuat objek anjing
        Anjing anjing = new Anjing();
        anjing.nama = "Gogo";
        anjing.jenis = "Anjing";
        anjing.jenisanjing = "Bulldog";
        anjing.tampilkaninfo();
        anjing.suarakhas();
        
    }
}
