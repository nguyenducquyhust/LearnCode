package Day4;//Nhập từ bàn phím 1 ký tự và 1 chuỗi bất kỳ, kiểm tra xem trong chuỗi  có chứa ký tự đó hay ko ?
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi:");
        String string = scanner.nextLine();
        System.out.println("nhap vao mot ky tu:");
        char cHar = scanner.next().charAt(0);
        boolean kytucotrongchuoi = false;
        char[] array = string.toCharArray();
        for (int i = 0; i < string.length(); i++){
            if (array[i] == cHar){
                kytucotrongchuoi = true;
                break;
            }
        }
        if (kytucotrongchuoi){
            System.out.println("co ky tu trong chuoi");
        }else {
            System.out.println("khong co ky tu trong chuoi");
        }
    }
}
