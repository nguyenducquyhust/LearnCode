import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        String chain; //chuoi
        char characters = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string : ");
        chain = scanner.nextLine();

        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == characters) { //charat(i) đẻ trả về thứ tự thứ i của chuỗi i = 0 thì là T (Trâm Anh )
                count++; // là biến đếm
            }
        }
        System.out.println("number of times the character appears : " + characters + " in chain " + chain + " = " + count);

    }

}

