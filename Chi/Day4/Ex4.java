import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String string = scanner.nextLine();

        boolean Number = false;
        char[] arr = string.toCharArray(); // tach rieng tung ki tu
        for (int i = 0; i < string.length(); i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                Number = true;
                break; // de ket thuc luon vong lap
            }
        }

        if (Number) {
            System.out.println("Chuoi co chua ky tu in hoa");
        } else {
            System.out.println("Chuoi khong chua ky tu in hoa");
        }
    }
}