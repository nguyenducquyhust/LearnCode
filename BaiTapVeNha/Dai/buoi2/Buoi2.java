package buoi2;

import java.util.Arrays;
import java.util.Scanner;

public class Buoi2 {
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
            System.out.println("5. thoát");
            do {
                System.out.println("nhập lựa chọn của bạn");
                option = scanner.nextInt();
            } while (option < 1 && option > 4);

            switch (option) {
                case 1:
                    int sumFor = 0;
                    for (int i = 1; i <= 1000; i++) {
                        sumFor += i;
                    }

                    int sumWhile = 0;
                    int soLanThucHien1 = 1;
                    while (soLanThucHien1 <= 1000) {
                        sumWhile += soLanThucHien1;
                        soLanThucHien1++;
                    }

                    int sumDoWhile = 0;
                    int soLanThucHien2 = 1;
                    do {
                        sumDoWhile += soLanThucHien2;
                        soLanThucHien2++;
                    } while (soLanThucHien2 <= 1000);

                    System.out.println("Tổng của các số nguyên từ 1-1000 bằng vòng lặp for là: " + sumFor);
                    System.out.println("Tổng của các số nguyên từ 1-1000 bằng vòng lặp while là: " + sumWhile);
                    System.out.println("Tổng của các số nguyên từ 1-1000 bằng vòng lặp do while là: " + sumDoWhile);
                    break;
                case 2:
                    System.out.println("các số chia hết cho 2 từ 1 đến 100 là:");
                    for (int i = 1; i <= 100; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;

                case 3:
                    int soLanNhap1;
                    System.out.println("bạn muốn nhập bao nhiêu số:");
                    soLanNhap1 = scanner.nextInt();
                    System.out.println("xin mời bạn nhập: ");
                    if (soLanNhap1 > 0) {
                        int[] intArray1 = new int[soLanNhap1];
                        for (int i = 0; i < intArray1.length; i++) {
                            intArray1[i] = scanner.nextInt();
                        }
                        System.out.println("số đầu tiên bạn nhập là số: " + intArray1[0]);
                        System.out.println("số gần cuối bạn nhập là số: " + intArray1[soLanNhap1 - 2]);
                    } else {
                        System.out.println("nhập sai cú pháp");
                    }
                    break;
                case 4:
                    int soLanNhap2;
                    System.out.println("bạn muốn nhập bao nhiêu số:");
                    soLanNhap2 = scanner.nextInt();
                    System.out.println("xin mời bạn nhập: ");
                    if (soLanNhap2 > 0) {
                        //tạo mảng
                        int[] intArray2 = new int[soLanNhap2];
                        for (int i = 0; i < intArray2.length; i++) {
                            intArray2[i] = scanner.nextInt();
                        }


                        // in ra giá trị của bảng
                        System.out.println("các số bạn đã nhập là : ");
                        for (int i = 0; i < intArray2.length; i++) {
                            System.out.println("Phần tử thứ " + i + " là : " + intArray2[i]);
                        }

                        // Đếm phần tử trùng lặp
                        int soPhanTuLap = 0;
                        System.out.println("những phần tử bị trùng lặp là: ");
                        for (int i = 0; i < intArray2.length; i++) {
                            for (int j = i + 1; j < intArray2.length; j++) {
                                if (intArray2[i] == intArray2[j]) {
                                    soPhanTuLap += 1;
                                    System.out.println(intArray2[j]);
                                }
                            }
                        }
                        System.out.println("vậy có " + soPhanTuLap + " phần tử bị trùng lặp");

                        // Tìm Max và Min
                        System.out.println("phần tử lớn nhất trong mảng đã nhập là: " + Arrays.stream(intArray2).max().getAsInt());
                        System.out.println("phần tử nhỏ nhất trong mảng đã nhập là: " + Arrays.stream(intArray2).min().getAsInt());

                        //tạo mảng mới
                        int[] arrayWithoutDuplicates = new int[intArray2.length];
                        int previous = intArray2[0];
                        arrayWithoutDuplicates[0] = previous;
                        int uniqueCount = 1;

                        // Duyệt qua mảng để xây dựng mảng mới chỉ chứa các phần tử không trùng lặp
                        for (int i = 1; i < intArray2.length; i++) {
                            int current = intArray2[i];
                            if (current != previous) {
                                arrayWithoutDuplicates[uniqueCount] = current;
                                uniqueCount++;
                            }
                            previous = current;
                        }

                        // Chuyển mảng mới về kích thước chính xác (không chứa phần tử trống)
                        arrayWithoutDuplicates = Arrays.copyOf(arrayWithoutDuplicates, uniqueCount);

                        // Ti các số nguyên tố trong mảng
                        System.out.println("các số nguyên tố có trong mảng là:");
                        for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
                            if (arrayWithoutDuplicates[i] >= 2) {
                                for (int j = 2; j < arrayWithoutDuplicates[i]; j++) {
                                    if (arrayWithoutDuplicates[i] % j == 0) {
                                        break;
                                    } else {
                                        System.out.println(arrayWithoutDuplicates[i]);
                                        break;
                                    }
                                }
                            }
                        }

                        // tính trung bình cộng
                        double tbCong = (Arrays.stream(intArray2).sum() / soLanNhap2);
                        System.out.println("trung bình cộng của mảng là: " + tbCong);

                        //tính tổng các số trong mảng
                        System.out.println("tổng các số trong mảng là: " + Arrays.stream(intArray2).sum());

                        //tìm phần tử xuất hiện nhiều nhất
                        int[] sOlanXuatHien = new int[intArray2.length];
                        for (int i = 0; i < intArray2.length; i++) {
                            for (int j = 0; j <= i; j++) {
                                if (intArray2[i] == intArray2[j]) {
                                    sOlanXuatHien[j]++;
                                }
                            }
                        }
                        int suatHienNhieuNhat = sOlanXuatHien[0];
                        for (int i = 1; i < intArray2.length; i++) {
                            if (sOlanXuatHien[i] > suatHienNhieuNhat) {
                                suatHienNhieuNhat = sOlanXuatHien[i];
                            }
                        }
                        for (int i = 0; i < intArray2.length; i++) {
                            if (sOlanXuatHien[i] == suatHienNhieuNhat) {
                                System.out.println("phần tử " + intArray2[i] + " xuất hiện nhiều nhất với số lần xuất hiện là: " + suatHienNhieuNhat);
                            }
                        }

                        //đảo ngược các phần tử trong mảng
                        int[] daoNguoc = new int[soLanNhap2];
                        for (int i = 0; i < daoNguoc.length; i++) {
                            int a = daoNguoc.length - i - 1;
                            daoNguoc[i] = intArray2[a];
                        }
                        System.out.println("Mảng sau khi bị đảo ngược là: ");
                        for (int i = 0; i < daoNguoc.length; i++) {
                            System.out.print(daoNguoc[i] + "");
                        }
                        System.out.println("");

                        //sắp xếp mảng theo thứ tự tăng dần
                        Arrays.sort(intArray2);
                        System.out.println("Mảng sau khi xắp xếp theo thứ tự tăng dần: ");
                        for (int i = 0; i < intArray2.length; i++) {
                            System.out.print(intArray2[i] + "");
                        }
                        System.out.println("");

                    } else {
                        System.out.println("nhập sai cú pháp");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);
    }
}