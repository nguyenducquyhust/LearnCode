import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuỗi nhập vào");
        String chuoi = scanner.nextLine();

        //Đếm số nguyên âm xuat hien trong cau
        int times = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            // Kiểm tra xem ký tự tại vị trí i có phải là nguyên âm hay không
            if (chuoi.charAt(i) == 'a' || chuoi.charAt(i) == 'e' || chuoi.charAt(i) == 'u' || chuoi.charAt(i) == 'o' || chuoi.charAt(i) == 'i') {
                times++;
            }
        }
        System.out.println("Số lần xuất hiện nguyên âm là " + times);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Chuỗi nhập vào");
//        String chuoi = scanner.nextLine();
//        String nguyenam = {"u", "e", "o", "a", "i"};
//
//
//        //Đếm số nguyên âm xuat hien trong cau
//        int times = 0;
//        for (int i = 0; i < chuoi.length(); i++) {
//            if (chuoi.charAt(i) == nguyenam.charAt(1) || chuoi.charAt(i) == nguyenam.charAt(2) || chuoi.charAt(i) == nguyenam.charAt(3) || chuoi.charAt(i) == nguyenam.charAt(4) || chuoi.charAt(i) == nguyenam.charAt(5)) {
//                times++;
//            }
//        }
//        System.out.println("Số lần xuất hiện nguyên âm là " + times);
    }
}
