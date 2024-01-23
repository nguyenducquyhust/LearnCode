package Day4;   //Nhập vào 1 chuỗi bất kỳ và kiểm tra xem chuỗi đó có chứa ký tự số hay ko ?

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String string = scanner.nextLine();

        boolean kytuSo = false;
        char[] array = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (array[i] >= 48 && array[i] <= 57) {
                kytuSo = true;
                break;
            }
        }

        if (kytuSo) {
            System.out.println("Chuoi co ky tu so");
        } else {
            System.out.println("Chuoi khong co ky tu so");
        }
    }
}
