/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_PBO;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Pegawaitetap extends Pegawai{
    private double tunjangan;
    
    public Pegawaitetap(String NamaPegawai, double gaji, double tunjangan){
        super(NamaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    public double gettunjangan(){
        return tunjangan;
    }
    @Override
    public void tampilkaninfo(){
        System.out.println("- Pegawai Tetap");
        super.tampilkaninfo();
        System.out.println("Tunjangan    : " + "Rp "+ tunjangan + " Jt");
    }
    
}
