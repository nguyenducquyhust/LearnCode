package day1;//Nhap 1 so n tu ban phim, neu n<1 thi in ra n<1, n>1 va n<3 thi in ra "java", n>4 va n<6 thi in ra "python"

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap 1 so n: ");
            n = console.nextInt();
        } while (n == 1 || n == 3 || n == 4 || n > 5);
        if (n < 1) {
            System.out.println("n<1");
        } else if (n == 2) {
            System.out.println("java");
        } else
            System.out.println("python");
    }
}
