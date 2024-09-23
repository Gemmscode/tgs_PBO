/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Anjing extends HewanDarat{
    String jenisanjing;
    
    @Override
    public void tampilkaninfo(){
        super.tampilkaninfo();
        System.out.println("Jenis anjing : " + jenisanjing);
    }
    // Method suara khas anjing
    public void suarakhas(){
        System.out.println("Suara khas dari anjing adalah = Gukk-gukk!!");
    }
}
