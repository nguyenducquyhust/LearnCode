import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1 {
    public static float n1;
    public static float n2;

    public static void main(String[] args) {
        // Nhap lieu
        nhapLieu();

        // Goi ham tinh hieu
        tinhHieu(n1, n2);

        // Goi ham tinh thuong
        tinhChia(n1, n2);

        // Goi ham tinh uoc chung
        Integer[] uocChung = tinhUoc((int) n1, (int) n2); // Ép kiểu float sang int
        System.out.println("Uoc chung cua " + n1 + " va " + n2 + " la: " + Arrays.toString(uocChung));
    }

    // Ham nhap lieu
    public static void nhapLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        n1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap so thu 2: ");
        n2 = Float.parseFloat(scanner.nextLine());
    }

    // Ham tinh hieu
    public static void tinhHieu(float so1, float so2) {
        float hieu = so1 - so2;
        System.out.println("Hieu cua 2 so la: " + hieu);
    }

    // Ham tinh chia
    public static void tinhChia(float so1, float so2) {
        float chia = so1 / so2;
        System.out.println("Thuong cua so 1 va so 2 la: " + chia);
    }

    // Ham tinh uoc chung
    public static Integer[] tinhUoc(int so1, int so2) {
        ArrayList<Integer> uoc = new ArrayList<>();

        for (int i = 1; i <= Math.min(so1, so2); i++) { // Chỉ lặp đến số nhỏ hơn
            if (so1 % i == 0 && so2 % i == 0) {
                uoc.add(i);
            }
        }

        return uoc.toArray(new Integer[uoc.size()]);
    }
}