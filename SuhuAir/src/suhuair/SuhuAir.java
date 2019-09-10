package suhuair;
import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args){
        int T;

        System.out.print("Suhu = ");

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        if (T < 0) {
            System.out.println("Wujud air beku");
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Wujud air cair");
        } else if (T > 100) {
            System.out.println("Wujud air uap/gas");
        }
    }
}
