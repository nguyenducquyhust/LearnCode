import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int dem = 0;

        ArrayList<Character> arrl = new ArrayList<Character>();


        for(int i = 0; i < str.length() ; i++){
            if (arrl.contains(str.charAt(i))){
                for(int j = 0; j<i;j++) {

                    System.out.print(arrl.get(j));
                }
                break;
                }
            else{
                arrl.add(str.charAt(i));


            }
        }



    }
}