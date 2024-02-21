import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Nhập một chuỗi: ");
        int countwords = countword();
        System.out.println("so từ là: " + countwords);

    }
    static int countword(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean khoangTrang = true;
        int soTu = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n'){
                    if (khoangTrang){
                        soTu++;
                        khoangTrang = false;
                    }

            }else {
                khoangTrang = true;
            }
        }
        return soTu;
    }
}