package Bai1.Baithucpham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String check = "(0\\d|1[1-9]|2[1-9]|3[01])-(0[1-9]|1[0|1|2])-20\\d{2}";
        ArrayList<Food> arr = new ArrayList<Food>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Nhập mã hàng: ");
            String a = sc.next();
            System.out.print("Nhập đơn giá: ");
            double c = sc.nextDouble();
            LocalDate lc1;
            LocalDate lc2;
            while (true) {
                try {
                    System.out.print("Nhập ngày sản xuất (dd-MM-yyyy): ");
                    String ngaysx = phuhop(check);
                    lc1 = LocalDate.parse(ngaysx, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    break;
                } catch (Exception e) {
                    System.out.println("Ngày không hợp lệ");
                }
            }
            while (true) {
                try {
                    System.out.print("Nhập ngày hết hạn (dd-MM-yyyy): ");
                    String ngayhet = phuhop(check);
                    lc2 = LocalDate.parse(ngayhet, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    break;
                } catch (Exception e) {
                    System.out.println("Ngày không hợp lệ");
                }
            }
            arr.add(new Food(a, c, lc1, lc2));
        }
        for (Food f1 : arr) {
            f1.hethan();
            System.out.println(f1.toString());
        }
    }

    public static String phuhop(String b) {
        while (true) {
            String a = sc.next();
            if (a.matches(b)) {
                return a;
            } else {
                System.out.println("Nhập lại theo định dạng đúng: dd-MM-yyyy");
            }
        }
    }
}
