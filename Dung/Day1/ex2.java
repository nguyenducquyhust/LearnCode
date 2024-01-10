import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){
        int n, sum=0;
        Scanner console = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = console.nextInt();
        if (n % 2 == 0){
            for (int i = 0; i <= n; i+=2)
            {
                sum += i;
            }
        }
        else{
            for (int i = 1; i <= n; i+=2)
            {
                sum += i;
            }
        }
        System.out.printf("Tong bang %d", sum);
    }
}
