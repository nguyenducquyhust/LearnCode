
import java.util.Scanner;

public class Bai1Method {
    public static float[] nhapLieu(){
        Scanner sc = new Scanner(System.in);
        float[] input = new float[2];
        input[0] = sc.nextFloat();
        input[1] = sc.nextFloat();
        return input;
    }
    public static float tinhHieu(float a, float b){
        return a - b;
    }
    public static float tinhChia(float a, float b){
        return a/b;
    }
    public static float UocChungLonNhat (float a, float b){
        if (b == 0 || a == 0){
            return a + b;

        }
        while(a != b){
            if (a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
    float[] input = new float[2];
    input = nhapLieu();
    float number1 = input[0];
    float number2   = input[1];
    System.out.print(UocChungLonNhat(number1,number2));


    }
}