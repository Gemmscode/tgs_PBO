/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Matematika");
        Buku buku2 = new Buku("Fisika");
        Buku buku3 = new Buku("Algoritma pemrograman");
        
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        System.out.println("----Informasi Perpustakaan----");
        perpustakaan.infoperpustakaan();

       
        Anggota anggota1 = new Anggota("Gema");
        Anggota anggota2 = new Anggota("Dhila");
        Anggota anggota3 = new Anggota("Majidah");

        
        Klub klub = new Klub("Klub Pengarang Handal");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);

        
        System.out.println("\n----nformasi Klub----");
        klub.infoKlub();
    }
}
