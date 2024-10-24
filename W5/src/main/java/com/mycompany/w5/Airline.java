/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w5;

/**
 *
 * @author ARIEF
 */
public class Airline extends Pesawat {
    private int kapasitas;
    private Pilot pilot;  // Composition

    public Airline(String model, String pabrikan, int capacity, Pilot pilot) {
        super(model, pabrikan);
        this.kapasitas = capacity;
        this.pilot = pilot;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public Pilot getPilot() {
        return pilot;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + kapasitas);
        pilot.displayInfo();
    }
}
