public class Excercise3 {
    //SOLUTION 1
//    public static void main(String[] args) {
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//            if (i == 4) {
//                break; // khi i == 4 out khỏi vòng loop
//            }
//        }
//
//    }
    //SOLUTION 2
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue; //continue = skip / khi i%2 dư thì skip không in ra
            }
            System.out.println(i);
        }
    }
    }


