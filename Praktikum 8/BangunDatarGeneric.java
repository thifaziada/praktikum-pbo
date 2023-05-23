/** 
File      : BangunDatarGeneric.java
Pembuat   : Thifa Ziada Taqiyya
NIM       : 24060121130080
Tanggal   : 17 Mei 2023
Lab       : B1
Deskripsi : kelas konstruksi generic untuk BangunDatar
**/

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}
//Mengganti 'T' dengan karakter lain, seperti T1, T2, T1234 merupakan salah satu metode untuk memberikan nama pada parameter genetik yang lebih deskriptif. 
//Metode ini bertujuan untuk memberikan fleksibilitas dan membedakan jika terdapat lebih dari satu parameter generik dalam kelas.
