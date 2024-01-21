import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        //input
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //string to char
        char[] chr = str.toCharArray();

        //xet
        boolean capitaLetter = false;
        for (int i = 0; i < str.length(); i++) {
            if (chr[i] >= 65 && chr[i] <= 90) {
                capitaLetter = true;
            }
        }
        System.out.println(capitaLetter);
    }
}