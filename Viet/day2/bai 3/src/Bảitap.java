import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0; i<arr.length; i ++ ){
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[0] +" " + arr[3]);
    }
}