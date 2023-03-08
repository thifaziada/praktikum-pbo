/*
	Nama File 		: Titik.java
	Hari, Tanggal 	: Rabu, 1 Maret 2023
	Pembuat 		: Thifa Ziada Taqiyya
	NIM 			: 24060121130080
	Deskripsi		: Kelas untuk Titik
	
	
*/
public class Titik{
	//atribut
	double absis;
	double ordinat;
	static int counterTitik;
	
	//konstruktor
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double x, double y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}

	Titik(int x, int y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}
	//metode
	void setAbsis(double a){
		absis = a;
	}

	void setOrdinat(double o) {
		ordinat = o;
	}

	double getAbsis() {
		return absis;
	}

	double getOrdinat() {
		return ordinat;
	}

	static int getCounterTitik() {
		return counterTitik;
	}
}