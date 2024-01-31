import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[50];
        int count = 0;

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Nhập N và mảng a gồm N chuỗi");
            System.out.println("2. Tìm chuỗi có kích thước nhỏ nhất, lớn nhất");
            System.out.println("3. Tính kích thước trung bình của các chuỗi");
            System.out.println("4. Hiển thị những chuỗi có kích thước lớn hơn kích thước trung bình");
            System.out.println("5. Sắp xếp các chuỗi tăng dần, giảm dần theo kích thước");
            System.out.println("6. Tìm những chuỗi nhỏ nhất, lớn nhất theo thứ tự ký tự trong bảng mã ASCII");
            System.out.println("0. Thoát");
            System.out.print("Chọn công việc (0-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Nhập số lượng chuỗi N (0<N<=50): ");
                    int N = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng trống
                    for (int i = 0; i < N; i++) {
                        System.out.print("Nhập chuỗi thứ " + (i + 1) + ": ");
                        strings[count++] = scanner.nextLine();
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có chuỗi nào được nhập.");
                    } else {
                        String smallest = findSmallest(strings, count);
                        String largest = findLargest(strings, count);
                        System.out.println("Chuỗi có kích thước nhỏ nhất: " + smallest);
                        System.out.println("Chuỗi có kích thước lớn nhất: " + largest);
                    }
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("Chưa có chuỗi nào được nhập.");
                    } else {
                        double averageLength = calculateAverageLength(strings, count);
                        System.out.println("Kích thước trung bình của các chuỗi: " + averageLength);
                    }
                    break;
                case 4:
                    if (count == 0) {
                        System.out.println("Chưa có chuỗi nào được nhập.");
                    } else {
                        double averageLength = calculateAverageLength(strings, count);
                        System.out.println("Những chuỗi có kích thước lớn hơn kích thước trung bình:");
                        for (int i = 0; i < count; i++) {
                            if (strings[i].length() > averageLength) {
                                System.out.println(strings[i]);
                            }
                        }
                    }
                    break;
                case 5:
                    if (count == 0) {
                        System.out.println("Chưa có chuỗi nào được nhập.");
                    } else {
                        sortStringsByLength(strings, count);
                        System.out.println("Danh sách chuỗi sau khi sắp xếp tăng dần:");
                        for (int i = 0; i < count; i++) {
                            System.out.println(strings[i]);
                        }
                    }
                    break;
                case 6:
                    if (count == 0) {
                        System.out.println("Chưa có chuỗi nào được nhập.");
                    } else {
                        String smallest = findSmallestAscii(strings, count);
                        String largest = findLargestAscii(strings, count);
                        System.out.println("Chuỗi nhỏ nhất theo thứ tự ASCII: " + smallest);
                        System.out.println("Chuỗi lớn nhất theo thứ tự ASCII: " + largest);
                    }
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static String findLargestAscii(String[] strings, int count) {
        String largest = strings[0];
        for (int i = 1; i < count; i++) {
            if (compareAscii(strings[i], largest) > 0) {
                largest = strings[i];
            }
        }
        return largest;
    }

    private static String findSmallestAscii(String[] strings, int count) {
        String smallest = strings[0];
        for (int i = 1; i < count; i++) {
            if (compareAscii(strings[i], smallest) < 0) {
                smallest = strings[i];
            }
        }
        return smallest;
    }

    private static int compareAscii(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }

    private static void sortStringsByLength(String[] strings, int count) {
        Arrays.sort(strings, 0, count, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    private static double calculateAverageLength(String[] strings, int count) {
        int totalLength = 0;
        for (int i = 0; i < count; i++) {
            totalLength += strings[i].length();
        }
        return (double) totalLength / count;
    }

    private static String findLargest(String[] strings, int count) {
        String largest = strings[0];
        for (int i = 1; i < count; i++) {
            if (strings[i].length() > largest.length()) {
                largest = strings[i];
            }
        }
        return largest;
    }

    private static String findSmallest(String[] strings, int count) {
        String smallest = strings[0];
        for (int i = 1; i < count; i++) {
            if (strings[i].length() < smallest.length()) {
                smallest = strings[i];
            }
        }
        return smallest;
    }
}
