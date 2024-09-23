/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobilgema = new Mobil();
        mobilgema.nama = "Toyota";
        mobilgema.kecepatan = 300;
        mobilgema.jumlahpintu = 4;

        
        SepedaMotor motorgema = new SepedaMotor();
        motorgema.nama = "Yamaha";
        motorgema.kecepatan = 130;
        motorgema.jenismesin = "2-tak";
        motorgema.tampilkaninfo();
    }
}
