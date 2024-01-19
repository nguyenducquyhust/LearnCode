package day4; //In nhung so chan tu 1 den 100 su dung continue

public class Exercise3 {
    public static void main(String[] args) {

        System.out.print("Nhung so chan tu 1 den 100 la: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
