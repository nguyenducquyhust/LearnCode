package day11.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        StudentUtil.nhapDanhSach(students);
        StudentUtil.sapXep(students);
    }
}
