/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12.tugas;

import java.io.*;

class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    public void tampilkanInfo() {
        System.out.println("-------###-------");        
        System.out.println("Judul Buku     : " + judul);
        System.out.println("Nama Pengarang : " + pengarang);
        System.out.println("Tahun Terbit   : " + tahunTerbit + '\n');
    }
    public String toString() {
        return judul + "," + pengarang + ',' + tahunTerbit ;
    }
}
