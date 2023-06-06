/**
 * Penulis 	: Thifa Ziada Taqiyya 31/05/2023
 * File 	: LambdaHashmap.java
 * Deskripsi 	: Implementasi lambda pada Hashmap
**/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashmap {
    public static void main(String[] args) {
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(30080, "Thifa Ziada Taqiyya");
        mahasiswaMap.put(40128, "Athiya Puteri Hidayat");
        mahasiswaMap.put(40164, "Zenobia Wirandi Zenaide");
        mahasiswaMap.put(40100, "Zhafira Amanda");


        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
