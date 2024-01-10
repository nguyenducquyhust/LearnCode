public class ex2 {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 2 from 1 to 100 are: ");
        int i;
        for (i = 0; i <= 100; i++) {
            // nếu i không chia hết cho 2 thì quay lại vòng lặp for
            // %: giá trị trả về sẽ là phần dư của phép chia 2
            // !=: so sánh phần dư đó với 0
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}