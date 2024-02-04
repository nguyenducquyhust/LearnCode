package Day5;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        // Nhập số thứ nhất, số thứ hai
        System.out.print("Nhap so thu nhat:");
        float number1 = nhapLieu();
        System.out.print("Nhap so thu hai:");
        float number2 = nhapLieu();

        // Tìm hiệu hai số
        float hieuHaiSo = hieuHaiSo(number1,number2);
        System.out.print("Hieu hai so là:" + hieuHaiSo);

        // Tìm thương hai số
        float thuongHaiSo = thuongHaiSo(number1,number2);
        System.out.print("Thuong hai so là:" + thuongHaiSo);

        // Tìm ước chung lớn nhất hai số
        int kiemTraNumber1 = kiemTraSo(number1);
        int kiemTraNumber2 = kiemTraSo(number2);
        int uocChungLonNhat = uocChungLonNhat(number1,number2);
        if (number1 ==1 && number2 ==1){
            System.out.print("Uoc chung lon nhat la:" + uocChungLonNhat(number1,number2));
        }else {
            System.out.print("Khong co uoc chung nho nhat:");
        }
    }
    // Hàm nhập liệu
    static float nhapLieu(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
    // Hàm tính hiệu
    static float hieuHaiSo(float a,float b){
        return a - b;
    }
    // Hàm tính thương
    static float thuongHaiSo(float a,float b){
      float thuongHaiSo = 0;
      if (b != 0){
          thuongHaiSo = a/b;
      }else {
          System.out.print("Khong co phep chia");
          return thuongHaiSo;
      }
    }
    // Hàm kiểm tra kiểu dữ liệu hai số
    static int kiemTraSo(float number){
        int kiemTraSo = 1;
        if (Math.ceil(number) != Math.floor(number)){
            kiemTraSo = 0;
        }
        return kiemTraSo;
    }
    // Hàm tìm ước chung lớn nhất
    static float uocChungLonNhat(float number1,float number2){
        int uocChungLonNhat = 1;
        if (number1 ==0 || number2 ==0){
            System.out.print("khong co uoc chung lon nhat");
        }else {
            for (int i = 1; i <= Math.abs(number1) && i <= Math.abs(number2);i++){
                if (number1 % i ==0 && number2 % i == 0){
                    uocChungLonNhat = i;
                }
            }
        }
        return uocChungLonNhat;
    }
}
