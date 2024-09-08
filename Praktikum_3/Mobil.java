/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_3.newpackage;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    public Mobil (String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    
    public String getmerk(){
        return merk;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    public String getmodel(){
        return model;
    }
    public void setmodel(String model){
        this.model = model;
    }
    public int gettahun(){
        return tahun;
    }
    public void settahun(int tahun){
        this.tahun = tahun;
    }
    public String getwarna() {
        return warna;
    }
    public void setwarna(String warna){
        this.warna = warna;
    }
    public void displayinfo() {
        System.out.println("Merk mobil ini adalah "+ merk + 
                ", yang memiliki model "+ model +
                ", Dan merupakan generasi tahun "+ tahun +
                ", serta memiliki warna "+ warna);        
    }
    public void startengine(){
        System.out.println("Mesin mobil "+ merk + " Menyala");
    }
    public void ubahwarna(String warnabaru) {
        this.warna = warnabaru;
        System.out.println("Mobil "+ model + " diubah warna, menjadi " + warnabaru);
    }
}
