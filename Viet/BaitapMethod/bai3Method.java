import java.util.Scanner;

public class bai3Method {

    public static void nhapLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai cua mang");
        int n = sc.nextInt();
        String[] arr = new String[n];
        int i = 0;
        while (i < n){
            String a = sc.nextLine();
            if (a.length() <= 30){
                arr[i] = a;
            } else{
                continue;
            }
            i++;

        }
    }
    public static void tim_chuoi(String[] str) {

        int max = str[0].length();
        for (String a : str) {
            if (a.length() > max) {
                max = a.length();
            }
        }
        System.out.println("the longest lenth is: " + max);
        System.out.println("String that has the longest length is");

        // khả năng nhiều chuỗi có cùng chiều dài max
        for (String b : str) {
            if (b.length() == max) {
                System.out.println(b);
            }
        }
    }
    public static float averageSize(String[] str){
        int sum = 0;
        for(String a : str){
            sum += a.length();
        }
        sum = sum / str.length;
        return sum;
    }
    public static void Stringbiggeraverage(String[] str,int avr) {
        for (String a : str) {
            if (a.length() > avr) {
                System.out.print(a + " ");
            }
        }
    }
    public static String[] sapxep(String[] arr){

        for(int i = 0; i < arr.length; i++ ){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i].length() < arr[j].length()){
                    String a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr[i];
                }
            }
        }
        return arr;
    }
    public static void sapxepkitu(String[] str){
        for(int l = 0; l < str.length; l++ ) {
            char[] test = str[l].toCharArray();
            for (int i = 0; i < test.length; i++) {
                for (int j = 0; j < test.length; j++) {
                    if (test[i] > test[j]) {
                        char ki_tu = test[i];
                        test[i] = test[j];
                        test[j] = ki_tu;
                    }
                }
            }
            System.out.println(test);
        }
    }
    public static void timDoiXung(String[] str) {
        for (String a : str) {
            String test = " ";
            for (int i = 0; i < a.length(); i++) {
                test = a.charAt(i) + test;
            }
            if (a.equals(test)) {
                System.out.println(a);
            }
        }
    }
    public static Boolean coSo(String str) {
        Boolean test = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                test = true;
                break;
            }
        }
        return test;
    }


    public static void checkMail(String[] str){
        for (String a : str){
            int so1 = 2;
            int so2 = 1;
            for(int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '@') {
                    so1 = i;
                }
                if (a.charAt(i) == '.') {
                    so2 = i;
                }
            }
            if ( so1 < so2){
                if(Character.isSpace(a.charAt(so1-1)) && Character.isSpace(a.charAt(so1+1))){
                    System.out.println(a);
                }
            }
        }
    }
    public static void main(String[] args) {
        




    }
}