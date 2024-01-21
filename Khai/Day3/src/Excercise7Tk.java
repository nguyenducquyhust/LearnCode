import java.util.Scanner;

public class Excercise7Tk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input araay
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        // another method for input
        /* System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } */

        // tìm giá trị dương đầu tiên trong mảng
        int result = findFirstPositive(arr);
        // Tại sao phương thức này dã tìm ra giá trị dương ròi còn cần kieermtra ?

        // Kiểm tra
        if (result == -1) {
            System.out.println("Không có giá trị dương nào trong mảng");
        } else {
            System.out.println("Giá trị dương đầu tiên trong mảng là: " + result);
        }
    }
    /* Phương thức findFirstPositive()
     duyệt qua từng phần tử trong mảng
     và trả về phần tử đầu tiên có giá trị dương */

    // Phương thức này với int result bên trên có liên quan j đến nhau
    public static int findFirstPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return arr[i];
            }
        }
        return -1;
    }
    //
}