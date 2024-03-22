package Bai3;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         Account acc;
         Account acccheck = new Account(22122006,"vietcheck",5000);
        Account acc1 = new Account(15122004, "Viet", 50000);
        Account acc2 = new Account(22122004, "Viet1", 500023);
        Account acc3 = new Account(22122005, "Viet2", 50000);
        ArrayList<Account> arr = new ArrayList<Account>();
        arr.add(acc1);
        arr.add(acc2);
        arr.add(acc3);
        acc = findCustomer(arr);
        if(acc != null){
        System.out.println("muon bank nhiu");
        int a = sc.nextInt();
        if(acccheck.getBalance() > a){
            acccheck.chuyenkhoan(acc,a);
            System.out.println(acccheck.getBalance());
            System.out.println(acc1.getBalance());
        } else {
            System.out.println("bri deo du tien dau");
        }
        }



    }

    public static Account findCustomer(ArrayList<Account> arr) {
        System.out.println("cho bo xin cai so tai khoan phat");
        long stk = sc.nextLong();

        boolean check = false;
        for (Account acc : arr) {
            if (acc.getStk() == stk) {
                System.out.println(acc.getName());
                return acc;
            }
        }
        System.out.println("bri this acc does not exist");
        return null;
        }

    }





