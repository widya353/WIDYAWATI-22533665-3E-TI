/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objekgeometri;

/**
 *
 * @author widya
 */
public class ObjekGeometri {

    private String color = "red";
    private int sides; // Properti baru

    // Konstruktor dengan parameter
    public ObjekGeometri(String color, int sides) {
        this.color = color;
        this.sides = sides;
    }

    // Getter dan setter untuk sides
    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    // Override method
    public void display() {
        System.out.println("Color: " + getColor());
        System.out.println("Number of sides: " + getSides());
    }
}
