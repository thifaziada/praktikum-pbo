/*
	Nama File 		: OperasiTitik.java
	Hari, Tanggal 	: Rabu, 1 Maret 2023
	Pembuat 		: Thifa Ziada Taqiyya
	NIM 			: 24060121130080
	Deskripsi		: Kelas yang berisi berbagi operasi terhadap objek titik.
	
	
*/
public class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat *= -1;
		titik.setOrdinat(ordinat);
	}

	private void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		absis *= -1;
		titik.setAbsis(absis);
	}

	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
			return titik;
	}

	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
			return titik;
	}

}