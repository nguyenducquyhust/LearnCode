public class Main {
    public static void main(String[] args) {
       int sum = 0;
       int a = 1;
       /*for(int i = 0; i <= 1000;i++){
           sum += i;
       }


        while(a <= 1000){
            sum+= a;
            a++;
        }

        */
         do {
             sum += a;
             a++;
         } while (a <= 1000);

    }
}