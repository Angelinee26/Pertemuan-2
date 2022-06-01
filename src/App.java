import bangunruang.Tabung;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang di Mata Kuliah \" Pemrograman Berorientasi Objek \" ";
        int tahun = 2022;

        System.out.println("***************************************************************************");
        System.out.println(pesan + " Tahun " + tahun);
        System.out.println("***************************************************************************");
        
    //Scan inputan keyboard
    Scanner keyboard = new Scanner(System.in);
    
    Tabung tabung = new Tabung();
    System.out.println("Input Jari-jari = ");
    tabung.r = keyboard.nextInt();
    System.out.println("Input Tinggi = ");
    tabung.t = keyboard.nextInt();

    //tampilkan volume tabung
    tabung.tampilkanVolumeTabung();

    keyboard.close();
    }
    
}
