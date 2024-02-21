import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.println("Nhập n số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        // Nhập các phần tử của mảng
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arr.add(scanner.nextInt());
        }

        // Sắp xếp mảng
        sort(arr);

        // Nhập phần tử cần chèn
        System.out.println("Nhập phần tử k cần chèn: ");
        int k = scanner.nextInt();

        // Xác định vị trí chèn
        int index = binarySearch(arr, k);

        // Chèn phần tử
        arr.add(index + 1, k);

        // In ra mảng sau khi chèn
        System.out.println("Mảng sau khi chèn là:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    // Hàm sắp xếp mảng
    private static void sort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }

    // Hàm tìm kiếm nhị phân
    private static int binarySearch(ArrayList<Integer> arr, int k) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr.get(mid) == k) {
                return mid;
            } else if (arr.get(mid) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}
