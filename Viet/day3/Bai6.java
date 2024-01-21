import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int sum = 0;

        for (Integer so : arr){
            so = sc.nextInt();
            if (so % 5 == 0){
                sum += so;
            }
        }
        System.out.print(sum);
    }
}