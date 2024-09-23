/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Kucing extends HewanDarat {
    String jeniskucing;
    
    @Override
    public void tampilkaninfo(){
        super.tampilkaninfo();
        System.out.println("Jenis kucing : " + jeniskucing);
    }
    // Method suara khas kucing
    public void suarakhas(){
        System.out.println("Suara khas dari kucing adalah = Meowww!!");
    }
}
