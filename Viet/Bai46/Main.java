package Bai46;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<book> arr = new ArrayList<book>();
        int a = sc.nextInt();;
        for(int i = 0;i<a;i++){
            String bookid = sc.next();
                String date = sc.next();
                String status = sc.next();
                int quantity = sc.nextInt();
                int price = sc.nextInt();
                arr.add(new Sachgk(bookid,date,quantity,price,status));
        }
        arr.add(new Sachtk("dsf","fsef",123,123,40));

        for(book b1 : arr){
            System.out.println(b1.Thanhtien());
        }


    }
}
