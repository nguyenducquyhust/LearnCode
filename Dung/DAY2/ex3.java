//Nhập vào N số, sau đó in ra số đầu tiên và gần cuối cùng
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = console.nextInt();
        int array[] = new int[n]; //thiet lap mang

        for ( int i = 0; i < n; i++ )
        {
            int a = i + 1;
            System.out.println("Nhap so thu" + " " + a + ": ");
            array[i] = console.nextInt();  //nhap gia tri cac phan tu
        }

        System.out.println("So dau tien la: " + array[0]);
        System.out.println("So gan cuoi cung la: " + array[n-2]);
    }
}
