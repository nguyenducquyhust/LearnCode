public class Ex3 {
    public static void main(String[] args) {
        System.out.println("So chan tu 1 - 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
