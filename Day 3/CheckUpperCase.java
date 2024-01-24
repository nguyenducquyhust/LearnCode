import java.util.Scanner;

public class CheckUpperCase {
    public static void main(String[] args) {
        char kyTu;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhap 1 chuoi : ");
        String chuoi = scanner.nextLine();

        boolean coInHoa = false;
        for (int i = 0; i <= chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);
//phuong thuc isUpperCase kiem tra xem trong char co viet hoa hay khong
            if (Character.isUpperCase(kyTu)) {
                coInHoa = true;
                break;

            }
        }
            if (coInHoa) {
                System.out.println("Chuoi co chua ky tu in hoa");
            } else {
                System.out.println("chuoi khong co ky tu in hoa");
            }
        }
    }
