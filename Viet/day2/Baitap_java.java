import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n;i++) {
            arr[i] = sc.nextInt();

        }
        for(int i = 0; i <n;++){
            for(int j =0;j < n;j++){
       if (j == i){
            continue;
        }
       if (arr[i] == arr[j]){
       /*
f   for(int i =0; i < n;i++){
            System.out.print(arr[i] + " ");
        }

         */


    }
}