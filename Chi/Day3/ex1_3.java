public class ex1_3 {
    public static void main(String[] args) {
        int i = 0;
        long sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 1000);
        System.out.println("RESULT = " + sum);
    }
}
