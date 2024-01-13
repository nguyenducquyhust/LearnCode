import java.util.Scanner;

public class Buoi1_ex1_1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Moi nhhap a ");
        a = scanner.nextInt();
        System.out.println(" Moi nhap b ");
        b = scanner.nextInt();
        long sum = 0;
        sum = a + b;
        System.out.println("Tong 2 so = " + sum);
    }
}

