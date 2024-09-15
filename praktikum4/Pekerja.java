/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Pekerja extends Manusia {
    private int gaji;
    
    public Pekerja(String nama, int usia, String pekerjaan, int gaji){
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    public int getgaji(){
        return gaji;
    }
    public void setgaji(int gaji){
        this.gaji = gaji;
    }
    
    @Override
    public String toString(){
        return "Informasi Pekerja :\n" + "Nama nya : " + getnama() +
                "\nUsia : " + usia + "\nPekerjaan : " + pekerjaan +
                "Gaji : " + gaji;
    }
    
}
