/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objekgeometri;

/**
 *
 * @author widya
 */
public class Lingkaran extends ObjekGeometri {

    public double radius; // Properti baru

    // Konstruktor dengan parameter
    public Lingkaran(String color, int sides, double radius) {
        super(color, sides);
        this.radius = radius;
    }

    // Override method
    @Override
    public void display() {
        super.display();
        System.out.println("Radius: " + radius);
    }
}
