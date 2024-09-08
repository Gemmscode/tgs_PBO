/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_3.newpackage;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Main2 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Avanza", "CVT TSS", 2015, "silver");
        Mobil mobil2 = new Mobil("Toyota", "Rush", 2023, "putih");
        
        mobil1.displayinfo();
        mobil1.startengine();
        mobil1.ubahwarna("Ungu");
        mobil1.displayinfo();
        
        mobil2.displayinfo();
        mobil2.startengine();
        mobil2.ubahwarna("Hijau");
        mobil2.displayinfo();
    }
}
