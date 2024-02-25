import java.util.Scanner;

public class Ex4D6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap cac so nguyen duong n : ");
        int n = scanner.nextInt();

        System.out.println("Các số nguyên tố nhỏ hơn " + n + " là: ");

     for (int i = 2; i < n; i++) {
         if (isPrimeNumber(i)) {
             System.out.println(i + " ");
           }
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
