package Bai2;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> arr = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many students");
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            String name = sc.next();
            String address = sc.next();
            String phonenumbe = sc.next();
            int id = sc.nextInt();
            arr.add(new Student(name,address,phonenumbe,id));
        }
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(Student s1: arr){
            arr1.add(s1.getId());
        }
        Collections.sort(arr1);
        for(int a1: arr1){
            for(Student s1 : arr){
                if (s1.getId() == a1){
                    System.out.println(s1.getName() + s1.getId());
                }
            }

        }

        }




    }

