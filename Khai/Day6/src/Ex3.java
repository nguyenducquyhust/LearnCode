import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n là số nguyên dương : ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("nhập sai vui lòng nhập lại");
            return;
        }
        int chuoiNguyenTo = 0;
        int i = 2;
        while (chuoiNguyenTo < n) {
            if (kiemTraSoNguyenTo(i)){
                System.out.println(i);
                chuoiNguyenTo++;

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
