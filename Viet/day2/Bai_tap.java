import java.util.Scanner;

public class Bai_tap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0;i < a;i++){
           arr[i] = sc.nextInt();;
        }
        for (int i = 0;i<a;i++){
            boolean n = true;
            for(int j = 2; j < arr[i];j++){
                if( arr[i] % j == 0){
                    n = false;
                    break;
                }
            }
            if(n){
                System.out.print(arr[i]+" ");
        }


        }
    }
}