package Day4;   //Kiểm tra trong chuỗi vừa nhập có ký tự In hoa hay ko ?

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");
        String string = scanner.nextLine();
        boolean kytuinhoa = false;
        char[] array = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (array[i] >= 65 && array[i] <= 90) {
                kytuinhoa = true;
                break;
            }
        }
        if (kytuinhoa) {
            System.out.println("chuoi co ky tu in hoa");
        } else{
            System.out.println("chuoi khong co ky tu in hoa");
        }
    }
}
