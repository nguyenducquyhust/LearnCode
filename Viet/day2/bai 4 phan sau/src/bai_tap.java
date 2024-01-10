import java.util.ArrayList;
import java.util.Scanner;

public class bai_tap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i <n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> arrl = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int dem = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    dem++;
                }

                }
            boolean ga = true;
            if(arrl.contains(arr[i])){
                ga = false;
            }
            if (ga && dem > 1){

                System.out.print(arr[i] + " was repeated " + dem + " times");

            }
            arrl.add(arr[i]);
        }
    }
}