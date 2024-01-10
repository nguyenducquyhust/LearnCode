//Tinh tong 2 so nhap tu ban phim va in ra man hinh
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = console.nextInt();
        System.out.print("Nhap b = ");
        int b = console.nextInt();
        int c = a + b;
        System.out.printf("Tong hai so la: %d", c);
    }
}
