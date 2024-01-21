import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuỗi nhập vào");
        String chuoi = scanner.nextLine();

        // chuyển từ chuỗi thành chararay
        char[] tu = chuoi.toCharArray();

        // so sánh các phần từ với bảng mã acie key
        boolean kytucdacbt = false;
        for (int i = 0; i < chuoi.length(); i++) {
            if (tu[i] == 32 || tu[i] >= 97 && tu[i] <= 122 || tu[i] >= 65 && tu[i] <= 90) {
            } else {
                kytucdacbt = true;
            }
        }
        System.out.println("Co ky tự đặc biệt không: " + kytucdacbt);
    }
}
