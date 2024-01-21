import java.util.Scanner;

public class Excercise8Tk {
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
        //gọi giá trị chẵn cuối
        int lastEven = findLastEven (arr);
        if (lastEven == -1) {
            System.out.println("Không có số chẵn nào trong mảng");
        } else {
            System.out.println("Số chẵn cuối cùng trong mảng là: " + lastEven);
        }



    }
    public static int findLastEven(int[] arr) {
        int i = arr.length - 1;
        while (i >= 0 && arr[i] % 2 != 0) {
            i--;
        }
        return i >= 0 ? arr[i] : -1;
    }
}