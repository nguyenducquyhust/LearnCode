import java.util.Scanner;

public class Ex5D6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so thu " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Cac phan tu cua mang : ");
        show(arr);

        System.out.println("----------------------");

        sapXep(arr);
        System.out.println("Sap xep cac phan tu tu be den lon : ");
        show(arr);

        System.out.println("------------");

        System.out.print("Nhap phan tu k can chen vao mang : ");
        int k = scanner.nextInt();


        int[] arr1 = new int[n+1];
        // Sao chép các phần tử từ mảng arr sang arr1
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }

        System.out.println(" arr1 ddaay nafy");
        show(arr1);


        // Chèn phần tử mới vào mảng mới
        arr1[n] = k;


        // Sao chép các phần tử còn lại từ mảng cũ sang mảng mới
//        for (int i = n; i < n; i++) {
//            arr1[i + 1] = arr[i];
//        }

        // chenPhantu(arr1, k);
        sapXep(arr1);
        System.out.print("Mang sau khi chen phan tu " + k + " la: ");
        show(arr1);

    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println(); // In xuống dòng sau khi hiển thị mảng
    }

    public static void sapXep(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
//    public static void chenPhantu(int[] arr1, int k) {
//        int i = arr1.length - 1;
//        // Dịch phải các phần tử lớn hơn k
//        while (i >= 0 && arr1[i] > k) {
//            arr1[i + 1] = arr1[i];
//            i--;
//        }
//    }
}
