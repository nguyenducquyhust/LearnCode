//In ra các số từ 1 đến 100 mà chia hết cho 2
public class ex2 {
    public static void main(String[] args) {


        int i;
        for ( i = 1; i <= 100; i++ )
        {
            if ( i %2 ==0 ){
                System.out.println(i);
            }
        }
    }
}