import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Boolean test = false;
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       char[] con_ga = str.toCharArray();
       for (Character word : con_ga){
           if(word >= 'A' && word <= 'Z'){
               test = true;
           }

       }
       if(test){
           System.out.print("yes");
       }
       else{
           System.out.print("no");
       }

    }
}