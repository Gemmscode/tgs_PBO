/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class main2 {
    public static void main(String[] args) {
        Pekerja Pekerja1 = new Pekerja ("Agung",17,"content creator",2000000);
        Pekerja pekerja2 = new Pekerja ("Adam",18,"Atlet",21000000);
        
        System.out.println(Pekerja1.toString());
        System.out.println(pekerja2.toString());
        
       Pekerja1.setnama("Gema");
       
        System.out.println("\nInformasi pekerja terbaru : ");
        System.out.println(Pekerja1.toString());
    }   
}
