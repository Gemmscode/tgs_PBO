/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_3.newpackage;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Hewan {
    private String nama;
    private int umur;
    
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;  
    }    
    public String getnama(){
        return nama;
    }    
    public void setnama(String nama) {
        this.nama = nama;
    }    
    public int getumur() {
        return umur ;        
    }    
    public void setumur(int umur) {
        this.umur = umur ;
    }    
    void suara() {
        System.out.println("Hewan Bersuara");
    }
    void info() {
        System.out.println("Nama: "+ getnama()+ ", Umur: "+ getumur());
    }
    void berlari() {
    System.out.println("Hewan sedang berlari") ;
    }
}
