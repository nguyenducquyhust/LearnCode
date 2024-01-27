package buoi4;

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
            System.out.println("12. tìm những chuỗi có chứa ký tự in Hoa");
            System.out.println("13. nhập từ bàn phím kí t c bất kì, tìm những chuỗi có chứa ký tự c");
            System.out.println("14. mỗi chuỗi trong mảng a có bao nhiêu từ");
            System.out.println("15. nhập vào một ký tự rồi chèn kí tự đó vào chuỗi cuối cùng ở vị trí thứ 5");
            System.out.println("16. nhập M chuỗi(0<M<N) sau đó đếm xem mỗi chuỗi trong M chỗi xuất hiện bao nhiêu lần trong N chuỗi ");
            System.out.println("17. nối tất cả các chuỗi và in ra");
            System.out.println("18. hiển thị những chuỗi chứa chuỗi đầu tiên");
            System.out.println("19. kiểm tra xem chuỗi đầu tiên có bắt đầu bằng chuỗi Hello không");
            System.out.println("20. tính giá trị trung bình theo ký tự trong bảng mã ASCII của từng chuỗi");
            System.out.println("21. hiển thị những chuỗi có độ dài lớn hơn độ dài nhỏ nhất và nhỏ hơn độ dài lớn nhất");
            System.out.println("22. nhập vào một độ dài xác định và in ra những chuỗi có độ dài bằng độ dài đó");
            System.out.println("23. đếm số từ trong chuỗi thứ N-1");
            System.out.println("24. chuyển chuỗi thứ hai thành chuỗi in hoa");
            System.out.println("25. cắt kí tự trắng ở cuối chuỗi cuối cùng");

            System.out.println("27. thoát");
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
                    //Bài 2 : tìm những chuỗi có kích thước nhỏ nhất, lớn nhất
                    bai2(mangA);
                    break;
                case 3:
                    //Bài 3 : In ra những số chẵn từ 1 - 100 sử dụng continue
                    bai3(mangA);
                    break;
                case 4:
                    //Bài 4 : hiển thị các chuỗi có trong mảng có kích thước lớn hơn trung bình
                    bai4(mangA);
                    break;
                case 5:
                    //Bài 5 : sắp xếp các chuỗi tăng dần, giảm dần theo kích thước
                    bai5(mangA);
                    break;
                case 6:
                    //Bài 6 : tìm những chuỗi nhỏ nhất, lớn nhất theo thứ tự trong bảng mã ASCII
                    bai6(mangA);
                    break;
                case 7:
                    //Bài 7 : sắp xếp các chuỗi tăng dần, giảm dần theo thứ tự trong bảng mã ASCII
                    bai7(mangA);
                    break;
                case 8:
                    //Bài 8 : nhập vào 1 chuỗi st. Tìm những chuỗi có cùng kích thước với chuỗi st trong mảng. Tìm những chuỗi st có trong mảng
                    bai8(mangA);
                    break;
                case 9:
                    //Bài 9 : tìm những chuỗi có tính đối xứng trong mảng
                    bai9(mangA);
                    break;
                case 10:
                    //Bài 10 : hiển thị những chuỗi là địa chỉ email chuẩn
                    bai10(mangA);
                    break;
                case 11:
                    //Bài 11 : tìm những chuỗi có chứa ký tự số
                    bai11(mangA);
                    break;
                case 12:
                    //Bài 11 : tìm những chuỗi có chứa ký tự iN HOA
                    bai12(mangA);
                    break;
                case 13:
                    //Bài 11: nhập từ bàn phím kí t c bất kì, tìm những chuỗi có chứa ký tự c
                    bai13(mangA);
                    break;
                case 14:
                    //Bài 11: mỗi chuỗi trong mảng a có bao nhiêu từ
                    bai14(mangA);
                    break;
                case 15:
                    //Bài 15: nhập vào một ký tự rồi chèn kí tự đó vào chuỗi cuối cùng ở vị trí thứ 5
                    bai15(mangA);
                    break;
                case 16:
                    //Bài 16: nhập M chuỗi(0<M<N) sau đó đếm xem mỗi chuỗi trong M chỗi xuất hiện bao nhiêu lần trong N chuỗi
                    bai16(mangA);
                    break;
                case 17:
                    //Bài 17: nối tất cả các chuỗi và in ra
                    bai17(mangA);
                    break;
                case 18:
                    //Bài 11: tìm những chuỗi có chứa ký tự số
                    bai18(mangA);
                    break;
                case 19:
                    //Bài 11: tìm những chuỗi có chứa ký tự số
                    bai19(mangA);
                    break;
                case 20:
                    //Bài 11: tìm những chuỗi có chứa ký tự số
                    bai20(mangA);
                    break;
                case 21:
                    //Bài 11: tìm những chuỗi có chứa ký tự số
                    bai21(mangA);
                    break;
                case 22:
                    //Bài 11: tìm những chuỗi có chứa ký tự số
                    bai22(mangA);
                    break;
                case 23:
                    //Bài 11: tìm những chuỗi có chứa ký tự số
                    bai23(mangA);
                    break;
                case 24:
                    //Bài 11: tìm những chuỗi có chứa ký tự số
                    bai24(mangA);
                    break;
                case 25:
                    //Bài 11: tìm những chuỗi có chứa ký tự số
                    bai25(mangA);
                    break;

                case 26:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);
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
    public static void bai2(String[] a) {

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

    // 3. tính kích thước trung bình các chuỗi trong mảng
    public static void bai3(String[] a) {
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
    public static void bai4(String[] a) {
        bai3(a);
        System.out.println("các chuỗi có kích thước lớn hơn trung bình là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > chuoiTB) {
                System.out.println(a[i]);
            }
        }
    }

    // 5. sắp xếp các chuỗi tăng dần, giảm dần theo kích thước
    public static void bai5(String[] a) {

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

    // 6.//Bài 6 : tìm những chuỗi nhỏ nhất, lớn nhất theo thứ tự trong bảng mã ASCII
    public static void bai6(String[] a) {
        //chuỗi nhỏ nhất theo bảng mã ascii
        int kiTuChuoiNhoNhat = a[0].codePointAt(0);
        for (int i = 1; i < a.length; i++) {
            if (a[i].codePointAt(0) < kiTuChuoiNhoNhat) {
                kiTuChuoiNhoNhat = a[i].codePointAt(0);
            }
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i].codePointAt(0) == kiTuChuoiNhoNhat) {
                System.out.println(a[i] + "\t");
            }
        }

        //chuỗi lớn nhất theo bảng mã ascii
        int kiTuChuoiLonNhat = a[0].codePointAt(0);
        for (int i = 1; i < a.length; i++) {
            if (a[i].codePointAt(0) > kiTuChuoiLonNhat) {
                kiTuChuoiLonNhat = a[i].codePointAt(0);
            }
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i].codePointAt(0) == kiTuChuoiLonNhat) {
                System.out.println(a[i] + "\t");
            }
        }
    }

    // 7. sắp xếp các chuỗi tăng dần, giảm dần theo thứ tự trong bảng mã ASCII
    public static void bai7(String[] a) {
        // xắp xếp tăng dần theo thứ tự trong bảng mã ASCII
        String[] chuoiTang = a;
        String temp1 = chuoiTang[0];
        for (int i = 0; i < chuoiTang.length - 1; i++) {
            for (int j = i + 1; j < chuoiTang.length; j++) {
                if (chuoiTang[i].codePointAt(0) > chuoiTang[j].codePointAt(0)) {
                    temp1 = chuoiTang[j];
                    chuoiTang[j] = chuoiTang[i];
                    chuoiTang[i] = temp1;
                }
            }
        }

        System.out.println("Mảng sau khi sắp xếp chuỗi tăng dần theo tứ tự bảng mã ASCII là: ");
        for (int i = 0; i < chuoiTang.length; i++) {
            System.out.print(chuoiTang[i] + "\t");
        }

        // xắp xếp giảm dần theo thứ tự trong bảng mã ASCII
        String[] chuoiGiam = a;
        String temp2 = chuoiGiam[0];
        for (int i = 0; i < chuoiGiam.length - 1; i++) {
            for (int j = i + 1; j < chuoiGiam.length; j++) {
                if (chuoiGiam[i].codePointAt(0) < chuoiGiam[j].codePointAt(0)) {
                    temp2 = chuoiGiam[j];
                    chuoiGiam[j] = chuoiGiam[i];
                    chuoiGiam[i] = temp2;
                }
            }
        }
        System.out.println();
        System.out.println("Mảng sau khi sắp xếp chuỗi giảm dần theo tứ tự bảng mã ASCII là: ");
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
    public static void bai9(String[] a) {
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
    public static void bai10(String[] a) {
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

    // 11. tìm những chuỗi có chứa ký tự số
    public static void bai11(String[] a) {
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

    // 12. tìm những chuỗi có chứa ký tự in Hoa
    public static void bai12(String[] a) {
        boolean check = true;
        System.out.println("các chuỗi có ký tự IN HOA trong mảng là: ");
        for (int i = 0; i < a.length; i++) {
            String hung = a[i];
            for (int j = 0; j < hung.length(); j++) {
                if (hung.codePointAt(j) > 64 && hung.codePointAt(j) < 91) {
                    System.out.print(hung+"\t");
                    check = false;
                    break;
                }
            }
        }

        if (check) {
            System.out.println("không có chuỗi nào có ký tự IN HOA có trong mảng");
        }
    }

    // 13. nhập từ bàn phím kí t c bất kì, tìm những chuỗi có chứa ký tự c
    public static void bai13(String[] a) {
        // nhập ký tự
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào ký tự bạn muốn kiểm tra: ");
        String st = scanner.nextLine();

        if (st.length() == 1) {
            boolean check = true;
            System.out.println("các chuỗi có ký tự " + st + " trong mảng là: ");
            for (int i = 0; i < a.length; i++) {
                String hung = a[i];
                for (int j = 0; j < hung.length(); j++) {
                    if (hung.codePointAt(j) == st.codePointAt(0)) {
                        System.out.println(hung);
                        check = false;
                        break;
                    }
                }
            }

            if (check) {
                System.out.println("không có chuỗi nào có ký tự " + st + " trong mảng");
            }
        } else {
            System.out.println("nhập sai cú pháp ký tự");
        }
    }

    // 14. mỗi chuỗi trong mảng a có bao nhiêu từ
    public static void bai14(String[] a) {
        for (int i = 0; i < a.length; i++) {
            String[] mangString = a[i].split(" ");
            System.out.println("chuỗi " + a[i] + " có " + mangString.length + " từ");
        }
    }

    // 15. nhập vào một ký tự rồi chèn kí tự đó vào chuỗi cuối cùng ở vị trí thứ 5
    public static void bai15(String[] a) {
        // nhập ký tự
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào ký tự bạn muốn chèn: ");
        String st = scanner.nextLine();
        char[] charSt = st.toCharArray();

        if (st.length() == 1) {
            String chen = a[a.length - 1];
            if (chen.length() > 4) {
                String hung1 = chen.substring(0,4);
                String hung2 = chen.substring(4);
                String string = hung1+st+hung2;
                System.out.println("chuỗi cuối cùng sau khi đc chèn là: "+string);

            } else if (chen.length() == 4) {
                System.out.println("chuỗi cuối cùng sau khi chèn là: "+chen+st);
            } else {
                System.out.println("chuỗi cuối cùng có số kí tự it hơn 4");
            }
        } else {
            System.out.println("nhập sai cú pháp ký tự");
        }
    }

    // 16. nhập M chuỗi(0<M<N) sau đó đếm xem mỗi chuỗi trong M chỗi xuất hiện bao nhiêu lần trong N chuỗi
    public static void bai16(String[] a) {
        // nhap m
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu chuỗi: ");
        int m = scanner.nextInt();

        // xác định số lần lặp
        String[] mangChuoiM = nhapMang(m);
        int[] soLanXuatHien = new int[m];
        for (int i = 0; i < soLanXuatHien.length; i++) {
            soLanXuatHien[i] = 0;
        }
        for (int i = 0; i < mangChuoiM.length; i++) {
            int dem = 0;
            for (int j = 0; j < a.length; j++) {
                if (mangChuoiM[i].equals(a[j])) {
                    dem =dem+1;
                    soLanXuatHien[i] = dem;
                }
            }
        }

        //in kết quả
        for (int i = 0; i < mangChuoiM.length; i++) {
            System.out.println("chuỗi " + mangChuoiM[i] + " xuất hiện " + soLanXuatHien[i] + " lần");
        }
    }

    // 17. nối tất cả các chuỗi và in ra
    public static void bai17(String[] a) {
        String noiChuoi = a[0];
        for (int i = 1; i < a.length; i++) {
            noiChuoi = noiChuoi.concat(a[i]);
        }
        System.out.println("chuỗi sau khi nối là: " + noiChuoi);
    }

    // 18. hiển thị những chuỗi chứa chuỗi đầu tiên
    public static void bai18(String[] a) {
        boolean check = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i].contains(a[0])) {
                System.out.println("những chuỗi chứa chuỗi đầu tiên là: ");
                System.out.println(a[i] + "\t");
                check = false;
            }
        }
        if (check){
            System.out.println("không có chuỗi nào có chứa chuỗi đầu tiên");
        }
    }

    // 19. kiểm tra xem chuỗi đầu tiên có bắt đầu bằng chuỗi Hello không
    public static void bai19(String[] a) {
        if (a[0].startsWith("Hello")) {
            System.out.println("chuỗi đầu tiên có bắt đầu bằng Hello");
        } else {
            System.out.println("chuỗi đầu tiên không chứa Hello");
        }
    }

    // 20.tính giá trị trung bình theo ký tự trong bảng mã ASCII của từng chuỗi
    public static void bai20(String[] a) {
        double[] hung = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            String chuoi = a[i];
            double tBChuoi = 0;
            for (int j = 0; j < chuoi.length(); j++) {
                tBChuoi = tBChuoi + chuoi.codePointAt(j);
            }
            tBChuoi = tBChuoi / chuoi.length();
            System.out.println("giá trị trung bình theo ký tự trong bảng mã ASCII của chuỗi :" + chuoi + " là: " + tBChuoi);
        }
    }

    // 21. hiển thị những chuỗi có độ dài lớn hơn độ dài nhỏ nhất và nhỏ hơn độ dài lớn nhất
    public static void bai21(String[] a) {
        bai2(a);
        System.out.println("những chuỗi có độ dài lớn hơn độ dài nhỏ nhất là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > chuoiMin) {
                System.out.println(a[i] + "\t");
            }
        }

        System.out.println();
        System.out.println("những chuỗi có độ dài nhỏ hơn độ dài lớn nhất là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() < chuoiMax) {
                System.out.println(a[i] + "\t");
            }
        }
    }

    // 22. nhập vào một độ dài xác định và in ra những chuỗi có độ dài bằng độ dài đó
    public static void bai22(String[] a) {
        // nhập độ dài
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập độ dài cần kiểm tra: ");
        int n = sc.nextInt();

        // in ra chuỗi có độ dài bằng n
        boolean check = true;

        System.out.println("những chuỗi có độ dài bằng " + n + " là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() == n) {
                System.out.println(a[i] + "\t");
                check = false;
            }
        }
        if (check){
            System.out.println(" không có chuỗi nào có độ dài bằng " + n);
        }
    }

    // 23. đếm số từ trong chuỗi thứ N-1
    public static void bai23(String[] a) {
        String hung = a[a.length - 2];
        String[] mangString = hung.split(" ");
        System.out.println("số từ trong chuỗi thứ " + (a.length - 1) + " là:" + mangString.length);
    }

    // 24. chuyển chuỗi thứ hai thành chuỗi in hoa
    public static void bai24(String[] a) {
        if (a.length > 1) {
            String hung = a[1].toUpperCase();
            System.out.println("chuỗi " + a[1] + " sau khi chuyển thành in hoa là: " + hung);
        }else {
            System.out.println("chuỗi không có phần tử thứ 2");
        }
    }

    // 25.cắt kí tự trắng ở cuối chuỗi cuối cùng
    public static void bai25(String[] a) {
        String hung = a[a.length - 1];
        int vitri = 0;
        for (int i = (hung.length() - 1); i >= 0; i--) {
            if (hung.codePointAt(i) == 32) {
                vitri = i;
            } else if (hung.codePointAt(i) != 32) {
                break;
            }
        }
        System.out.println("kí tự trắng sau khi đc cắt tại chuỗi cuối cùng là: " + hung.substring(0, vitri));
    }
}