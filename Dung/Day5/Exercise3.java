package day5;

import java.util.Scanner;
import static day5.Exercise2.print;
import static day5.Exercise2.println;

public class Exercise3 {
    public static void main(String[] args) {

        println("----------------------------------------------------");
        println("Đây là chương trình dạng Menu");
        println("Chương trình có danh sách từ 1 đến 26");
        println("Nhập số từ 1 đến 26 để thực hiện công việc mình muốn");
        println("----------------------------------------------------");
        println("* Yêu cầu: Nhập số 1 vào lần nhập đầu tiên để bắt đầu");
        println("           Nhập số 26 để kết thúc chương trình");

        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int soPhanTu;
        String[] array = new String[1];

        while (true) {
            print("\nNhập lựa chọn của bạn: ");
            int option = scanner.nextInt();
            println("__________________________________________");
            if (option == 26) {
                println("Kết thúc chương trình");
                System.exit(0);
                break;
            }
            if (option == 1) {
                valid = true;
                soPhanTu = soPhanTu();
                array = nhapChuoiTrongMang(soPhanTu);
                println("_Kết thúc công việc 1_");
            }
            if (valid) {
                switch (option) {
                    case 1:
                        break;
                    case 2:         //Chuỗi có kích thước nhỏ nhất, lớn nhất
                        option2(array);
                        break;
                    case 3:         //Kích thước trung bình của các chuỗi
                        option3(array);
                        break;
                    case 4:         //Hiển thị những chuỗi có kích thước lớn hơn trung bình
                        option4(array);
                        break;
                    case 5:         //Sắp xếp các chuỗi tăng dần, giảm dần theo kích thước
                        option5(array);
                        break;
//                    case 6:         //Những chuỗi nhỏ nhất, lớn nhất theo thứ tự ký tự trong bảng ASCII
                    case 8:         //Nhập một chuỗi st. Tìm chuỗi có kích thước bằng & có chứa st
                        option8(array);
                        break;
                    case 9:         //Tìm những chuỗi có tính đối xứng trong mảng
                        option9(array);
                        break;
                    case 11:        //Tìm những chuỗi có ký tự số
                        option11(array);
                        break;
                    case 12:        //Tìm những chuỗi có ký tự in HOA
                        option12(array);
                        break;
                    case 13:        //Kiểm tra có chuỗi nào chứa ký tự c vừa nhập không
                        option13(array);
                        break;
                    case 14:        //Mỗi chuỗi trong mảng có bao nhiêu từ
                        option14(array);
                        break;
                    case 15:        //Nhập và chèn 1 ký tự vào vị trí 5 của chuỗi cuối
                        option15(array);
                        break;
                    case 16:        //Nhập M chuỗi và kiểm tra chuỗi M xuất hiện bao nhiêu lần trong N chuỗi
                        option16(array);
                        break;
                    case 17:        //Nối tất cả các chuỗi và in ra
                        option17(array);
                        break;
                    case 18:        //Hiển thị những chuỗi chứa chuỗi đầu tiên
                        option18(array);
                        break;
                    case 19:        //Kiểm tra chuỗi đầu tiên có bắt đầu bằng chuỗi (hello) không
                        option19(array);
                        break;
                    case 20:        //Giá trị trung bình theo vị trí ký tự trong bảng ASCII của chuỗi trong mảng
                        option20(array);
                        break;
                    case 21:        //Chuỗi có độ dài lớn hơn chuỗi ngắn nhất và nhỏ hơn chuỗi dài nhất trong mảng
                        option21(array);
                        break;
                    case 22:        //Nhập một độ dài và in những chuỗi có độ dài bằng độ dài vừa nhập
                        option22(array);
                        break;
                    case 23:        //Đếm số từ trong chuỗi thứ N - 1
                        option23(array);
                        break;
                    case 24:        //Chuỗi thứ hai trong mảng chuyển thành chuỗi in HOA
                        option24(array);
                        break;
                    case 25:        //Xóa ký tự trắng ở chuỗi cuối cùng
                        option25(array);
                        break;
                    default:
                        println("Không hợp lệ. Mời nhập lại.");
                        break;
                }
            } else {
                println("Không hợp lệ. Mời nhập lại.");
            }
        }
    }


