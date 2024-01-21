import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi: ");
        String chain = scanner.nextLine();
        char characters;
        System.out.print("Nhap vao 1 ki tu: ");
        characters = scanner.next().charAt(0);
        System.out.println("Ket qua kiem tra ki tu co trong chuoi hay khong: ");
        if (chain.contains(String.valueOf(characters))){ // kiem tra xem chuoi co ki tu do khong
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}