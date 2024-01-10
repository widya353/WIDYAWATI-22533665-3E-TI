/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objekgeometri;

/**
 *
 * @author widya
 */
public class Segitiga extends ObjekGeometri {

    public double base; // Properti baru
    public double height; // Properti baru

    // Konstruktor dengan parameter
    public Segitiga(String color, int sides, double base, double height) {
        super(color, sides);
        this.base = base;
        this.height = height;
    }

    // Override method
    @Override
    public void display() {
        super.display();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }
}
