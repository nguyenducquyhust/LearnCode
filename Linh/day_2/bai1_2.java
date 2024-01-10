
import java.util.Scanner;
public class bai1_2 {
    public static void main(String[] args) {
        int i = 0;
        long sum = 0;
        while(i <= 1000){
            sum += i;
            i++;
        }
        System.out.println("RESULT = " + sum);
    }
}