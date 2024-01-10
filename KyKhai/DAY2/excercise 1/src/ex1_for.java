import java.util.Scanner;
public class ex1_for {
    public static void main(String[] args) {
        int num, sum = 0;
        //input n
        Scanner sc = new Scanner(System.in);
        System.out.println("input some number: ");
        num = sc.nextInt();
        // for loop from 0 - n
        for(int i = 1; i <= num; ++i)
        {
            //sum = sum + i
            sum += i;
        }
        // dấu cộng ở phần + num +, +sum này nghĩa là j, tại sao phần sum laji chỉ có mọt +
        System.out.println("Sum of number from 1 to " + num + " is " + sum);
        System.out.println("KyKhai");

    }
}