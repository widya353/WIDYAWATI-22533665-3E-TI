/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objekgeometri;

/**
 *
 * @author widya
 */

public class TestPolymorphism {

    public static void main(String[] args) {
        Kotak persegi = new Kotak("Biru", 4, 5.0);
        Lingkaran lingkaran = new Lingkaran("Hijau", 3, 3.0);
        Persegi persegiKecil = new Persegi("Merah", 4, 2.0);
        Segitiga segitiga = new Segitiga("Kuning", 3, 4.0, 5.0);

        displayObject(persegi);
        displayObject(lingkaran);
        displayObject(persegiKecil);
        displayObject(segitiga);
    }

    public static void displayObject(ObjekGeometri obj) {
        obj.display();
        System.out.println();
    }
}
