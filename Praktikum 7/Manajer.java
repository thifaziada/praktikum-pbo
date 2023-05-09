/*
 * File : Manajer.java  (03/05/2023)
 * Penulis : Thifa Ziada Taqiyya (24060121130080)
 * Deskripsi : Kelas Manajer yang merupakan turunan dari kelas Pegawai
 */

public class Manajer extends Pegawai{
	private int tunjangan = 700000;

	public Manajer(String nama){
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.println("Tunjangan: "+tunjangan);
	}
}