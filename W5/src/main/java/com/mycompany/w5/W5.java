/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.w5;

/**
 *
 * @author ARIEF
 */
public class W5 {
    public static void main(String[] args) {
        // Inheritance and Composition
        Pilot pilot = new Pilot("Captain Bagas", "P12345");
        Airline passengerPlane = new Airline("Garuda Indonesia 737", "Boeing", 200, pilot);

        // Association
        Penumpang penumpang1 = new Penumpang("Arthur Pencilgon", passengerPlane);
        Penumpang penumpang2 = new Penumpang("Xavier Mauzin", passengerPlane);

        // Aggregating Penumpang dalam Penerbangan
        Penumpang[] arrP = {penumpang1, penumpang2};
        Penerbangan penerbangan = new Penerbangan("GA123", passengerPlane, arrP);

        // Menampilkan informasi penerbangan dan penumpang
        penerbangan.displayInfo();
    }
}
