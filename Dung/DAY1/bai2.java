//Nhap 1 so n tu ban phim, neu n<1 thi in ra n<1, n>1 va n<3 thi in ra "java", n>4 va n<6 thi in ra "python"
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = console.nextInt();
        if (n<1){
            System.out.println("n<1");
        }
        else if (n>1 & n<3){
            System.out.println("java");
        }
        else if (n>4 & n<6){
            System.out.println("python");
        }
        else{
            System.out.println("nhap lai n");
        }
    }
}
