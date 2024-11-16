/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.Tugas;

/**
 *
 * @author Najmi Mukia Barkah
 */
public class Main2 {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Lebah Ganteng");
        Pengarang pengarang2 = new Pengarang("Gema.r");

        Buku2 buku1 = new Buku2("Buku ku,terjemahan ku", pengarang1);
        Buku2 buku2 = new Buku2("Hati Biru", pengarang2);

        Perpustakaan2 perpustakaan = new Perpustakaan2();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        perpustakaan.tampilkanBuku();// informasi semua buku di perpustakaan
    }
}
