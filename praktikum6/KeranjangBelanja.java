/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja(List<Produk> produklist) {
        this.produkList = produklist;
    }

    public void addProduk(Produk produk) {
        produkList.add(produk);
    }

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (Produk produk : produkList) {
            double hargaSetelahDiskon = produk.harga - produk.hitungdiskon();
            totalHarga += hargaSetelahDiskon;
        }
        return totalHarga;
    }

    public void displayKeranjang() {
        double totalHarga = 0;
        double totalDiskon = 0;
        for (Produk produk : produkList) {
            System.out.println("Nama: " + produk.nama);
            double hargaAsli = produk.harga;
            double hargaDiskon = produk.harga - produk.hitungdiskon();
            double diskon = hargaAsli - hargaDiskon;
            double diskonPersen = (diskon / hargaAsli) * 100;
            System.out.println("Harga asli: " + hargaAsli);
            System.out.println("Diskon: " + diskonPersen + "%");
            System.out.println("Harga setelah diskon: " + hargaDiskon);
            System.out.println();
            totalHarga += hargaDiskon;
            totalDiskon += diskon;
        }
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Total diskon: " + totalDiskon);
    }
}