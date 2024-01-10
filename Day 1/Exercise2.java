import java.util.Scanner;



public class Exercise2 {
    public static void main(String[] args) {
        //int a = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = scanner.nextInt();

        if (a < 1 ) {
            System.out.println("a < 1");
        } else if (a > 1 && a < 3) {
            System.out.println("Java");
        } else if (a > 4 && a < 5 ) {
            System.out.println("Python");
        }

    }

}
