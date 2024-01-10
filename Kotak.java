/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objekgeometri;

/**
 *
 * @author widya
 */
public class Kotak extends ObjekGeometri {

    public double sideLength; // Properti baru

    // Konstruktor dengan parameter
    public Kotak(String color, int sides, double sideLength) {
        super(color, sides);
        this.sideLength = sideLength;
    }

    // Override method
    @Override
    public void display() {
        super.display();
        System.out.println("Side Length: " + sideLength);
    }
}
