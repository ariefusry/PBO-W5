/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w5;

/**
 *
 * @author ARIEF
 */
public class Penerbangan {
    private String flightNumber;
    private Airline airline;  // Association
    private Penumpang[] arrP; // Aggregation

    public Penerbangan(String flightNumber, Airline airline, Penumpang[] arrP) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.arrP = arrP; // Aggregating Penumpang
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airline getPlane() {
        return airline;
    }

    public Penumpang[] getArrP() {
        return arrP;
    }

    public void displayInfo() {
        System.out.println("Flight Number: " + flightNumber);
        airline.displayInfo();
        System.out.println("Passengers:");
        for (int i = 0; i < arrP.length;i++) {
            getArrP()[i].displayInfo(); // Menampilkan setiap penumpang
        }
    }
}
