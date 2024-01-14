package day2;

//tong cac so nguyen tu 1 den 1000: do - while
public class Exercise1_3 {
    public static void main(String[] args) {

        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 1000);

        System.out.println("Tong cac so nguyen tu 1 den 1000 la: " + sum);
    }
}
