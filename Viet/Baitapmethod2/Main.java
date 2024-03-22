
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static int Sotu(String str){
        String[] chuoi = str.split(" ");
        int a = chuoi.length;
        return a;
    }
    public static void Lowerthann(int n ){
        for(int i = 2; i <= n; i++){
            int dem = 0;
            for(int j = 2; j <= i;j++){
                if(i % j == 0){
                    dem++;
                }
            }
            if (dem == 1) {
                System.out.print(" " + i);
            }

        }

    }

    public static void Nsonguyento(int a) {
        int dem = 1;
        System.out.print(2);
        if(a > 1){
            for (int i = 3; i <= Integer.MAX_VALUE; i++) {
                if(dem == a){
                    break;
                }
               int so = 0;
                for (int j = 2; j < i; j++){
                    if(i % j == 0){
                        so++;
                    }
                }
                if(so == 0){
                    dem++;
                    System.out.print(" " + i);
                }

            }

        }
    }
    public static void Sortarray(int[] a,int b) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    // If arr[i] > arr[j], swap the value of arr[i] and arr[j]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        List ga = Arrays.asList(a);
        for(int i = 0; i < ga.size() - 1;i++){
            if(b <= a[i+1] && b>= a[i]){
                ga.add(b,i+1);

            }
        }
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void Checkmssv(String str) {
        String regex = "[B]{1}\\d{7}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.print("dc");
        } else {
            System.out.print("khong dc");
        }
    }
      // co the  lam nhuy nay luon nhung ma it thay nguo8i lam
//        if(str.matches(regex)){
//            System.out.print("ok");
//        }
//
//    }
    public static void Duyetchuoi(String str){
        String regex = "[A-Z]{1}\\w{1,18}\\d{1}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            System.out.print("ok");
        }
        else {
            System.out.print("k dc");
        }
    }
    public  static boolean Contain(String s1,String s2){
        if(s1.contains(s2)){
            return true;
        }
        return false;
    }
    public static void Nsodau(int n){
        for(int i = 0; i <= n; i++){

        }
        public static void main(S
        }tring[] args) {
        float[] a = {1,100,200,600,800};
        float[] b = {1,2,3,4,5,6,7,8,9};
        Duyetchuoi("adqwdqwd");
//        String str = "2001-11-87";
//        System.out.print(str.matches("[12]\\d{3}-([1-9]{1}|[1]{1}[012]{1})-([1-9]{1}|[12]{1}\\d{1}|3{1}[01]{1})"));

        }

    }
