/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_PBO;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Pegawaikontrak extends Pegawai{
    private int lamakontrak;
    
    public Pegawaikontrak(String NamaPegawai, double gaji, int lamakontrak){
        super(NamaPegawai, gaji);
        this.lamakontrak = lamakontrak;
    }
    
    public int getlamakontrak(){
        return lamakontrak;
    }
    @Override
    public void tampilkaninfo(){
        System.out.println("- Pegawai Kontrak");
        super.tampilkaninfo();
        System.out.println("Lama Kontrak : " + lamakontrak + " Bulan");
    }
    
}
