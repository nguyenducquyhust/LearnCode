import java.util.Arrays;
import java.util.Scanner;

public class ExerciseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity : ");
        int n = scanner.nextInt();

        int array [] = new int[n];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n ; i++ ){
            array [i] = scanner.nextInt();
        }

        System.out.println("Export elements of array : ");
        for (int i = 0; i < n ; i++ ){
            System.out.println(array[i] + " ");
        }

        //in ra cac phan tu trung lap:
        System.out.println();
        System.out.println("Find duplicate elements ");
        for (int i = 0 ; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
        //find min max
        int [] tab = {12, 1, 21, 8};
        int min = Arrays.stream(tab).min().getAsInt();// Arrays.stream(tab) : đây là 1 luồng trong java nói đơn giản nó thực hiện 1 cachs tuần tự
        int max = Arrays.stream(tab).max().getAsInt();// getAsInt() : đây là lấy giá trị lớn hoặc nhỏ nhất dưới dạng int;

        System.out.println("Value min is :" + min);
        System.out.println("Value max is : " + max);
        //solution 2
        int min1 = array[0];
        int max1 = array[0];
        for (int i = 0; i < n ; i++) {
            if (array[i] < min1) {
                min1 = array[i];
            }
            if (array[i] > max1) {
                max1 = array[i];
            }
        }
        System.out.println();
        System.out.println("Value min is " + min1);
        System.out.println("Value max is " + max1);


        //Find prime numbers (nguyen to )
        System.out.println();
        System.out.println("The prime numbers in array is ");
        for (int i = 0; i < n ; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean isPrime = true;
            for (int j =2;j*j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            System.out.println(array[i] + "  ");
        }

        // Average array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        int average =  sum / n;
        System.out.println();
        System.out.println("Average is " + average);

        // Sum array
        System.out.println();
        System.out.println("Sum is " + sum);

    }
}