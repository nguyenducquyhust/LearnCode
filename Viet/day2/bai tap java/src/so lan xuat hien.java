import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer,Integer> map_ga = new HashMap<Integer,Integer>();

        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n;i++) {
            int dem = 1;
            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    dem++;
                }
            }
            boolean test = true;
            if (map_ga.containsKey(arr[i])) {
                test = false;
            }

            if (dem > 1 && test) {
                map_ga.put(arr[i], dem);
            }
        }

        int max_value = 1;
        for (int i : map_ga.values()){
            if (i > max_value){
                max_value = i;
            }
        }
        for (int i : map_ga.keySet()){
            if (map_ga.get(i) == max_value){
                System.out.println("so lan " +i+ " xuat hien la "+ max_value);
            }
        }


    }
}