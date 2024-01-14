package day2;

//tong cac so nguyen tu 1 den 1000: while
public class Exercise1_2 {
    public static void main(String[] args) {

        int i = 1, sum = 0;
        while (i <= 1000) {
            sum += i;
            i++;
        }

        System.out.println("Tong cac so nguyen tu 1 den 1000 la: " + sum);
    }
}
