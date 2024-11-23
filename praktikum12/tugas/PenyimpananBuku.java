/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12.tugas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PenyimpananBuku {
    private static final String TEXT_FILE = "Buku.txt";
    private static final String SERIAL_FILE = "Buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku baru");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File (Serialisasi)");
            System.out.println("4. Tampilkan Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            
            switch (pilihan){
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanBuku();
                case 5 -> {System.out.println("Keluar dari sistem.");
                scanner.close();
                return;
                }
                default -> System.out.println("Pilihan tidak valid,tentukan pilihan dengan benar.");
            }
        }
    }
    
    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul Buku     : ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan nama Pengarang : ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan Tahun terbit   : ");
        int tahunTerbit = scanner.nextInt();
        
        bukuList.add(new Buku(judul, pengarang, tahunTerbit));
        System.out.println("Buku baru berhasil ditambahkan kedalam perpustakaan");
    }
    
    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku produk : bukuList) {
                writer.write(produk.toString() + "\n");}
            System.out.println("Data Buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan Buku ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Buku telah berhasil disimpan ke file serial.");
        } 
        catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan Buku ke file serial.");
            e.printStackTrace();
        }
    }
    private static void tampilkanBuku() {
        System.out.println("Daftar Produk:");
        for (Buku buku : bukuList) {
            buku.tampilkanInfo();
        }
    }
}   
    
    
    
    


    

