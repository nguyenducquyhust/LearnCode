import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("chuỗi nhập vào");
        String input = scanner.nextLine();

        //Chuyển chui thành char
        char[] inputbreak = input.toCharArray();

        // so sasnh
        boolean number = false;
        for (int i = 0; i < input.length(); i++) {
            if (inputbreak[i] >= 48 && inputbreak[i] <= 57) {
                number = true;
                break;
            }
        }
        if (number) {
            System.out.println("Chuỗi có chứa ký tự số.");
        } else {
            System.out.println("Chuỗi không chứa ký tự số.");
        }
    }
}