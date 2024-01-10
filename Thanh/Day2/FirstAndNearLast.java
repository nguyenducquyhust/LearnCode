import java.util.Scanner;

public class FirstAndNearLast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity : ");
        int n = scanner.nextInt();
        //khai báo 1 mảng array có phần tử là n
        int [] arraylist = new int[n];

        //dùng vòng lăpj để truy cập vào mảng
        for (int i = 0; i < n ; i++ ) {
            System.out.println("Enter the number " + (i +1) + " : ");
            arraylist [i] =scanner.nextInt();
       }
// solution 2

       int a =1;
        while (a < n ) {
            System.out.println("Enter the number" + (a + 1) + " : ");
            arraylist [a] =scanner.nextInt();
            a++;
        }
        System.out.println(" The firt Number and the last Number " + arraylist[0] + " , " + arraylist[n-1]);





    }

}
