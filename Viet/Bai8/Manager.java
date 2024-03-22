package Bai8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Manager {
    public Person[] arr = new Person[10];
    public  int check = 10;
    Scanner sc = new Scanner(System.in);
    public Person[] nhaplieeu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("muon nhap bao nhieu phan nao dai baoh nhieu");
        int a = sc.nextInt();
        if(check > a){
            for(int i = 0; i<a;i++) {
                System.out.println("1Employ 2Custommer 3 Student");
                int b = sc.nextInt();
                if (b == 1) {
                    String name = sc.next();
                    String adress = sc.next();
                    double hsl = sc.nextDouble();
                    this.arr[i] = new Employee(name, adress, hsl);
                    this.check--;
                }
                if (b == 2) {
                    String name = sc.next();
                    String adress = sc.next();
                    String companyname = sc.next();
                    double bill = sc.nextDouble();
                    this.arr[i] = new Customer(name, adress, companyname, bill);
                    this.check--;
                }
                if(b == 3){
                    String q = sc.next();
                    String w = sc.next();
                    double e = sc.nextDouble();
                    double r = sc.nextDouble();
                    this.arr[i] = new Student(q,w,e,r);
                }
            }
            return this.arr;
        }else{
            int oldlen = this.arr.length;
            this.arr = nangtam(this.arr,a,this.check);
            this.check += this.arr.length - oldlen;
            for(int i = 0; i<a;i++) {
                System.out.println("1Employ 2Custommer 3 Student");
                int b = sc.nextInt();
                if (b == 1) {
                    String name = sc.next();
                    String adress = sc.next();
                    double hsl = sc.nextDouble();
                    this.arr[i] = new Employee(name, adress, hsl);
                    this.check--;
                }
                if (b == 2) {
                    String name = sc.next();
                    String adress = sc.next();
                    String companyname = sc.next();
                    double bill = sc.nextDouble();
                    this.arr[i] = new Customer(name, adress, companyname, bill);
                    this.check--;
                }
                if(b == 3){
                    String q = sc.next();
                    String w = sc.next();
                    double e = sc.nextDouble();
                    double r = sc.nextDouble();
                    this.arr[i] = new Student(q,w,e,r);
                }
            }
            return  this.arr;

        }
    }
    public void display(Person[] arr){
        for(Person s1 : arr){
            System.out.println((s1.toString()));
        }
    }
    public Person[] nangtam(Person[] arr,int add,int check){
        int a = arr.length;
        int d = (int)a/2;
        while(true) {
            if (check  > add){
                Person[] moi = new Person[(int)(a)];
                for(int i = 0;i < arr.length ;i++){
                    moi[i] = arr[i];
                }
                return moi;
            }else{
                check += (int)a/2;
                a += (int)a/2;
            }

            }
        }


    }


