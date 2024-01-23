package Day4;//Tìm giá trị dương lớn nhất trong mảng
import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu co trong mang:");
        int soPhanTu = scanner.nextInt();

        int[] array = new int[soPhanTu];

        for (int i = 0; i < soPhanTu; i++) {
            int j = i + 1;
            System.out.println("Nhap phan tu thu " + j +": ");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 0; i < soPhanTu; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }

        if (max > 0) {
            System.out.println("Gia tri duong lon nhat trong mang: " + max);
        } else {
            System.out.println("Mang khong co gia tri duong");
        }
    }
}
