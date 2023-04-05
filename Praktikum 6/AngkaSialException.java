/**
* File	: AngkaSialException.java 01/04/23
* Penulis	: Thifa Ziada Taqiyya / 24060121130080
* Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13!
*
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}