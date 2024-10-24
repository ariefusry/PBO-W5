/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w5;

/**
 *
 * @author ARIEF
 */
public class Pesawat {
    private String model;
    private String pabrikan;
    
    public Pesawat(String model, String pabrikan) {
        this.model = model;
        this.pabrikan = pabrikan;
    }

    public String getModel() {
        return model;
    }

    public String getPabrikan() {
        return pabrikan;
    }

    public void displayInfo() {
        System.out.println("Model: " + getModel() + ", Manufacturer: " + getPabrikan());
    }
}
