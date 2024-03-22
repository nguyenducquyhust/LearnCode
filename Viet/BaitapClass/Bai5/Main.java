import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        boolean check = true;


        while(true) {

            System.out.println("-------------------");
            System.out.println("1 input data");
            System.out.println("2 display all the information");
            System.out.println(("3display highest and lowest gpa"));
            System.out.println("4findid");
            System.out.println("5Display all student");
            System.out.println("6checkscholar");
            System.out.println("7exit the program");
            System.out.println("-------------------");
            int choice = sc.nextInt();
            if(choice == 1){
                arr = inputData123();
                check = false;
            }
            if(choice == 2){
                if(check){
                    System.out.println("you have to insert date");
                }else{
                    showInfo(arr);
                }
            }
            if(choice == 3) {
                if (check) {
                    System.out.println("you have to insert date");
                } else {
                    maxminGpa(arr);
                }

            }
            if(choice == 4){
                if(check){
                    System.out.println("you have to insert date");
                }else{
                    System.out.println(" please inser id student");
                    String idc = sc.nextLine();
                    findId(idc,arr);
                }
            }
            if(choice == 5){
                if(check){
                    System.out.println("you have to insert date");
                }else{
                    sortName(arr);
                }
            }
            if(choice==6){
                if(check){
                    System.out.println("you have to insert date");
                }else{
                    gainScholar(arr);
                }
            }
            if (choice == 7){
                break;
            }
            }



    }

    public static Student nhap() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String id = sc.nextLine();
        double gpa = sc.nextDouble();
        Student s1 = new Student(name, id, gpa);
        return s1;
    }

    public static ArrayList<Student> inputData123() {
        Scanner sc = new Scanner(System.in);
        System.out.println("how mane students");
        int num = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<Student>();
        for (int i = 0; i < num; i++) {
            arr.add(nhap());
        }
        return arr;
    }

    public static void showInfo(ArrayList<Student> s1) {
        for (Student s : s1){
            s.display();

        }
    }
    public static void maxminGpa(ArrayList<Student>s1){
        double max = s1.get(0).getGpa();
        double min = s1.get(0).getGpa();
        for(int i = 1; i<s1.size();i++){
            if(s1.get(i).getGpa()>max){
                max = s1.get(i).getGpa();
            }
            if(s1.get(i).getGpa()<min){
                min = s1.get(i).getGpa();
            }

        }
        System.out.println("min: "+ min + "max: "+ max);
    }
    public static void findId(String str,ArrayList<Student> s){
        boolean check = true;
        for(Student s1 : s){
            if(s1.getId().equals(str)){
                s1.display();
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("the id is not exist@@ you fucking dumpass");
        }

    }
    public static void sortName(ArrayList<Student> s1){
        String[] ngu = new String[s1.size()];
        for(int i = 0;i<s1.size();i++){
            ngu[i] = s1.get(i).getName();
        }
        Arrays.sort(ngu);
        for(int i = 0;i<s1.size();i++){
            System.out.println(ngu[i]);
        }


    }
    public static void gainScholar(ArrayList<Student> s1){
        int size = s1.size();
        ArrayList<Double> arri = new ArrayList<>();
        for(int i = 0;i<size;i++){
            if(!arri.contains(s1.get(i).getGpa())){
                arri.add(s1.get(i).getGpa());
            }
        }
        Collections.sort(arri);
        for(int i = 0;i< arri.size();i++){
            for(Student s2: s1){
                if (s2.getGpa() == arri.get(i)){
                    System.out.print(s2.getName()+" "+arri.get(i));
                }

            }
            if(arri.get(i) >= 8){

                System.out.println( " (co hoc bong)");
            } else{
                System.out.println(" khong co gi");
            }
        }

    }
}