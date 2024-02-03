package Day_6;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhap chuoi s2: ");
        String s2 = scanner.nextLine();
        if (s1.contains(s2)) {
            System.out.println("Chuoi s1 co chua chuoi s2.");
        } else {
            System.out.println("Chuoi s1 khong chua chuoi s2.");
        }
    }
}
