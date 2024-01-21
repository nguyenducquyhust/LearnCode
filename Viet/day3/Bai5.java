
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Boolean check = false;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char tu = sc.nextLine().charAt(0);
        char [] test = str.toCharArray();

        for (Character word : test){
            if(word == tu){
                check = true;
                break;
            }
        }

        if (check){
            System.out.print("yes");
        }else{
      }System.out.print("no");

    }
}