    static int soPhanTu() {
        Scanner scanner = new Scanner(System.in);
        int soPhanTu;
        while (true) {
            print("Nhập số phần tử trong mảng: ");
            soPhanTu = scanner.nextInt();
            if (soPhanTu > 0 && soPhanTu <= 50) {
                break;
            } else {
                println("Số phần tử không hợp lệ. Mời nhập lại");
            }
        }
        return soPhanTu;
    }

    static String[] nhapChuoiTrongMang(int soPhanTu) {
        String[] array = new String[soPhanTu];
        Scanner scanner = new Scanner(System.in);

        println("_Nhập chuỗi kích thước tối đa 30_");
        for (int i = 0; i < soPhanTu; i++) {
            while (true) {
                int j = i + 1;
                print("Nhập chuỗi thứ " + j + ": ");
                array[i] = scanner.nextLine();
                if (array[i].length() <= 30 && !array[i].isEmpty()) {
                    break;
                } else {
                    println("Chuỗi thứ " + j + " không thỏa mãn. Mời nhập lại.");
                }
            }
        }
        return array;
    }

    static String nhapChuoiST() {
        Scanner scanner = new Scanner(System.in);
        String st;
        while (true) {
            print("Nhập một chuỗi st có kích thước tối đa 30: ");
            st = scanner.nextLine();
            if (st.length() <= 30 && !st.isEmpty()) {
                break;
            } else {
                println("Chuỗi không thỏa mãn. Mời nhập lại.");
            }
        }
        return st;
    }

