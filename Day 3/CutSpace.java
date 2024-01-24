import java.util.Scanner;

public class CutSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhap 1 chuoi : ");
        String chuoi = scanner.nextLine();
        System.out.println( " khong su dung cut : " + chuoi);
//solution 1
        System.out.println(" su dung phuong thuc : " + chuoi.trim());

        //solution 2
        System.out.println(" su dung phuong thuc : " + chuoi.strip());
    }
}
