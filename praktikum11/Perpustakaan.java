/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private List<Buku> bukulist;
    
    public Perpustakaan() {
        this.bukulist = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku){
        bukulist.add(buku);
    }
    
    public void infoperpustakaan(){
        for (Buku buku : bukulist){
            buku.infobuku();
        }
    }
}
