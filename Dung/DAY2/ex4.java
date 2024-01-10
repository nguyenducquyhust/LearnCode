import java.util.Scanner;
import java.util.Arrays;
public class ex4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = console.nextInt();
        int[] array = new int[n];  //thiet lap array gom n phan tu

        for ( int i = 0; i < n; i++ )
        {
            int a = i + 1;
            System.out.println("Nhap so thu" + " " + a + ": ");
            array[i] = console.nextInt();  //nhap gia tri cac phan tu
        }


        String sequence = " ";
        for ( int i = 0; i < n; i++ )
        {
            sequence += " " + array[i];
        }
        System.out.println("Cac gia tri cua mang la: " + sequence);  //Xuat cac gia tri cua array


        int min = array[0];
        int max = array[0];
        for ( int i = 0; i < n; i++ )
        {
            if ( min >= array[i] ) {
                min = array[i];
            }
            else if ( max <= array[i] ) {
                max = array[i];
            }
        }
        System.out.println("Min: " + min + ", Max: " + max);       //Tim min max


        int sum = 0;
        for ( int i = 0; i < n; i++ )
        {
            sum += array[i];
        }
        System.out.println("Tong cac so cua mang: " + sum);         //Tong cac so trong mang
        float average  = (float) sum / n;
        System.out.println("Trung binh cong cac phan tu cua mang: " + average);  //Trung binh cong cac phan tu cua mang


        for ( int i = 0, j = array.length - 1; i < j; i++, j-- )
        {
            int reverse = array[i];
            array[i] = array[j];
            array[j] = reverse;
        }
        System.out.println("Dao nguoc cac phan tu trong mang" + Arrays.toString(array)); //Dao nguoc cac phan tu trong mang
        



    }
}
