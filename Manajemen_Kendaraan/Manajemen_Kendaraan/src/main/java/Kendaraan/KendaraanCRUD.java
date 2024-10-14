/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

import java.util.List;

public interface KendaraanCRUD {
    void tambahKendaraan(Kendaraan kendaraan);
    void hapusKendaraan(String nomorPlat);
    Kendaraan cariKendaraan(String nomorPlat);
    List<Kendaraan> getAllKendaraan();
}
