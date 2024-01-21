import java.util.Scanner;
public class Excercise6 {
    public static void main(String[] args) {
//        //input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input number to array: ");
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//        //dk
//        for (int i = 0; i < n; i++){
//            if (array[i]%5 == 0){
//                System.out.println(array[i]);
//            }
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 5 == 0) {
                sum += array[i];
            }
        }

        System.out.println("Tổng các phần tử chia hết cho 5 trong mảng là: " + sum);

    }
}
