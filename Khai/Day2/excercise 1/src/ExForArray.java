import java.util.Scanner;
public class ExForArray {
    public static void main(String[] args) {
        int num, sum = 0;
        // nhập liệu
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input some number ");
        num = keyboard.nextInt();

        //for cải tiến / type ( var : array)/ array lặp theo mảng giá trịmififnh chọn
        int arr[] = { 11, 22, 33, 44 };
        for(int i : arr)
        {
            // sum = sum + i
            sum += i;
        }
        // in kết quar
        System.out.println("Sum of number from 1 to " + num + " is " +sum);
        System.out.println("KyKhai");
    }
}
