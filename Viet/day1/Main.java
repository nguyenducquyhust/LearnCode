import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList(2);
        int[] arr_ga = new int[10];
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.set(1, 123);
        if (arr.contains((2))) {
            System.out.print("chuan roi nh ban oi");
        }
    }
}
