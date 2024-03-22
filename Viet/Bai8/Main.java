package Bai8;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Person[] a = m1.nhaplieeu();
        System.out.println(a);
        for(Person p1 : a){
            p1.toString();
        }



    }

}
