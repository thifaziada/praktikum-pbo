/** 
File      : Lingkaran.java
Pembuat   : Thifa Ziada Taqiyya
NIM       : 24060121130080
Tanggal   : 17 Mei 2023
Lab       : B1
Deskripsi : implementasi Lingkaran sebagai BangunDatar
**/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungkeliling(){
        return 2*jejari*3.14;
    }
}