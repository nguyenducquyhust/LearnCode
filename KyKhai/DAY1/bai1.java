import java.util.Scanner;
public class bai1 {
        public static void main(String[] args) {
            int a,b;
            Scanner sc = new Scanner(System.in);
            System.out.print("nhập giá trị a: ");
            a = sc.nextInt();
            System.out.print("nhập giá trị b: ");
            b = sc.nextInt();
            int c=a+b;
            System.out.println("tổng của "+a+" + "+b+" = "+c);
        }
}
