package Day4;  //Tìm số chẵn cuối cùng trong mảng
import java.util.Scanner;
public class Bai8 {

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
        boolean soChanCuoiCungTrongMang = false;
        for (  int i = soPhanTu - 1; i >= 0; i-- ){
            if (array[i] % 2 == 0);
            soChanCuoiCungTrongMang = true;
            System.out.println("so chan cuoi cung trong mang la:" + args[i]);
            break;
        }if (soChanCuoiCungTrongMang) {
            System.out.println("khong co phan tu chan trong mang");
        }
    }
}
