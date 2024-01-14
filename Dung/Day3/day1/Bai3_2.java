package day1;  //Chuyển ký tự đầu của mỗi từ sang chữ hoa trong 1 câu, câu được nhập từ bàn phím.

import java.util.Scanner;

public class Bai3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.print("Nhap vao mot cau: ");
        sentence = sc.nextLine();

        char[] charArray = sentence.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }

        sentence = String.valueOf(charArray);
        System.out.println("Cau sau khi viet hoa chu cai dau cua moi tu: " + sentence);
    }
}
