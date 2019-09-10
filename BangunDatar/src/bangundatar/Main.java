package bangundatar;
import java.util.Scanner;
public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang opersegi;
        SegitigaSiku osegitigasiku;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitigasiku = new SegitigaSiku();
        olingkaran = new Lingkaran();

        mainMenu();

        switch (pilihan) {
            case '1': {
                System.out.print("Masukkan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1, s2));
                System.out.print("Keliling persegi panjang: " + opersegi.keliling(s1, s2));
                break;
            }
            case '2': {
                System.out.print("Masukkan sisi 1 segitiga: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan sisi 2 segitiga:  ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + osegitigasiku.luas(s1, s2));
                System.out.print("Keliling Segitiga: " + osegitigasiku.keliling(s1, s2));
                break;
            }
            case '3': {
                System.out.print("Masukkan jari-jari: ");
                s1 = scanner.nextInt();
                System.out.println("Luas lingkaran: " + olingkaran.luas(s1));
                System.out.print("Keliling lingkaran: " + olingkaran.keliling(s1));
                break;
            }
            default: {
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu() {
        System.out.println("====================");
        System.out.println("Hitung luas dan keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga siku");
        System.out.println("3. Lingkaran");
        pilihan = scanner.next().charAt(0);
    }
}
