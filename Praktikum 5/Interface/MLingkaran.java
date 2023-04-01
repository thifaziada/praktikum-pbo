
/**
 * MLingkaran.java 25/03/2023
 * Penulis : Thifa Ziada Taqiyya
 * Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
 *
 */
import java.util.Scanner;
import org.bangundatar.Lingkaran;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jejer lingkaran: ");
        double jejari = input.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan jejer " + jejari + " adalah " + lingkaran.hitungLuas());

        input.close();
    }
}