    static int[] stringLength(String[] array) {
        int[] stringLength = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            stringLength[i] = array[i].length();
        }
        return stringLength;
    }

    static String longestString(String[] array) {
        int[] stringLength = stringLength(array);
        String longestString = array[0];
        int longest = stringLength[0];

        for (int i = 0; i < array.length; i++) {
            if (longest <= stringLength[i]) {
                longest = stringLength[i];
                longestString = array[i];
            }
        }

        return longestString;
    }

    static String shortestString(String[] array) {
        int[] stringLength = stringLength(array);
        String shortestString = array[0];
        int shortest = stringLength[0];

        for (int i = 0; i < array.length; i++) {
            if (shortest >= stringLength[i]) {
                shortest = stringLength[i];
                shortestString = array[i];
            }
        }

        return shortestString;
    }

    static void option2(String[] array) {
        println("Chuỗi có kích thước lớn nhất: " + longestString(array));
        println("Chuỗi có kích thước nhỏ nhất: " + shortestString(array));
        println("_Kết thúc công việc 2_");
    }

    static void option3(String[] array) {
        int[] stringLength = stringLength(array);
        int sumOfChar = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfChar += stringLength[i];
        }
        double avgNumOfChar = (double) sumOfChar / array.length;
        println("Kích thước trung bình của các chuỗi: " + avgNumOfChar);
        println("_Kết thúc công việc 3_");
    }

    static void option4(String[] array) {
        int[] stringLength = stringLength(array);
        int sumOfChar = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfChar += stringLength[i];
        }
        double avgNumOfChar = (double) sumOfChar / array.length;

        println("Những chuỗi có kích thuớc lớn hơn trung bình là: ");
        for (int i = 0; i < array.length; i++) {
            if (stringLength[i] >= avgNumOfChar) {
                int j = i + 1;
                println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }
        println("_Kết thúc công việc 4_");
    }

    static void option5(String[] array) {
        int[] stringLength = stringLength(array);
        println("- Chuỗi được sắp xếp tăng dần: ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (stringLength[i] > stringLength[j]) {
                    String central = array[j];
                    array[j] = array[i];
                    array[i] = central;
                }
            }
        }
        for (String s : array) {
            println(s);
        }

        println("\n- Chuỗi được sắp xếp giảm dần: ");
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            String reverse = array[i];
            array[i] = array[j];
            array[j] = reverse;
        }
        for (String s : array) {
            println(s);
        }

        println("_Kết thúc công việc 5_");
    }

    static void option8(String[] array) {   //Nhập một chuỗi st. Tìm chuỗi có kích thước bằng & có chứa st
        String st = nhapChuoiST();
        int[] stringLength = stringLength(array);

        boolean check1 = true;
        println("Chuỗi trong mảng có kích thước bằng chuỗi st: ");
        for (int i = 0; i < array.length; i++) {
            if (stringLength[i] == st.length()) {
                check1 = false;
                int j = i + 1;
                println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }
        if (check1) {
            println("Không có chuỗi nào trong mảng bằng kích thước chuỗi st.");
        }

        boolean check2 = true;
        println("\nChuỗi trong mảng có chứa st: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(st)) {
                check2 = false;
                int j = i + 1;
                println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }
        if (check2) {
            println("Không có chuỗi nào trong mảng chứa chuỗi st");
        }

        println("_Kết thúc công việc 8_");
    }

    static void option9(String[] array) {     //Tìm những chuỗi có tính đối xứng trong mảng
        boolean foundSymmetry = true;

        println("Chuỗi có tính đối xứng trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            for (int j = 0, k = array[i].length() - 1; j < k; j++, k--) {
                if (charArray[j] != charArray[k]) {
                    foundSymmetry = false;
                    break;
                } else {
                    foundSymmetry = true;
                }
            }

            if (foundSymmetry) {
                int a = i + 1;
                println("- Chuỗi thứ " + a + ": " + array[i]);
            }
        }

        if (!foundSymmetry) {
            println("Không có chuỗi nào có tính đối xứng trong mảng.");
        }
        println("_Kết thúc công việc 9_");
    }


    static void option11(String[] array) {         //Tìm những chuỗi có ký tự số
        boolean foundNumber = true;
        println("Chuỗi có ký tự số: ");
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            for (int j = 0; j < array[i].length(); j++) {
                if (charArray[j] > 47 && charArray[j] < 58) {
                    foundNumber = false;
                    int k = i + 1;
                    println("- Chuỗi thứ " + k + ": " + array[i]);
                    break;
                }
            }
        }

        if (foundNumber) {
            println("Không có chuỗi nào trong mảng có ký tự số.");
        }

        println("_Kết thúc công việc 11_");
    }

    static void option12(String[] array) {             //Tìm những chuỗi có ký tự in HOA
        boolean foundUpperChar = true;
        println("Chuỗi có ký tự in HOA: ");
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            for (int j = 0; j < array[i].length(); j++) {
                if (charArray[j] > 64 && charArray[j] < 91) {
                    foundUpperChar = false;
                    int k = i + 1;
                    println("- Chuỗi thứ " + k + ": " + array[i]);
                    break;
                }
            }
        }

        if (foundUpperChar) {
            println("Không có chuỗi nào trong mảng có ký tự in HOA.");
        }

        println("_Kết thúc công việc 12_");
    }

    static void option13(String[] array) {              //Kiểm tra có chuỗi nào chứa ký tự c vừa nhập không
        Scanner scanner = new Scanner(System.in);
        print("Nhập một ký tự bất kỳ: ");
        char kyTu = scanner.next().charAt(0);

        println("Chuỗi có ký tự vừa nhập: ");
        boolean foundChar = true;
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            for (int j = 0; j < array[i].length(); j++) {
                if (charArray[j] == kyTu) {
                    foundChar = false;
                    int k = i + 1;
                    println("- Chuỗi thứ " + k + ": " + array[i]);
                    break;
                }
            }
        }

        if (foundChar) {
            println("Không có chuỗi nào trong mảng có ký tự vừa nhập.");
        }

        println("_Kết thúc công việc 13_");
    }

    static void option14(String[] array) {      //Mỗi chuỗi trong mảng có bao nhiêu từ
        for (int i = 0; i < array.length; i++) {
            boolean foundSplit = true;
            int wordCount = 0;
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) != ' ' && array[i].charAt(j) != '\t' && array[i].charAt(j) != '\n') {
                    if (foundSplit) {
                        wordCount++;
                        foundSplit = false;
                    }
                } else {
                    foundSplit = true;
                }
            }

            int k = i + 1;
            println("- Chuỗi thứ " + k + " có " + wordCount + " từ.");
        }

        println("_Kết thúc công việc 14_");
    }

    static void option15(String[] array) {       //Nhập và chèn 1 ký tự vào vị trí 5 của chuỗi cuối
        Scanner scanner = new Scanner(System.in);
        print("Nhập một ký tự bất kỳ: ");
        char kyTu = scanner.next().charAt(0);
        char[] charLastStr = array[array.length - 1].toCharArray();
        char[] newStr = new char[array[array.length - 1].length() + 1];

        println("Ký tự " + kyTu + " được chèn vào vị trí thứ 5 của chuỗi cuối cùng trong mảng.");
        print("Chuỗi mới là: ");

        for (int i = 0; i <= array[array.length - 1].length(); i++) {
            if (i < 4) {
                newStr[i] = charLastStr[i];
            } else if (i == 4) {
                newStr[i] = kyTu;
            } else {
                newStr[i] = charLastStr[i - 1];
            }

            print(String.valueOf(newStr[i]));
        }

        println("\n_Kết thúc công việc 15_");
    }

    static void option16(String[] array) {     //Nhập M chuỗi và kiểm tra chuỗi M xuất hiện bao nhiêu lần trong N chuỗi
        String[] secondArray;

        println("_Nhập số phần tử cho mảng mới nhỏ hơn số phần tử mảng ban đầu_");
        while (true) {
            int soPhanTuM = soPhanTu();
            if (soPhanTuM >= array.length) {
                println("Không thỏa mãn. Mời nhập lại.");
            } else {
                secondArray = nhapChuoiTrongMang(soPhanTuM);
                break;
            }
        }

        println("\n_Số lần mỗi chuỗi trong mảng mới xuất hiện trong mảng ban đầu_");
        int[] sum = new int[secondArray.length];
        for (int i = 0; i < secondArray.length; i++) {
            sum[i] = 0;
            for (String s : array) {
                if (s.contains(secondArray[i])) {
                    sum[i] += 1;
                }
            }
            int j = i + 1;
            println("- Chuỗi thứ " + j + " trong mảng mới xuất hiện: " + sum[i] + " lần.");
        }

        println("_Kết thúc công việc 16_");
    }

    static void option17(String[] array) {           //Nối tất cả các chuỗi và in ra
        for (int i = 0; i < array.length; i++) {
            array[0] = array[0].concat(array[i]);
        }

        println("Nối tất cả các chuỗi trong mảng: " + array[0]);
        println("_Kết thúc công việc 17_");
    }

    static void option18(String[] array) {      //Hiển thị những chuỗi chứa chuỗi đầu tiên
        println("Chuỗi trong mảng có chứa chuỗi đầu tiên: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(array[0])) {
                int j = i + 1;
                println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }
    }

    static void option19(String[] array) {      //Kiểm tra chuỗi đầu tiên có bắt đầu bằng chuỗi (hello) không
        boolean check = true;
        char[] charHello = "hello".toCharArray();
        char[] charFirstStr = array[0].toCharArray();

        for (int i = 0; i < 5; i++) {
            if (charHello[i] != charFirstStr[i]) {
                check = false;
                break;
            }
        }

        if (check) {
            println("Chuỗi đầu tiên có bắt đầu bằng chuỗi (hello).");
        } else {
            println("Chuỗi đầu tiên không bắt đầu bằng chuỗi (hello).");
        }

        println("_Kết thúc công việc 19_");
    }

    static void option20(String[] array) {
        println("Giá trị trung bình theo vị trí ký tự trong bảng ASCII của chuỗi trong mảng: ");
        double[] sum = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            sum[i] = 0;
            char[] charArray = array[i].toCharArray();
            for (int j = 0; j < array[i].length(); j++) {
                int k = charArray[j];
                sum[i] += k;
            }

            sum[i] = sum[i] / array.length;
            int j = i + 1;
            println("- Chuỗi thứ " + j + ": " + sum[i]);
        }

        println("_Kết thúc công việc 20_");
    }

    static void option21(String[] array) {
        String longest = longestString(array);
        String shortest = shortestString(array);

        boolean check = true;
        println("Chuỗi có độ dài lớn hơn chuỗi ngắn nhất và nhỏ hơn chuỗi dài nhất trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > shortest.length() && array[i].length() < longest.length()) {
                check = false;
                int j = i + 1;
                println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }

        if (check) {
            println("Không có chuỗi nào thỏa mãn.");
        }

        println("_Kết thúc công việc 21_");
    }

    static void option22(String[] array) {
        Scanner scanner = new Scanner(System.in);
        int value;
        while (true) {
            print("Nhập một độ dài xác định: ");
            value = scanner.nextInt();
            if (value > 0) {
                break;
            } else {
                println("Độ dài không hợp lệ. Mời nhập lại.");
            }
        }

        println("Chuỗi có độ dài bằng độ dài vừa nhập: ");
        boolean check = true;
        int[] stringLength = stringLength(array);
        for (int i = 0; i < array.length; i++) {
            if (stringLength[i] == value) {
                check = false;
                int j = i + 1;
                println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }

        if (check) {
            println("Không có chuỗi nào trong mảng có độ dài bằng độ dài vừa nhập.");
        }


        println("_Kết thúc công việc 22_");
    }

    static void option23(String[] array) {    //Đếm số từ trong chuỗi thứ N - 1
        boolean foundSplit = true;
        int wordCount = 0;
        int pos = array.length - 2;
        for (int i = 0; i < array[pos].length(); i++) {
            if (array[pos].charAt(i) != ' ' && array[pos].charAt(i) != '\t' && array[pos].charAt(i) != '\n') {
                if (foundSplit) {
                    wordCount++;
                    foundSplit = false;
                }
            } else {
                foundSplit = true;
            }
        }

        int i = pos + 1;
        println("Chuỗi thứ " + i + " có " + wordCount + " từ.");
        println("_Kết thúc công việc 23_");
    }

    static void option24(String[] array) {
        println("_Chuỗi thứ hai trong mảng chuyển thành chuỗi in HOA_");
        if (array.length > 1) {
            char[] charArray = array[2].toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (Character.isLetter(charArray[i])) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                }
            }

            println("Chuỗi thứ hai mới là: " + String.valueOf(charArray));
        } else {
            println("Mảng không có chuỗi thứ hai.");
        }

        println("_Kết thúc công việc 24_");
    }

    static void option25(String[] array) {                     //Xóa ký tự trắng ở chuỗi cuối cùng
        String lastStr = array[array.length - 1];
        char[] charLastStr = lastStr.toCharArray();
        for (int i = array[array.length - 1].length() - 1; i >= 0; i--) {
            if (charLastStr[i] != 32) {
                break;
            } else {
                lastStr = lastStr.substring(0, lastStr.length() - 1);
            }
        }

        println("Chuỗi cuối cùng sau khi được xóa ký tự trắng ở cuối: " + lastStr);
        println("_Kết thúc công việc 25_");
    }
}



