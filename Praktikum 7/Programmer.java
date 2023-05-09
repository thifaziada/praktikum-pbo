/*
 * File : Programmer.java  (03/05/2023)
 * Penulis : Thifa Ziada Taqiyya (24060121130080)
 * Deskripsi : Kelas Programmer yang merupakan turunan dari kelas Pegawai
 */

public class Programmer extends Pegawai {
	private int bonus = 450000;

	public Programmer(String nama) {
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.println("Bonus : "+bonus);
	}
}