import java.util.Scanner;

public class Ex6D5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang 1: ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Nhap cac phan tu cua mang 1: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so thu " + i + ": ");
            arr1[i] = scanner.nextInt();
        }
        sapXep(arr1);
        System.out.println("sap xep tu be den lon mang 1");
        show(arr1);

        System.out.println("Nhap so phan tu cua mang 2: ");
        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];
        System.out.println("Nhap cac phan tu cua mang 2: ");
        for (int i = 0; i < n2; i++) {
            System.out.println("Nhap so thu " + i + ": ");
            arr2[i] = scanner.nextInt();
        }
        sapXep(arr2);
        System.out.println("sap xep tu be den lon mang 2");
        show(arr2);

        int[] arr3 = new int[n + n2];
        int k = 0; // Biến chỉ số để theo dõi vị trí hiện tại trong mảng arr3

    // Duyệt qua từng phần tử của mảng arr1 và gán chúng vào mảng arr3
        for (int i = 0; i < n; i++) {
            arr3[k++] = arr1[i];
        }

        // Duyệt qua từng phần tử của mảng arr2 và gán chúng vào mảng arr3
        for (int j = 0; j < n2; j++) {
            arr3[k++] = arr2[j];
        }


        sapXep(arr3);
        System.out.println("sap xep tu be den lon mang 3 : ");
        show(arr3);

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
}
