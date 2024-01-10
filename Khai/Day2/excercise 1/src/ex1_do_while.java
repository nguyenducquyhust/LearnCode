import java.util.Scanner;
public class ex1_do_while {
    public static void main(String[] args) {
        int num, sum = 0;
        // Nhập liệu
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input some number ");
        num = keyboard.nextInt();
        // loop while
        int i = 0;
        do {
            sum += i;
            i++;
            }
            while (i <= num);
        // in kết quả
        System.out.println("Sum of number from 1 to " + num + " is " + sum);
        System.out.println("KyKhai");
        }

    }

