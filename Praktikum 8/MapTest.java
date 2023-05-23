/** 
File      : MapTest.java
Pembuat   : Thifa Ziada Taqiyya
NIM       : 24060121130080
Tanggal   : 17 Mei 2023
Lab       : B1
Deskripsi : program yang menggunakan Generic untuk pasangan Kunci-Nilai
**/

import java.util.*;

public class MapTest {
	public static void main(String[] args){
        	//kunci -> integer, nilai -> string 
        	Map<Integer, String> map = new HashMap<>();
        	// menempatkan elemen kunci dan nilai
        	map.put(1, "satu");
        	map.put(2, "dua");
        	//mengambil elemen pertama
        	System.out.println(map.get(1));
        	//mengambil keseluruhan kunci sebagai objek collection set
        	Set<Integer> key = map.keySet();
		//iterasi untuk mengambil keseluruhan nilai dari kunci
		for (Integer k : key){
			String value = map.get(k);
			System.out.println(value);
		}
	}
}