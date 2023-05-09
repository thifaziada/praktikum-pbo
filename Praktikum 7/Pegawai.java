/*
 * File : Pegawai.java  (03/05/2023)
 * Penulis : Thifa Ziada Taqiyya (24060121130080)
 * Deskripsi : Superclass dari Kelas Programmer dan Manajer
 */

public class Pegawai{
	String nama;
	int gajiPokok = 5000000;

	public void setNama(String nama){
		this.nama = nama;
	}

	public void tampilData(){
		System.out.println("Nama : "+nama +", Gaji Pokok : "+gajiPokok);
	}
}