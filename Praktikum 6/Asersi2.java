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
// program diatas jika dijalankan menggunakan enableassertions akan mengeluarkan output "jari jari tidak boleh nol" karena jari-jari diinisialiasikan
// dengan nilai nol, jika ingin memastikan bahwa asersi itu berhasil  maka nilai jari-jari harus di inisiliasikan dengan angka > nol.
