import java.util.*;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1){
            System.out.println("n < 1");
        } else if (n < 3){
            System.out.println("java");
        }else if (n > 4 && n < 6){
            System.out.println("python");
        }
    }
}
