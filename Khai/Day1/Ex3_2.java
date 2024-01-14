import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập câu: ");
        String message = scanner.nextLine();

        // Chuyển string thành thành các string nhỏ
        String[] strings_massage = message.split(" ");

        // Chuyển ký tự đầu của mỗi từ sang chữ hoa
        for (int i = 0; i < strings_massage.length; i++) {
            strings_massage[i] = strings_massage[i].substring(0, 1).toUpperCase() + strings_massage[i].substring(1);
        }

        // Tạo câu mới với các từ đã được chuyển đổi
        String Newmessage = "";
        for (String t : strings_massage) {
            Newmessage += t + " ";
        }

        // In câu mới
        System.out.println("Câu mới: " + Newmessage);
    }

}