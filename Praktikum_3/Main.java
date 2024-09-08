/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_3.newpackage;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Main {
    public static void main(String[] args){
        Hewan kucing = new Hewan("Asku", 2);
        kucing.suara();
        kucing.info();
        
        Hewan anjing = new Hewan("fisa", 3);
        anjing.berlari();
        anjing.info();
    }
}
