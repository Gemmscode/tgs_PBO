/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author Najmi Mukia Barkah
 */
public class Main2 {
    public static void main(String[] args) {
        List<Produk> listproduk = new ArrayList<>();
        listproduk.add(new Buku ("kalkulus", 24000, 50));
        listproduk.add(new Elektronik ("Kulkas", 1500000, 40));
        listproduk.add(new Pakaian ("Baju Koko", 140000, 10));
        
        KeranjangBelanja keranjang = new KeranjangBelanja(listproduk);
        
        System.out.println("Keranjang Belanja : ");
        keranjang.displayKeranjang();
    }
        

}
