import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Moi nhhap a ");
        a = scanner.nextInt();
        System.out.println(" Moi nhap b ");
        b = scanner.nextInt();
        long sum = 0;
        sum = a + b;
        System.out.println("RESULT = " + sum);
    }
}
