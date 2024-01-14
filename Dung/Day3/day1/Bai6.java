package day1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.print("Nhap vao mot cau: ");
        sentence = sc.nextLine();

        char[] charArray = new char[5];
        charArray[0] = 'a';
        charArray[1] = 'e';
        charArray[2] = 'u';
        charArray[3] = 'o';
        charArray[4] = 'i';

        int count = 0;
        for (int j = 0; j < charArray.length; j++) {
            for (int k = 0; k < sentence.length(); k++) {
                if (sentence.charAt(k) == charArray[j]) {
                    count++;
                }
            }
        }
        System.out.println("Tong cac nguyen am trong cau la: " + count);

    }
}
