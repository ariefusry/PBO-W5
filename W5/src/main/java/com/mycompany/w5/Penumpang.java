/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w5;

/**
 *
 * @author ARIEF
 */
public class Penumpang {
    private String nama;
    private Airline airline;  // Association

    public Penumpang(String nama, Airline airline) {
        this.nama = nama;
        this.airline = airline;
    }

    public String getNama() {
        return nama;
    }

    public Airline getPlane() {
        return airline;
    }

    public void displayInfo() {
        System.out.println("Passenger Name: " + getNama());
    }
}
