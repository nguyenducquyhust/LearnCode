import java.util.Arrays;
import java.util.Scanner;

public class Buoi3 {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------chào mừng các bạn đến với bài tập về nhà của mình------ ");
            System.out.println("------bài tập buổi 2 có 4 bài------");
            System.out.println("------mời bạn chọn bài tập muốn kiểm tra------");
            System.out.println("1. xem bài 1");
            System.out.println("2. xem bài 2");
            System.out.println("3. xem bài 3");
            System.out.println("4. xem bài 4");
            System.out.println("5. xem bài 5");
            System.out.println("6. xem bài 6,7,8,9,10");

            System.out.println("7. thoát");
            do {
                System.out.println("nhập lựa chọn của bạn");
                option = scanner.nextInt();
                scanner.nextLine();
            } while (option < 1 && option > 7);

            switch (option) {
                case 1:
                    //Bài 1: Nhập vào 1 chuỗi bất kỳ và kiểm tra xem chuỗi đó có chứa ký tự số hay ko ?
                    System.out.println("Xin mời nhập chuỗi kiểm tra: ");
                    String chuoi1 = scanner.nextLine();

                    for (int i = 0; i < chuoi1.length(); i++) {
                        if (chuoi1.codePointAt(i) > 47 && chuoi1.codePointAt(i) < 58) {
                            System.out.println("chuỗi đã cho có ký tự số");
                            break;
                        }
                    }
                    break;
                case 2:
                    //Bài 2: Nhập vào 1 chuỗi và cắt những ký tự trắng ( space ) ở cuối chuỗi theo 2 cách
                    System.out.println("Xin mời nhập chuỗi kiểm tra: ");
                    String chuoi2 = scanner.nextLine();

                    // Cách 1
                    int vitri = 0;
                    for (int i = (chuoi2.length() - 1); i >= 0; i--) {
                        if (chuoi2.codePointAt(i) == 109) {
                            vitri = i;
                        } else if (chuoi2.codePointAt(i) != 109) {
                            break;
                        }
                    }
                    System.out.println("Cách 1:");
                    System.out.println(chuoi2.substring(0, vitri));

                    // Cách 2
                    char[] chuoi22 = chuoi2.toCharArray();
                    String a = "hihi";

                    for (int i = (chuoi2.length() - 1); i >= 0; i--) {
                        if (chuoi22[i] == 'm') {
                            char[] dst = Arrays.copyOfRange(chuoi22, 0, i);
                            a = new String(dst);
                        } else if (chuoi22[i] != 'm') {
                            break;
                        }
                    }
                    System.out.println("Cách 2");
                    System.out.println(a);
                    break;
                case 3:
                    //Bài 3 : In ra những số chẵn từ 1 - 100 sử dụng continue
                    System.out.println("Các số chẵn từ 1-100 là: ");
                    for (int i = 1; i <= 100; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                        continue;
                    }
                    break;
                case 4:
                    //Bài 4: Kiểm tra trong chuỗi vừa nhập có ký tự In hoa hay ko ?
                    System.out.println("Xin mời nhập chuỗi kiểm tra: ");
                    String chuoi4 = scanner.nextLine();

                    for (int i = 0; i < chuoi4.length(); i++) {
                        if (chuoi4.codePointAt(i) > 64 && chuoi4.codePointAt(i) < 91) {
                            System.out.println("chuỗi đã cho có ký tự in hoa");
                            break;
                        }
                    }
                    break;
                case 5:
                    //Bài 5: Nhập từ bàn phím 1 ký tự và 1 chuỗi bất kỳ, kiểm tra xem trong chuỗi  có chứa ký tự đó hay ko ?
                    System.out.println("mời bạn nhập chuỗi cần thao tác: ");
                    String chuoi5 = scanner.nextLine();
                    char[] arraychuoi5 = chuoi5.toCharArray();
                    System.out.println("mời bạn nhập kí tự cần tìm : ");
                    String char5 = scanner.nextLine();
                    char[] arraychar5 = char5.toCharArray();

                    int soLanLap = 0;
                    if (char5.length() == 1) {
                        for (int i = 0; i < chuoi5.length(); i++) {
                            if (arraychar5[0] == arraychuoi5[i]) {
                                soLanLap += 1;
                            }
                        }
                        if (soLanLap > 0) {
                            System.out.println("trong chuỗi " + chuoi5 + " có xuất hiện kí tự " + char5);
                            System.out.println("số lần lặp là " + soLanLap);
                        } else {
                            System.out.println("trong chuỗi " + chuoi5 + " không xuất hiện kí tự " + char5);
                        }
                    } else {
                        System.out.println("bạn nhập sai cú pháp ký tự");
                    }
                    break;
                case 6:
                    System.out.println("mời bạn nhập mảng cần thao tác: ");
                    System.out.println("Mỗi phần tử trong mảng bạn nhập cách nhau 1 khoảng trống nhé!");
                    String mang = scanner.nextLine();

                    // chuyển đổi chuỗi sang mảng int
                    String[] mangString = mang.split(" ");
                    int[] mangInt = new int[mangString.length];
                    for (int i=0;i<mangString.length;i++){
                        mangInt[i]=Integer.parseInt(mangString[i]);
                    }

                    //bài 6: Tính tổng các phần tử chia hết cho 5 trong mảng
                    int sum =0;
                    for (int i=0;i<mangInt.length;i++){
                        if (mangInt[i]%5==0){
                            sum = sum +mangInt[i];
                        }
                    }
                    System.out.println("Bài 6: tổng các số chia hết cho 5 có trong mảng là: "+ sum);

                    //bài 7: Tìm giá trị dương đầu tiên trong mảng
                    boolean check =true;
                    int giaTriDuongDauTien = 0;
                    for (int i=0;i<mangInt.length;i++){
                        if (mangInt[i]>0){
                            giaTriDuongDauTien = mangInt[i];
                            System.out.println("Bài 7: giá trị dương đầu tiên trong mảng là: "+giaTriDuongDauTien);
                            check = false;
                            break;
                        }
                    }
                    if (check==true){
                        System.out.println("Bài 7: không có giá trị dương nào trong mảng");
                    }

                    //bài 8: Tìm số chẵn cuối cùng trong mảng
                    for (int i=mangInt.length-1;i>=0;i--){
                        if (mangInt[i]%2==0){
                            System.out.println("Bài 8: số chẵn cuối cùng trong mảng là: "+ mangInt[i]);
                            break;
                        }
                    }

                    // bài 9: Tìm vị trí phần tử dương nhỏ nhất trong mảng
                    if (giaTriDuongDauTien>0) {
                        int min = giaTriDuongDauTien;
                        for (int i = 1; i < mangInt.length; i++) {
                            if (mangInt[i] > 0 && mangInt[i] < min) {
                                min = mangInt[i];
                            } else {
                                continue;
                            }
                        }
                        System.out.println("Bài 9: phần tử dương nhỏ nhất trong mảng là: " + min);
                    }else {
                        System.out.println("mảng đã tạo không có giá trị dương nào");
                    }

                    //Bài 10: Tìm giá trị dương lớn nhất trong mảng
                    if (giaTriDuongDauTien>0) {
                        int max = giaTriDuongDauTien;
                        for (int i = 1; i < mangInt.length; i++) {
                            if (mangInt[i] > 0 && mangInt[i] > max) {
                                max = mangInt[i];
                            } else {
                                continue;
                            }
                        }
                        System.out.println("Bài 10: phần tử dương lớn nhất trong mảng là: " + max);
                    }else {
                        System.out.println("mảng bạn đã cho không có phần tử dương nào");
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    break;
            }
        } while (option == 10);
    }
}