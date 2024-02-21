import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chương trình sẽ liệt kê số nguyên tố nhỏ hơn n ");
        System.out.println("nhập n là số nguyên dương: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("nhập sai vui lòng nhập lại");
            return;
        } else if (n == 1) {
            System.out.println("không có số nguyên tố nào");
        }

        int i = 2;
        while (i < n) {
            if (kiemTraSoNguyenTo(i)){
                System.out.println("Số nguyên tố là: " + i);
            }
            i++;
        }
    }

    static boolean kiemTraSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
