import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String chain = scanner.nextLine();

        String newchain = ""; // khai bao chuoi newchain
        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) != ' ') { // vi tri ki tu
                newchain += chain.charAt(i);
            }
        }
        System.out.println("Chuoi sau khi bo khoang trang: " +newchain);
    }
}
