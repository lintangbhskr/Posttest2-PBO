/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

public class Motor extends Kendaraan {
    private final int jumlahRoda = 2;

    public Motor(String nomorPlat, String merk) {
        super(nomorPlat, merk);
    }

    @Override
    public void tampilInfo() {
        System.out.println("Jenis: Motor");
        System.out.println("Nomor Plat: " + getNomorPlat());
        System.out.println("Merk: " + getMerk());
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
