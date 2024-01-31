import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int soPhanTu;
        String[] array = new String[1];

        while (true) {
            System.out.print("\n Nhập lựa chọn của bạn: ");
            int option = scanner.nextInt();
            if (option == 26) {
                System.out.println("Kết thúc chương trình");
                System.exit(0);
                break;
            }
            if (option == 1) {
                valid = true;
                soPhanTu = soPhanTu();
                array = nhapChuoiTrongMang(soPhanTu);
                System.out.println("_Kết thúc công việc 1_");
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
                    case 15:        //Nhập và chèn 1 ký tự vào vị trí 5 của chuỗi cuối
                        option15(array);
                        break;
                    case 17:        //Nối tất cả các chuỗi và in ra
                        option17(array);
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
                    default:
                        System.out.println("Không hợp lệ. Mời nhập lại.");
                        break;
                }
            } else {
                System.out.println("Không hợp lệ. Mời nhập lại.");
            }
        }
    }

    static int soPhanTu() {
        Scanner scanner = new Scanner(System.in);
        int soPhanTu;
        while (true) {
            System.out.print("Nhập số phần tử trong mảng: ");
            soPhanTu = scanner.nextInt();
            if (soPhanTu > 0 && soPhanTu <= 50) {
                break;
            } else {
                System.out.println("Số phần tử không hợp lệ. Mời nhập lại");
            }
        }
        return soPhanTu;
    }

    static String[] nhapChuoiTrongMang(int soPhanTu) {
        String[] array = new String[soPhanTu];
        Scanner scanner = new Scanner(System.in);

        System.out.println("_Nhập chuỗi kích thước tối đa 30_");
        for (int i = 0; i < soPhanTu; i++) {
            while (true) {
                int j = i + 1;
                System.out.print("Nhập chuỗi thứ " + j + ": ");
                array[i] = scanner.nextLine();
                if (array[i].length() <= 30) {
                    break;
                } else {
                    System.out.println("Chuỗi dài hơn kích thước yêu cầu. Mời nhập lại.");
                }
            }
        }
        return array;
    }

    static String nhapChuoiST() {
        Scanner scanner = new Scanner(System.in);
        String st;
        while (true) {
            System.out.print("Nhập một chuỗi st có kích thước tối đa 30: ");
            st = scanner.nextLine();
            if (st.length() <= 30) {
                break;
            } else {
                System.out.println("Chuỗi dài hơn kích thước yêu cầu. Mời nhập lại.");
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
        System.out.println("Chuỗi có kích thước lớn nhất: " + longestString(array));
        System.out.println("Chuỗi có kích thước nhỏ nhất: " + shortestString(array));
        System.out.println("_Kết thúc công việc 2_");
    }

    static void option3(String[] array) {
        int[] stringLength = stringLength(array);
        int sumOfChar = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfChar += stringLength[i];
        }
        double avgNumOfChar = (double) sumOfChar / array.length;
        System.out.println("Kích thước trung bình của các chuỗi: " + avgNumOfChar);
        System.out.println("_Kết thúc công việc 3_");
    }

    static void option4(String[] array) {
        int[] stringLength = stringLength(array);
        int sumOfChar = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfChar += stringLength[i];
        }
        double avgNumOfChar = (double) sumOfChar / array.length;

        System.out.println("Những chuỗi có kích thuớc lớn hơn trung bình là: ");
        for (int i = 0; i < array.length; i++) {
            if (stringLength[i] >= avgNumOfChar) {
                int j = i + 1;
                System.out.println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }
        System.out.println("_Kết thúc công việc 4_");
    }

    static void option5(String[] array) {
        int[] stringLength = stringLength(array);
        System.out.println("- Chuỗi được sắp xếp tăng dần: ");
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
            System.out.println(s);
        }

        System.out.println("\n- Chuỗi được sắp xếp giảm dần: ");
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            String reverse = array[i];
            array[i] = array[j];
            array[j] = reverse;
        }
        for (String s : array) {
            System.out.println(s);
        }

        System.out.println("_Kết thúc công việc 5_");
    }

    static void option8(String[] array) {   //Nhập một chuỗi st. Tìm chuỗi có kích thước bằng & có chứa st
        String st = nhapChuoiST();
        int[] stringLength = stringLength(array);
        boolean check1 = true;

        System.out.println("Chuỗi trong mảng có kích thước bằng chuỗi st: ");
        for (int i = 0; i < array.length; i++) {
            if (stringLength[i] == st.length()) {
                check1 = false;
                int j = i + 1;
                System.out.println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }
        if (check1) {
            System.out.println("Không có chuỗi nào trong mảng bằng kích thước chuỗi st.");
        }

        System.out.println("\nChuỗi trong mảng có chứa st: ");
        char[] charST = st.toCharArray();
        boolean check2 = true;
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            for (int j = 0; j < array[i].length() - st.length() + 1; j++) {
                boolean check3 = true;
                for (int k = 0; k < st.length(); k++) {
                    if (charArray[j + k] != charST[k]) {
                        check3 = false;
                        break;
                    }
                }
                if (check3) {
                    int a = i + 1;
                    System.out.println("- Chuỗi thứ " + a + ": " + array[i]);
                    check2 = false;
                }
            }
        }

        if (check2) {
            System.out.println("Không có chuỗi nào trong mảng chứa chuỗi st");
        }
        System.out.println("_Kết thúc công việc 8_");
    }

    static void option9(String[] array) {     //Tìm những chuỗi có tính đối xứng trong mảng
        boolean foundSymmetry = true;

        System.out.println("Chuỗi có tính đối xứng trong mảng: ");
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
                System.out.println("- Chuỗi thứ " + a + ": " + array[i]);
            }
        }

        if (!foundSymmetry) {
            System.out.println("Không có chuỗi nào có tính đối xứng trong mảng.");
        }
        System.out.println("_Kết thúc công việc 9_");
    }

    static void option11(String[] array) {         //Tìm những chuỗi có ký tự số
        boolean foundNumber = true;
        System.out.println("Chuỗi có ký tự số: ");
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            for (int j = 0; j < array[i].length(); j++) {
                if (charArray[j] > 47 && charArray[j] < 58) {
                    foundNumber = false;
                    int k = i + 1;
                    System.out.println("- Chuỗi thứ " + k + ": " + array[i]);
                    break;
                }
            }
        }

        if (foundNumber) {
            System.out.println("Không có chuỗi nào trong mảng có ký tự số.");
        }

        System.out.println("_Kết thúc công việc 11_");
    }

    static void option12(String[] array) {             //Tìm những chuỗi có ký tự in HOA
        boolean foundUpperChar = true;
        System.out.println("Chuỗi có ký tự in HOA: ");
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            for (int j = 0; j < array[i].length(); j++) {
                if (charArray[j] > 64 && charArray[j] < 91) {
                    foundUpperChar = false;
                    int k = i + 1;
                    System.out.println("- Chuỗi thứ " + k + ": " + array[i]);
                    break;
                }
            }
        }

        if (foundUpperChar) {
            System.out.println("Không có chuỗi nào trong mảng có ký tự in HOA.");
        }

        System.out.println("_Kết thúc công việc 12_");
    }

    static void option13(String[] array) {              //Kiểm tra có chuỗi nào chứa ký tự c vừa nhập không
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một ký tự bất kỳ: ");
        char kyTu = scanner.next().charAt(0);

        System.out.println("Chuỗi có ký tự vừa nhập: ");
        boolean foundChar = true;
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            for (int j = 0; j < array[i].length(); j++) {
                if (charArray[j] == kyTu) {
                    foundChar = false;
                    int k = i + 1;
                    System.out.println("- Chuỗi thứ " + k + ": " + array[i]);
                    break;
                }
            }
        }

        if (foundChar) {
            System.out.println("Không có chuỗi nào trong mảng có ký tự vừa nhập.");
        }

        System.out.println("_Kết thúc công việc 13_");
    }

    static void option15(String[] array) {       //Nhập và chèn 1 ký tự vào vị trí 5 của chuỗi cuối
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một ký tự bất kỳ: ");
        char kyTu = scanner.next().charAt(0);
        char[] charLastStr = array[array.length - 1].toCharArray();
        char[] newStr = new char[array[array.length - 1].length() + 1];

        System.out.println("Ký tự " + kyTu + " được chèn vào vị trí thứ 5 của chuỗi cuối cùng trong mảng.");
        System.out.println("Chuỗi mới là: ");

        for (int i = 0; i <= array[array.length - 1].length(); i++) {
            if (i < 4) {
                newStr[i] = charLastStr[i];
            } else if (i == 4) {
                newStr[i] = kyTu;
            } else {
                newStr[i] = charLastStr[i - 1];
            }

            System.out.print(String.valueOf(newStr[i]));
        }

        System.out.println("_Kết thúc công việc 15_");
    }

    static void option17(String[] array) {           //Nối tất cả các chuỗi và in ra
        for (int i = 0; i < array.length; i++) {
            array[0] = array[0].concat(array[i]);
        }

        System.out.println("Nối tất cả các chuỗi trong mảng: " + array[0]);
        System.out.println("_Kết thúc công việc 17_");
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
            System.out.println("Chuỗi đầu tiên có bắt đầu bằng chuỗi (hello).");
        } else {
            System.out.println("Chuỗi đầu tiên không bắt đầu bằng chuỗi (hello).");
        }

        System.out.println("_Kết thúc công việc 19_");
    }

    static void option20(String[] array) {
        System.out.println("Giá trị trung bình theo vị trí ký tự trong bảng ASCII của chuỗi trong mảng: ");
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
            System.out.println("- Chuỗi thứ " + j + ": " + sum[i]);
        }

        System.out.println("_Kết thúc công việc 20_");
    }

    static void option21(String[] array) {
        String longest = longestString(array);
        String shortest = shortestString(array);

        boolean check = true;
        System.out.println("Chuỗi có độ dài lớn hơn chuỗi ngắn nhất và nhỏ hơn chuỗi dài nhất trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > shortest.length() && array[i].length() < longest.length()) {
                check = false;
                int j = i + 1;
                System.out.println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }

        if (check) {
            System.out.println("Không có chuỗi nào thỏa mãn.");
        }

        System.out.println("_Kết thúc công việc 21_");
    }

    static void option22(String[] array) {
        Scanner scanner = new Scanner(System.in);
        int value;
        while (true) {
            System.out.print("Nhập một độ dài xác định: ");
            value = scanner.nextInt();
            if (value > 0) {
                break;
            } else {
                System.out.println("Độ dài không hợp lệ. Mời nhập lại.");
            }
        }

        System.out.println("Chuỗi có độ dài bằng độ dài vừa nhập: ");
        boolean check = true;
        int[] stringLength = stringLength(array);
        for (int i = 0; i < array.length; i++) {
            if (stringLength[i] == value) {
                check = false;
                int j = i + 1;
                System.out.println("- Chuỗi thứ " + j + ": " + array[i]);
            }
        }

        if (check) {
            System.out.println("Không có chuỗi nào trong mảng có độ dài bằng độ dài vừa nhập.");
        }


        System.out.println("_Kết thúc công việc 22_");
    }
}



