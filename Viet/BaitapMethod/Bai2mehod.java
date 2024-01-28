import java.util.Scanner;

public class Bai2mehod {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean check = false;
        float a = 0;
        float b = 0;
        float c = 0;
        while (true) {
            System.out.println("----------------------");
            System.out.println("1 nhap vao he so a,b,c");
            System.out.println("2 xac dinh nhiem");
            System.out.println("3 thoat khoi chuong trinh");
            System.out.println("----------------------");
            choice = sc.nextInt();
            if (choice == 3) {
                System.out.println("ket thuc chuong trinh");
                break;
            }
             else if (choice == 1) {
                check = true;
                System.out.print("nhap vao 3 co so a,b,c");
                a = sc.nextFloat();
                b = sc.nextFloat();
                c = sc.nextFloat();
                System.out.print("----da nhap ----");
            }
            else if (choice == 2) {
                if (check) {
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        System.out.print("vo nhiem");
                    } else if (delta == 0) {
                        float value = -b / 2 * a;
                        System.out.println("phuong trinh co nghiem kep la " + value);
                    } else {
                        double value1 = (-b + Math.sqrt(delta)) / 2 * a;
                        double value2 = (-b - Math.sqrt(delta)) / 2 * a;
                        System.out.println("nghiem thu nhat cua phuong trinh la " + value1);
                        System.out.println("nghiem thu hai cua phuong trinh la " + value2);
                    }
                } else {
                    System.out.print("ban can nhap du liêu vao trc da");
                }
            } else {
                System.out.println("xin hay nhap so tu 1 toi 3");
            }

        }
        }
    }

