import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        int n;
        float sum=0;
        Scanner console = new Scanner(System.in);
        System.out.println("Nhap so nguyen n:  ");
        n = console.nextInt();
        if (n>0){
            for (int i = 1; i <= n; i++)
            {
                sum += (float) 1/i;
            }
            System.out.printf("Tong cua bieu thuc bang: %.3f", sum);
        }
        else {
            System.out.println("Hay nhap vao so nguyen duong");
        }
    }
}
