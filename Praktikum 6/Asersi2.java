/**
* File	: Asersi2.java 01/04/23
* Penulis	: Thifa Ziada Taqiyya / 24060121130080
* Deskripsi	: Program untuk demo asersi, yang akan menolak input 
* 		jari-jari lingkaran yang bernilai nol
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}
// PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
// JAWAB : pada program diatas terdapat assertion berupa jariJari > 0, yang artinya nilai jariJari hrus lebih dari nol, 
//	pada program diatas jariJari diinisialisasi dengan angka nol, maka ketika dijalankan menggunakan enableassertions 
//	akan mengeluarkan output "jari jari tidak boleh nol", kemudian jika ingin memastikan bahwa asersi itu berhasil
//	maka nilai jari-jari harus di inisiliasikan lebih dari nol.
