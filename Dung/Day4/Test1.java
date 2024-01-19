package day4; //Kiem tra trong cau co ky tu dac biet hay khong

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot cau: ");
        String sentence = scanner.nextLine();

        boolean foundSpecialCharacter = false;
        char[] charArray = sentence.toCharArray();
        for (int i = 0; i < sentence.length(); i++) {
            if ((charArray[i] < 65 && charArray[i] != 32) || (charArray[i] > 90 && charArray[i] < 97) || charArray[i] > 122) {
                foundSpecialCharacter = true;
                break;
            }
        }

        System.out.println(foundSpecialCharacter);
    }
}
