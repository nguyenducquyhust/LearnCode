import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // number of string in array
        System.out.println("nhập số chuỗi trong mảng: ");
        int n = sc.nextInt();

        // creat an array with n element
        String[] array = new String[n];

        // input string to be n element
        for ( int i = 0; i<=50; i++){
            System.out.println("nhập chuỗi thứ " + (i+1) + " :");
            // chuyển string thành integer ròi cho integer vào mảng
            array[i] = sc.nextLine();
//            String[] chuoi = new String[i];

        }
    }
}
