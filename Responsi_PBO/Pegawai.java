/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_PBO;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Pegawai {
    private String NamaPegawai;
    private double gaji;
    
    public Pegawai(String NamaPegawai, double gaji){
        this.NamaPegawai = NamaPegawai;
        this.gaji = gaji;
    }
    
    public String getNamaPegawai(){
        return NamaPegawai;
    }
    public void setNamaPegawai(String NamaPegawai){
        this.NamaPegawai = NamaPegawai;
    }
    public double getgaji(){
        return gaji;
    }
    public void setgaji(double gaji){
        this.gaji = gaji;
    }
    
    public void tampilkaninfo(){
        System.out.println("Nama Pegawai : " + getNamaPegawai());
        System.out.println("Gaji         : " + "Rp " + getgaji() + " Jt");
    }
}
