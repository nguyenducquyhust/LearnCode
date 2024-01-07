import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

//        String s1 = "Ah Hoa! Ah Dao. Hien ah, Thao My";
//        String replaceString = s1.replaceAll("(?i)ah" , "Anh");// (?i) does not need to be case sensitive(chữ hoa hoặc chữ thường) but must use replaceALl
//        System.out.println(replaceString);

//        String s2 = "Hôm nay trời đẹp lắm";
        Scanner scanner = new Scanner(System.in);
        String massage;
        System.out.println("Nhập chuỗi cần thay đổi chữ in hoa đầu : ");
        massage = scanner.nextLine();
//        char [] charArray = massage.toCharArray();
//
//        for (int i ; i < charArray.length ; i++ ) {
        String[] words = massage.split("\\s");

        StringBuilder result = new StringBuilder();

        for (String word : words ) {
            if (!word.isEmpty()) {
                result.append(word.substring(0,1).toUpperCase()).append(word.substring(1)).append(" ");
            }
            System.out.println(result.toString().trim());




    }



    }
}
