
import java.util.Random;

public class Random_giaima {
    public static void main(String[] args) {
        int times = 100;
        Random rand = new Random();
        int[] arr = new int[13];
        for (int i = 0; i < times;i++) {
            int num1 = rand.nextInt(6) + 1;
            int num2 = rand.nextInt(6) + 1;
            arr[num1 + num2] += 1;
        }
        for(int i = 2; i <= 12;i++){
            System.out.println("so lan" + i +"la" + arr[i]);
        }



    }
    public static String con_ga(String str, int n){
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code = alpha.substring(n) + alpha.substring(0,n);
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length();i++){
            sb.setCharAt(i,code.charAt(alpha.indexOf(str.charAt(i))));
        }
        return sb.toString();

    }
    public static int[] count(String str){
        int[] arr = new int[26];
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0;i<str.length();i++){
            int num = alpha.indexOf(str.charAt(i));
            if(num != -1){
                arr[num] += 1;
            }
        }
        return arr;

    }

}
