// SOLUTION 1
//import java.util.Scanner;
//public class Excercise2 {
//    public static void main(String[] args) {
//        //input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("chuỗi nhập vào");
//        String input = scanner.nextLine();
//
//        // string trim
//        String inputWithoutBreak = input.trim();
//
//        //output
//        System.out.println("Chuỗi ban đầu: " + input);
//        System.out.println("Chuỗi sau khi trim: " + inputWithoutBreak);
//    }
//}
//SOLUTION 2

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String str = scanner.nextLine();

        // Sử dụng vòng lặp for
        int index = str.length() - 1;
        while (index >= 0 && str.charAt(index) == ' ') {
            index--;
        }

        String strWithoutWhitespace = str.substring(0, index + 1);

        System.out.println("Chuỗi gốc: " + str);
        System.out.println("Chuỗi sau khi cắt khoảng trắng ở cuối: " + strWithoutWhitespace);
    }
}


