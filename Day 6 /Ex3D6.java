import java.awt.*;
import java.util.Scanner;

public class Ex3D6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so luong so nguyen to can liet ke : ");
        int n = scanner.nextInt();

        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
                dem++;
            }
            i++;

        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        //Để kiểm tra, chúng ta chỉ cần kiểm tra các ước số của 29 từ 2 đến căn bậc hai của 29, tức là từ 2 đến 5.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
