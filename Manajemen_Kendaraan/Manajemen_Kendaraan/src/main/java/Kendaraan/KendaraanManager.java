/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

import java.util.ArrayList;
import java.util.List;

public class KendaraanManager implements KendaraanCRUD {
    private List<Kendaraan> daftarKendaraan = new ArrayList<>();

    @Override
    public void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
    }

    @Override
    public void hapusKendaraan(String nomorPlat) {
        daftarKendaraan.removeIf(kendaraan -> kendaraan.getNomorPlat().equals(nomorPlat));
    }

    @Override
    public Kendaraan cariKendaraan(String nomorPlat) {
        for (Kendaraan kendaraan : daftarKendaraan) {
            if (kendaraan.getNomorPlat().equals(nomorPlat)) {
                return kendaraan;
            }
        }
        return null;
    }

    @Override
    public List<Kendaraan> getAllKendaraan() {
        return daftarKendaraan;
    }
}

