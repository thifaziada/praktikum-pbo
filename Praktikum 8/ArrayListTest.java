/** 
File      : ArrayListTest.java
Pembuat   : Thifa Ziada Taqiyya
NIM       : 24060121130080
Tanggal   : 17 Mei 2023
Lab       : B1
Deskripsi : program penggunaan objek ArrayList sebagai collection class
**/

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//insisalisasi ArrayList yang hanya dapat berisi objek string
		ArrayList<String> strings = new ArrayList<String>() ;
		//menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		//menghapus elemen
		strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
		for(String s : strings){
			System.out.print(s+" ");
		}
	}
}