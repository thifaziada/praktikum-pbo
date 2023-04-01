
/*
*BangunDatar.java 25/03/23
* Penulis: Thifa Ziada Taqiyya
* Deskripsi: kelas abstrak, berisi abstraksi bangun datar
*/

package org.bangundatar.BangungDatar;

public abstract class BangunDatar{
	
	protected double luas;
	
	public abstract double hitungLuas (double sisi);
	
	public void setLuas (double a) {
		luas = a;
	}

	public double getLuas (){
		return luas;
	}
}