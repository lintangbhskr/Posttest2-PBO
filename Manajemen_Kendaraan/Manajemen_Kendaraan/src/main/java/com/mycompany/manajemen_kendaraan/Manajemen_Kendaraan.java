/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manajemen_kendaraan;
import java.util.Scanner;
import kendaraan.Kendaraan;
import kendaraan.KendaraanManager;
import kendaraan.Mobil;
import kendaraan.Motor;
/**
 *
 * @author Acer GK
 */
public class Manajemen_Kendaraan {
    public static void main(String[] args) {
        KendaraanManager manager = new KendaraanManager();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Manajemen Kendaraan ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Lihat Semua Kendaraan");
            System.out.println("3. Cari Kendaraan");
            System.out.println("4. Hapus Kendaraan");
            System.out.println("5. Update Kendaraan");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    // Menambah kendaraan
                    System.out.print("Masukkan jenis kendaraan (Mobil/Motor): ");
                    String jenis = scanner.nextLine();
                    System.out.print("Masukkan nomor plat: ");
                    String nomorPlat = scanner.nextLine();
                    System.out.print("Masukkan merk: ");
                    String merk = scanner.nextLine();

                    if (jenis.equalsIgnoreCase("Mobil")) {
                        manager.tambahKendaraan(new Mobil(nomorPlat, merk));
                    } else if (jenis.equalsIgnoreCase("Motor")) {
                        manager.tambahKendaraan(new Motor(nomorPlat, merk));
                    } else {
                        System.out.println("Jenis kendaraan tidak valid.");
                    }
                    break;

                case 2:
                    // Melihat semua kendaraan
                    System.out.println("=== Daftar Kendaraan ===");
                    for (Kendaraan kendaraan : manager.getAllKendaraan()) {
                        kendaraan.tampilInfo();
                        System.out.println();
                    }
                    break;

                case 3:
                    // Mencari kendaraan
                    System.out.print("Masukkan nomor plat kendaraan yang dicari: ");
                    String platDicari = scanner.nextLine();
                    Kendaraan kendaraanDitemukan = manager.cariKendaraan(platDicari);
                    if (kendaraanDitemukan != null) {
                        System.out.println("Kendaraan ditemukan:");
                        kendaraanDitemukan.tampilInfo();
                    } else {
                        System.out.println("Kendaraan tidak ditemukan.");
                    }
                    break;

                case 4:
                    // Menghapus kendaraan
                    System.out.print("Masukkan nomor plat kendaraan yang akan dihapus: ");
                    String platDihapus = scanner.nextLine();
                    manager.hapusKendaraan(platDihapus);
                    System.out.println("Kendaraan dengan nomor plat " + platDihapus + " telah dihapus.");
                    break;

                case 5:
                    // Update kendaraan
                    System.out.print("Masukkan nomor plat kendaraan yang akan diupdate: ");
                    String platUpdate = scanner.nextLine();
                    Kendaraan kendaraanUpdate = manager.cariKendaraan(platUpdate);
                    if (kendaraanUpdate != null) {
                        System.out.print("Masukkan merk baru: ");
                        String merkBaru = scanner.nextLine();
                        kendaraanUpdate.setMerk(merkBaru); // Update merk
                        System.out.println("Kendaraan telah diupdate:");
                        kendaraanUpdate.tampilInfo();
                    } else {
                        System.out.println("Kendaraan tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 0);

        scanner.close();
    }
}