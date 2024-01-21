import java.util.Scanner;

public class Excercise9Tk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = findSmallestPositiveIndex(arr);

        if (index == -1) {
            System.out.println("Không có số dương nào trong mảng");
        } else {
            System.out.println("Vị trí phần tử dương nhỏ nhất trong mảng là: " + index);
        }
    }

    public static int findSmallestPositiveIndex(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}