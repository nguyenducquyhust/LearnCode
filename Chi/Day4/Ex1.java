import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String string = scanner.nextLine();

        boolean Number = false;
        char[] arr = string.toCharArray(); // tach rieng tung ki tu
        for (int i = 0; i < string.length(); i++) {
            if (arr[i] >= 48 && arr[i] <= 57) {
                Number = true;
                break; // de ket thuc luon vong lap
            }
        }

        if (Number) {
            System.out.println("Chuoi co chua ky tu so");
        } else {
            System.out.println("Chuoi khong chua ky tu so");
        }
    }
}