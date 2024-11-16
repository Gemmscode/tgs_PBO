/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.Tugas;

import java.util.ArrayList;
import java.util.List;

class Perpustakaan2 {
    private ArrayList<Buku2> daftarBuku; 

    public Perpustakaan2() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku2 buku) {
        daftarBuku.add(buku); // Untuk menambahkan buku ke daftarbuku
    }

    public void tampilkanBuku() {
        // Untuk menampilkan informasi buku di daftarbuku
        for (Buku2 buku : daftarBuku) {
             buku.infoBuku();
        } 
    }
}
