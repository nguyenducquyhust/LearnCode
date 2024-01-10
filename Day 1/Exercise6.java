import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {


        int count = 0;
        String chain;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any list : ");
        chain =scanner.nextLine();

        for ( int i = 0; i < chain.length(); i++ ) {
            char ch = chain.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') // nếu cho dấu chấm phâỷ ở đây thì đoạn code này nó sẽ bỏ luôn phần if
            {
                count++;
            }
        }
        System.out.println(" number of consonants: " + count ); //số phụ âm
    }
}