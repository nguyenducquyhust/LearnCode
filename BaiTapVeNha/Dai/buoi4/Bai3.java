package buoi4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    static int chuoiMax = 0;
    static int chuoiMin = 0;
    static float chuoiTB = 0;

    public static void main(String[] args) {
        int n = nhapN();
        String[] mangA = nhapMang(n);
        int option;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------chào mừng các bạn đến với bài tập về nhà của mình------ ");
            System.out.println("------bài tập buổi 3 có 10 bài------");
            System.out.println("------mời bạn chọn bài tập muốn kiểm tra------");
            System.out.println("1. nhập lại N và một mảng gồm N chuỗi khác");
            System.out.println("2. tìm những chuỗi có kích thước nhỏ nhất, lớn nhất");
            System.out.println("3. tính kích thước trung bình các chuỗi trong mảng");
            System.out.println("4. hiển thị các chuỗi có trong mảng có kích thước lớn hơn trung bình");
            System.out.println("5. sắp xếp các chuỗi tăng dần, giảm dần theo kích thước");
            System.out.println("6. tìm những chuỗi nhỏ nhất, lớn nhất theo thứ tự trong bảng mã ASCII");
            System.out.println("7. sắp xếp các chuỗi tăng dần, giảm dần theo thứ tự trong bảng mã ASCII");
            System.out.println("8. nhập vào 1 chuỗi st. Tìm những chuỗi có cùng kích thước với chuỗi st trong mảng. Tìm những chuỗi st có trong mảng");
            System.out.println("9. tìm những chuỗi có tính đối xứng trong mảng");
            System.out.println("10. hiển thị những chuỗi là địa chỉ email chuẩn");
            System.out.println("11. tìm những chuỗi có chứa ký tự số");

            System.out.println("12. thoát");
            do {
                System.out.println("nhập lựa chọn của bạn");
                option = scanner.nextInt();
                scanner.nextLine();
            } while (option < 1 && option > 11);

            switch (option) {
                case 1:
                    //Bài 1: nhập N và một mảng gồm N chuỗi
                    n = nhapN();
                    mangA = nhapMang(n);
                    break;
                case 2:
                    //Bài 2: tìm những chuỗi có kích thước nhỏ nhất, lớn nhất
                    chuoiCoKichThuocNhoNhat(mangA);
                    break;
                case 3:
                    //Bài 3 : In ra những số chẵn từ 1 - 100 sử dụng continue
                    kichThuocTB(mangA);
                    break;
                case 4:
                    //Bài 4: hiển thị các chuỗi có trong mảng có kích thước lớn hơn trung bình
                    chuoiLonHonTB(mangA);
                    break;
                case 5:
                    //Bài 5: sắp xếp các chuỗi tăng dần, giảm dần theo kích thước
                    sapXepChuoi(mangA);
                    break;
                case 6:
                    //Bài

                    break;
                case 7:
                    //Bài

                    break;
                case 8:
                    //Bài 8: nhập vào 1 chuỗi st. Tìm những chuỗi có cùng kích thước với chuỗi st trong mảng. Tìm những chuỗi st có trong mảng
                    bai8(mangA);
                    break;
                case 9:
                    //Bài 9: tìm những chuỗi có tính đối xứng trong mảng
                    chuoiDoiXung(mangA);
                    break;
                case 10:
                    //Bài 10. hiển thị những chuỗi là địa chỉ email chuẩn
                    emailChuan(mangA);
                    break;
                case 11:
                    //Bài 11: tìm những chuỗi có chứa ký tự số
                    chuoiKyTuSo(mangA);
                    break;
                case 12:
                    System.exit(0);
                default:
                    break;
            }
        } while (option == 10);
    }

    // 1. nhập N và một mảng gồm N chuỗi

    // nhap N
    public static int nhapN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập N: ");
        int a = sc.nextInt();
        return a;
    }

    // nhap mang
    public static String[] nhapMang(int a) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[a];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("mời bạn nhập phần tử số: " + (i + 1));
            strings[i] = sc.nextLine();
        }
        return strings;
    }

    // 2. tìm những chuỗi có kích thước nhỏ nhất, lớn nhất
    public static void chuoiCoKichThuocNhoNhat(String[] a) {

        //tìm kích thước nho nhat của chuỗi
        chuoiMin = a[0].length();
        for (int i = 1; i < a.length; i++) {
            if (a[i].length() < chuoiMin) {
                chuoiMin = a[i].length();
            }
        }

        // in các chuỗi có kích thước nhỏ nhất
        System.out.println("các chuỗi có kích thước nhỏ nhất trong mảng là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() == chuoiMin) {
                System.out.println(a[i]);
            }
        }

        //tìm kích thước lớn nhat của chuỗi
        chuoiMax = a[0].length();
        for (int i = 1; i < a.length; i++) {
            if (a[i].length() > chuoiMax) {
                chuoiMax = a[i].length();
            }
        }

        // in các chuỗi có kích thước lớn nhất
        System.out.println("các chuỗi có kích thước lớn nhất trong mảng là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() == chuoiMax) {
                System.out.println(a[i]);
            }
        }
    }

    //3. tính kích thước trung bình các chuỗi trong mảng
    public static void kichThuocTB(String[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i].length();
        }
        float a1 = sum;
        float a2 = a.length;
        chuoiTB = a1 / a2;
        System.out.println("kích thước trung bình của các chuỗi trong mảng là " + chuoiTB);
    }

    // 4. hiển thị các chuỗi có trong mảng có kích thước lớn hơn trung bình
    public static void chuoiLonHonTB(String[] a) {
        kichThuocTB(a);
        System.out.println("các chuỗi có kích thước lớn hơn trung bình là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > chuoiTB) {
                System.out.println(a[i]);
            }
        }
    }

    //5. sắp xếp các chuỗi tăng dần, giảm dần theo kích thước
    public static void sapXepChuoi(String[] a) {

        // xắp xếp tăng dần theo kích thước

        String[] chuoiTang = a;
        String temp1 = chuoiTang[0];
        for (int i = 0; i < chuoiTang.length - 1; i++) {
            for (int j = i + 1; j < chuoiTang.length; j++) {
                if (chuoiTang[i].length() > chuoiTang[j].length()) {
                    temp1 = chuoiTang[j];
                    chuoiTang[j] = chuoiTang[i];
                    chuoiTang[i] = temp1;
                }
            }
        }

        System.out.println("Mảng sau khi sắp xếp chuỗi tăng dần là: ");
        for (int i = 0; i < chuoiTang.length; i++) {
            System.out.print(chuoiTang[i] + "\t");
        }

        // xắp xếp giảm dần theo kích thước
        String[] chuoiGiam = a;
        String temp2 = chuoiGiam[0];
        for (int i = 0; i < chuoiGiam.length - 1; i++) {
            for (int j = i + 1; j < chuoiGiam.length; j++) {
                if (chuoiGiam[i].length() < chuoiGiam[j].length()) {
                    temp2 = chuoiGiam[j];
                    chuoiGiam[j] = chuoiGiam[i];
                    chuoiGiam[i] = temp2;
                }
            }
        }
        System.out.println();
        System.out.println("Mảng sau khi sắp xếp chuỗi giảm dần là: ");
        for (int i = 0; i < chuoiGiam.length; i++) {
            System.out.print(chuoiGiam[i] + "\t");
        }
        System.out.println();
    }

    // 8. nhập vào 1 chuỗi st. Tìm những chuỗi có cùng kích thước với chuỗi st trong mảng. Tìm những chuỗi st có trong mảng
    public static void bai8(String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
        String st = scanner.nextLine();

        //tìm chuỗi có cùng kích thước với chuỗi st
        System.out.println("các chuỗi có cùng kích thước với chuỗi " + st + " là: ");
        for (int i = 0; i < a.length; i++) {
            if (st.length() == a[i].length()) {
                System.out.print(a[i] + "\t");
            }
        }

        //Tìm những chuỗi st có trong mảng
        System.out.println();
        System.out.println("vị trí các phần tử " + st + " có trong mảng là: ");
        boolean check = true;
        for (int i = 0; i < a.length; i++) {
            if (st.equals(a[i])) {
                System.out.print((i + 1) + "\t");
                check = false;
            }
        }

        if (check) {
            System.out.println("trong mảng không có phần tử " + st + " nào cả");
        }
    }

    // 9. tìm những chuỗi có tính đối xứng trong mảng
    public static void chuoiDoiXung(String[] a) {
        boolean check = true;
        System.out.println("các chuỗi đối xứng có trong mảng là: ");
        for (int i = 0; i < a.length; i++) {
            String reverseString = "";
            String inputString = a[i];
            int length = inputString.length() - 1;
            for (int j = length; j >= 0; j--) {
                reverseString = reverseString + inputString.charAt(j);
                if (inputString.equals(reverseString)) System.out.println(a[i] + "\t");
                check = false;
            }
        }

        if (check) {
            System.out.println("không có chuỗi đối xứng nào có trong mảng");
        }
    }

    //10. hiển thị những chuỗi là địa chỉ email chuẩn
    public static void emailChuan(String[] a) {
        boolean check = true;
        System.out.println("những chuỗi là địa chỉ email chuẩn là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].endsWith(".com")) {
                System.out.print(a[i] + "\t");
                check = false;
            }
        }

        if (check) {
            System.out.println("không có chuỗi nào là địa chỉ chuẩn email");
        }
    }

    public static void chuoiKyTuSo(String[] a) {
        boolean check = true;
        System.out.println("các chuỗi có ký tự số trong mảng là: ");
        for (int i = 0; i < a.length; i++) {
            String hung = a[i];
            for (int j = 0; j < hung.length(); j++) {
                if (hung.codePointAt(j) > 47 && hung.codePointAt(j) < 58) {
                    System.out.println(hung);
                    check = false;
                    break;
                }
            }
        }

        if (check) {
            System.out.println("không có chuỗi nào có ký tự số có trong mảng");
        }
    }
}
