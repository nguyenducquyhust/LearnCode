
import java.util.Scanner;

    public class ex2 {
        public static void main(String[] args) {
            int n, i;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            if( n % 2 ==0) {
                i = 1;
            } else{
                i = 2;
            }
            long sum = 0;
            for(; i <= n; i+= 2){
                sum+= i;
            }
            System.out.println("RESULT = " + sum);
        }
    }


