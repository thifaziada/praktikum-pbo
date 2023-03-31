package org.bangundatar;

/**
*	Lingkaran.java 25/03/2023
*	Penulis : Thifa Ziada Taqiyya
*	Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
*
*/

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}