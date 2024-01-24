import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhap cau ");
//        String input = scanner.nextLine();
//
//        int[] ascii = new int[input.length()];
//        //tạo ra một mangr của của các số nguyên với độ dài bằng  input
//
//        for (int i = 0; i < input.length(); i++) {
//            ascii[i] = (int) input.charAt(i);// đoạn này là để chuyển đổi kí tự thành chuổi ASCII của ký tưj (char sang int)
//            if ((ascii[i] < 48 || (ascii[i] > 57 && ascii[i] < 65) ||
//                    (ascii[i] > 90 && ascii[i] < 97) || ascii[i] > 122)) {
//                System.out.println("Special character found: " + input.charAt(i));
                
//            }
//        }
        char [] ch = {'v', 'u',' ', 't', 'h', 'a', 'n', 'h'};
        String s = new String(ch);
        System.out.println(s);// convert mang char thanh chuoi

      String vt = "Vu Thanh";
        System.out.println(vt);

        String s3 = new String("Quang Thanh TA");
        System.out.println(s3);
    }
}