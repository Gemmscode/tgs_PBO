/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class SepedaMotor extends Kendaraan {
    String jenismesin;
    
    @Override
    public void tampilkaninfo(){
        super.tampilkaninfo();
        System.out.println("Jenis mesin motor : " + jenismesin);
    }
}
