/*
	Nama File 		: MOperasiTitik.java
	Hari, Tanggal 	: Rabu, 1 Maret 2023
	Pembuat 		: Thifa Ziada Taqiyya
	NIM 			: 24060121130080
	Deskripsi		: Program Utama yang memanfaatkan OperasiTitik.
	
	
*/
public class MOperasiTitik{
	public static void main(String[] args){
		Titik t1 = new Titik(4.0,4.0);
		OperasiTitik op = new OperasiTitik();
		
	System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
		

	op.refleksiX(t1);
	System.out.println("Titik setelah refleksi sb X: ("+t1.getAbsis()+","+t1.getOrdinat()+")");
	
	op.refleksiY(t1); 
	System.out.println("Titik setelag refleksi sb Y: ("+t1.getAbsis()+","+t1.getOrdinat()+")");
	}
 }