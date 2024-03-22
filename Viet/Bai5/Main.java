package Bai5;

import Bai4.LocalTrip;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b ="([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";


            LocalDate lc = LocalDate.parse(a,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            System.out.println(lc);
            DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            System.out.println(lc.format(dt));

         System.out.println("ngu");


    }
}
