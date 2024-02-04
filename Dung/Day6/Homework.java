package day6;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        println("_______________________________");
        println("* BÀI TẬP PHẦN HÀM 02/01/2024 *");
        println("\nCó tổng cộng 8 chương trình.");
        println("Nhập số bất kỳ từ 1 đến 8 để thực hiện chương trình mong muốn.");
        println("Nhập số 9 để kết thúc chương trình.");
        println("_______________________________");

        Scanner scanner = new Scanner(System.in);
        int option;
        while (true) {
            print("\nNhập lựa chọn: ");
            option = scanner.nextInt();
            if (option > 0 && option < 9) {
                switch (option) {
                    case 1:
                        option1();
                        break;
                    case 2:
                        option2();
                        break;
                    case 3:
                        option3();
                        break;
                    case 4:
                        option4();
                        break;
                    case 5:
                        option5();
                        break;
                    case 6:
                        option6();
                        break;
                    case 7:
                        option7();
                        break;
                    case 8:
                        option8();
                        break;
                    default:
                        break;
                }
            } else if (option == 9) {
                System.exit(0);
                break;
            } else {
                println("Lựa chọn không hợp lệ. Hãy nhập lại.");
            }
        }
    }

    static void print(String string) {
        System.out.print(string);
    }

    static void println(String string) {
        System.out.println(string);
    }

    static int soPhanTu() {
        Scanner scanner = new Scanner(System.in);
        int soPhanTu;
        while (true) {
            print("Nhập số phần tử trong mảng: ");
            soPhanTu = scanner.nextInt();

            if (soPhanTu > 0) {
                break;
            } else {
                println("Không thỏa mãn. Hãy nhập lại.");
            }
        }
        return soPhanTu;
    }

    static int[] nhapTungPhanTu(int soPhanTu) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++) {
            int j = i + 1;
            print("- Nhập phần tử thứ " + j + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static void sapXepTangDan(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {         //Sắp xếp các phần tử trong mảng tăng dần
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int center = array[i];
                    array[i] = array[j];
                    array[j] = center;
                }
            }
        }

        for (int j : array) {
            print(j + " ");
        }
    }

    static void option1() {
        println("\n* CHƯƠNG TRÌNH 1 *");
        println("_Chương trình sẽ đếm số từ trong một chuỗi được nhập_");
        print("\nNhập một chuỗi: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int wordCount = 0;
        boolean foundWhiteSpace = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ' && string.charAt(i) != '\t' && string.charAt(i) != '\n') {
                if (foundWhiteSpace) {
                    wordCount++;
                    foundWhiteSpace = false;
                }
            } else {
                foundWhiteSpace = true;
            }
        }

        println("Số từ trong chuỗi vừa nhập là: " + wordCount);
        println("_Kết thúc chương trình 1_");
    }

    static void option2() {
        println("\n* CHƯƠNG TRÌNH 2 *");
        println("_Chương trình sẽ kiểm tra xem chuỗi s1 chứa chuỗi s2 không_");

        Scanner scanner = new Scanner(System.in);
        print("\nNhập chuỗi s1: ");
        String s1 = scanner.nextLine();
        print("Nhập chuỗi s2: ");
        String s2 = scanner.nextLine();

        if (s1.contains(s2)) {
            println("Chuỗi s1 CÓ chứa chuỗi s2.");
        } else {
            println("Chuỗi s1 KHÔNG chứa chuỗi s2.");
        }

        println("_Kết thúc chương trình 2_");
    }

    static void option3() {
        println("\n* CHƯƠNG TRÌNH 3 *");
        println("_Chương trình sẽ liệt kê n số nguyên tố đầu tiên_");

        int n;
        while (true) {
            print("\nNhập số nguyên dương n: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            if (n > 0) {
                break;
            } else {
                println("Không thỏa mãn. Hãy nhập lại.");
            }
        }

//        int[] primeNum = new int[n];
//        primeNum[0] = 2;
//        print(n + " số nguyên tố đầu tiên là: " + primeNum[0] + " ");
//        for (int i = 1; i < n; i++) {
//            primeNum[i] = primeNum[i - 1] + 1;
//            boolean foundPrimeNum = true;
//            while (true) {
//                for (int j = 2; j < primeNum[i]; j++) {
//                    if (primeNum[i] % j == 0) {
//                        foundPrimeNum = false;
//                        break;
//                    }
//                }
//
//                if (foundPrimeNum) {
//                    print(primeNum[i] + " ");
//                    break;
//                } else {
//                    primeNum[i]++;
//                    foundPrimeNum = true;
//                }
//            }
//        }

        int countPrime = 1;                //đếm số nguyên tố
        int j = 2;                         //SNT đầu tiên bắt đầu từ số 2
        print(n + " số nguyên tố đầu tiên là: ");
        while (countPrime <= n) {          //vòng lặp kết thúc khi in đủ n số nguyên tố
            boolean foundPrimeNum = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    foundPrimeNum = false;
                    break;
                }
            }

            if (foundPrimeNum) {
                print(j + " ");
                countPrime++;
            }
            j++;
        }

        println("_Kết thúc chương trình 3_");
    }

    static void option4() {
        println("\n* CHƯƠNG TRÌNH 4 *");
        println("_Chương trình sẽ liệt kê các số nguyên tố nhỏ hơn n_");

        int n;
        while (true) {
            print("\nNhập số nguyên dương n: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            if (n > 0) {
                break;
            } else {
                println("Không thỏa mãn. Hãy nhập lại.");
            }
        }

        int j = 2;                         //SNT đầu tiên bắt đầu từ số 2
        print("Các số nguyên tố nhỏ hơn " + n + " là: ");
        while (j < n) {
            boolean foundPrimeNum = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    foundPrimeNum = false;
                    break;
                }
            }

            if (foundPrimeNum) {
                print(j + " ");
            }
            j++;
        }

        println("_Kết thúc chương trình 4_");
    }

    static void option5() {
        println("\n* CHƯƠNG TRÌNH 5 *");
        Scanner scanner = new Scanner(System.in);

        int soPhanTu = soPhanTu();
        int[] array = nhapTungPhanTu(soPhanTu);

        print("Thứ tự phần tử tăng dần trong mảng: ");
        sapXepTangDan(array);

        print("\nNhập phần tử k: ");
        int k = scanner.nextInt();

        print("Mảng mới là: ");
        boolean check = true;
        for (int j : array) {
            if (check && (j > k)) {
                print(k + " ");
                check = false;
            }

            print(j + " ");
        }

        println("\n_Kết thúc chương trình 5_");
    }

    static void option6() {
        println("\n* CHƯƠNG TRÌNH 6 *");

        println("_Nhập số liệu cho mảng A_");
        int soPhanTuA = soPhanTu();
        int[] arrayA = nhapTungPhanTu(soPhanTuA);
        print("Thứ tự phần tử tăng dần trong mảng A: ");
        sapXepTangDan(arrayA);
        println("\n_Nhập xong số liệu mảng A_");

        println("\n_Nhập số liệu cho mảng B_");
        int soPhanTuB = soPhanTu();
        int[] arrayB = nhapTungPhanTu(soPhanTuB);
        print("Thứ tự phần tử tăng dần trong mảng B: ");
        sapXepTangDan(arrayB);
        println("\n_Nhập xong số liệu mảng B_");

        print("\nThứ tự phần tử tăng dần trong mảng mới: ");
        int aIndex = 0;
        int bIndex = 0;
        int[] arrayC = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (aIndex < arrayA.length && bIndex < arrayB.length) {
                if (arrayA[aIndex] < arrayB[bIndex]) {
                    arrayC[i] = arrayA[aIndex++];
                } else {
                    arrayC[i] = arrayB[bIndex++];
                }
            } else if (aIndex == arrayA.length) {
                arrayC[i] = arrayB[bIndex];
            } else if (bIndex == arrayB.length) {
                arrayC[i] = arrayA[aIndex];
            }

            print(arrayC[i] + " ");
        }

        println("\n_Kết thúc chương trình 6_");
    }

    static void option7() {
        println("\n* CHƯƠNG TRÌNH 7 *");
        println("_Nhập vào mã số sinh viên_");
        println("Yêu cầu định dạng: Bxxxxxxx (x là số nguyên là 1 đến 9)");

        Scanner scanner = new Scanner(System.in);
        print("\nNhập mã số sinh viên: ");
        String string = scanner.nextLine();
        boolean match = string.matches("\\s*B[1-9]{7}\\s*");

        if (match) {
            println("Mã số ĐÚNG với định dạng.");
        } else {
            println("Mã số KHÔNG ĐÚNG với định dạng.");
        }

        println("\n_Kết thúc chương trình 7_");
    }

    static void option8() {
        println("\n* CHƯƠNG TRÌNH 8 *");
        println("_Nhập một chuỗi_");
        println("Yêu cầu về chuỗi:");
        println("- Độ dài không quá 20 ký tự.");
        println("- Bắt đầu bằng một ký tự chữ viết hoa.");
        println("- Kết thúc bằng một số.");
        println("- Không chứa ký tự khoảng trắng.");

        Scanner scanner = new Scanner(System.in);
        print("\nNhập vào chuỗi: ");
        String string = scanner.nextLine();
        boolean match = string.matches("^[A-Z]\\S{0,18}\\d$");

        if (match) {
            print("Duyệt!");
        } else {
            print("Không duyệt");
        }

        println("\n_Kết thúc chương trình 8_");
    }
}
