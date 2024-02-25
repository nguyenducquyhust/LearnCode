import java.util.Scanner;

public class Ex2D6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi s1 : ");
        String s1 = scanner.nextLine();

        System.out.println("Nhap chuoi s2 : ");
        String s2 = scanner.nextLine();

        if (kiemTraChuoi(s1,s2)) {
            System.out.println(" Chuoi s1 chua chuoi s2 ");
        }else {
            System.out.println(" Chuoi s1 khong chua chuoi s2 ");
        }

    }
    public static boolean kiemTraChuoi(String s1 ,String s2) {
        return s1.contains(s2);
    }
}
