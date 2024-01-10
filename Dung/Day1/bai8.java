import java.util.Scanner;
public class bai8 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int a = console.nextInt();
        System.out.print("Nhap thang: ");
        int b = console.nextInt();
        System.out.print("Nhap nam: ");
        int c = console.nextInt();
        if (b == 1 | b == 3 | b == 5 | b == 7 | b == 8 | b == 10){
            if (a == 31){
                a = 1;
                b++;
            }
            else if (a >= 1 & a <= 30){
                a++;
            }
        }
        if (b == 4 | b == 6 | b == 9 | b == 11){
            if (a == 30){
                a = 1;
                b++;
            }
            else if (a >= 1 & a <= 29){
                a++;
            }
        }
        if (b == 12){
            if (a == 31){
                a = 1;
                b = 1;
                c++;
            }
            else if (a >=1 & a<= 30){
                a++;
            }
        }
        if (b == 2){
            if (c % 4 == 0){
                if (a == 29){
                    a = 1;
                    b++;
                }
                else if (a >= 1 & a <= 28){
                    a++;
                }
            }
            else {
                if (a == 28){
                    a = 1;
                    b++;
                }
                else if (a >= 1 & a <= 27){
                    a++;
                }
            }
        }
        String nextday = "ngay tiep theo la: " + a + "/" + b + "/" + c;
        System.out.println(nextday);

    }
}
