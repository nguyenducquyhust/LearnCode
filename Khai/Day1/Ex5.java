import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập câu: ");
        String cau = scanner.nextLine();

        System.out.print("Nhập từ cần đếm: ");
        String tu = scanner.nextLine();

        // Tách câu thành các từ
        String[] tuMoi = cau.split(" ");

        // Đếm số lần từ cần đếm xuất hiện
        int Times = 0;
        for (String t : tuMoi) {
            if (t.equals(tu)) {
                Times++;
            }
        }

        // In kết quả
        System.out.println("Số lần từ " + tu + " xuất hiện trong câu là: " + Times);
    }
}
