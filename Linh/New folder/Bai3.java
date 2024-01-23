package Day4;//In ra những số chẵn từ 1 - 100 sử dụng continue

public class Bai3 {
    public static void main(String[] args) {
        System.out.println(" so chan tu 1 den 100:");
        for (int i = 1; i <= 100; i++) {
            if ( i % 2 ==1) {
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
