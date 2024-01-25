package Day4;//Tìm giá trị dương đầu tiên trong mảng

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soPhanTu = scanner.nextInt();
        for (; ; ) {
            System.out.println("nhap cac phan tu cua mang:");
            if (soPhanTu > 0) {
                break;
            } else {
                System.out.println("moi nhap lai");
            }
        }
        int[] array = new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++) {
            int j = i + 1;
            System.out.println("nhap phan tu thu" + j + ":");
        }
        boolean giaTriDuongDauTienCuaMang = false;
        for (int i = 0; i <= soPhanTu; i++) {
            if (array[i] > 0) ;
            giaTriDuongDauTienCuaMang = true;
            System.out.println("gia tri duong dau tien trong mang la" + array[i] + ":");
            break;
        }
        if (giaTriDuongDauTienCuaMang) {
            System.out.println("khong co gia trị duong trong mang");
        }
    }
}
