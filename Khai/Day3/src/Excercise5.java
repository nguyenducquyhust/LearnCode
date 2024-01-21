import java.util.Scanner;
public class Excercise5 {
    public static void main(String[] args) {
        //keyboard
        Scanner scanner = new Scanner(System.in);

        //input chuoi
        System.out.println("Nhập chuỗi bất kỳ: ");
        String str = scanner.nextLine();

        //input tu can tim
        System.out.println("Nhập từ cần tìm: ");
        String word = scanner.next(); //next # nextLine :next là ko cùng hàng; nextLine là thành chuỗi cùng hàng

        //Find
        boolean hasWord = str.contains(word);
        if (hasWord = true) {
            System.out.println("Chuỗi có chứa từ " + word);
        } else {
            System.out.println("Chuỗi không chứa từ " + word);
        }
    }
}
