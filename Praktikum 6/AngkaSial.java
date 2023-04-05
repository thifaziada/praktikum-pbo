/**
* File	: AngkaSial.java 01/04/23
* Penulis	: Thifa Ziada Taqiyya / 24060121130080
* Deskripsi	: Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan throws'
*
*/

public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}

	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}
//PERTANYAAN: 
//Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
//Jawab : tidak, karena Ketika sebuah eksepsi terjadi, maka program akan mencari 
//	blok penanganan eksepsi yang cocok sedangkan pada baris 12 bukanlah kode 
//	untuk penanganan eksepsi yang cocok untuk menangani eksepsi yang terjadi, 
//	maka baris 12 pada program tersebut tidak dieksekusi

//Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
//Jawab : ya, karena Ketika sebuah eksepsi (exception) terjadi dalam program Java, 
//	maka alur eksekusi program normal akan terhenti dan program akan mencari 
//	blok penanganan eksepsi (exception handling block) yang cocok untuk menangani 
//	eksepsi tersebut, yaitu ditemukan pada baris 21, maka kode di dalam baris 21 
//	akan dieksekusi untuk menangani eksepsi tersebut.
