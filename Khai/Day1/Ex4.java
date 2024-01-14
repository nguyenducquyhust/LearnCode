import java.util.Scanner;

public class Ex4 {
    private static final String[] soDonVi = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
    private static final String[] soHangChuc = {"mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
    private static final String[] soHangTram = {"trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"};
    private static final String[] soHangNguNgon = {"nghìn", "triệu", "tỷ", "nghìn tỷ", "triệu tỷ", "tỷ tỷ"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int so = scanner.nextInt();

        // Xử lý trường hợp số âm
        if (so < 0) {
            System.out.print("-");
            so = -so;
        }

        // Xử lý từng hàng của số
        String chuoi = "";
        for (int i = 9; i >= 0; i--) {
            int donvi = (so % (int) Math.pow(10, i)) / (int) Math.pow(10, i - 1);
            if (donvi != 0) {
                chuoi += docSo(donvi, i);
            }
        }

        System.out.println("Số thành chữ là: " + chuoi);
    }

    private static String docSo(int so, int hang) {
        String chuoi = "";
        if (hang == 0) {
            chuoi += soDonVi[so];
        } else if (hang <= 2) {
            chuoi += soHangChuc[so];
            if (so != 0) {
                chuoi += " ";
            }
        } else if (hang <= 4) {
            chuoi += soHangTram[so];
            if (so != 0) {
                chuoi += " ";
            }
        } else {
            chuoi += soDonVi[so] + " " + soHangNguNgon[hang - 4];
        }
        return chuoi;
    }
}
