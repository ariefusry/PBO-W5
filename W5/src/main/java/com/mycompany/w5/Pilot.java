/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w5;

/**
 *
 * @author ARIEF
 */
public class Pilot {
    private String nama;
    private String ATPL;

    public Pilot(String nama, String licenseNumber) {
        this.nama = nama;
        this.ATPL = licenseNumber;
    }

    public String getNama() {
        return nama;
    }

    public String getATPL() {
        return ATPL;
    }

    public void displayInfo() {
        System.out.println("Pilot Name: " + getNama() + ", License Number: " + getATPL());
    }
}
