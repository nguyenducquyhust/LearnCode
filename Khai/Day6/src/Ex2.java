import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi thu nhat: ");
        String str1 = scanner.nextLine();
        System.out.println("nhap chuoi thu hai: ");
        String str2 = scanner.nextLine();
        if (str1.contains(str2)){
            System.out.println("chuoi 1 co chua chuoi 2");
        }else {
            System.out.println("chuoi 1 khong chua chuoi 2");
        }
    }
}
