import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao mot chuoi bat ki");
        chuoi = scanner.nextLine();

        int[] mynum = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);
            for (int j = 0; j < mynum.length; j++) {
//                 if (kyTu == Character.forDigit(mynum[j], 10)){
                char mynameChar = (char) (mynum[j] + '0') ;
                if (kyTu == mynameChar) {
                     System.out.println("ky tu " + kyTu + "co trong mang nynum ");
                }
            }
        }
    }
}
