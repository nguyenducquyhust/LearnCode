import java.util.Scanner;

public class Ex2 {
    public static int n;
    public static int a;
    public static int b;
    public static int c;

    public static float n1;
    public static float n2;
    public static float n3;
    public static void main(String[] args) {
        // Hiển thị menu
        System.out.println("nhập thao tác bằng cách chọn số:");
        System.out.println("1. Nhập 3 hệ số a,b,c");
        System.out.println("2. Tính nghiệm của phương trình bậc 2 có dạng ax2 + bx + c");
        System.out.println("3. Thoát");

        //bàn phím
        Scanner sc = new Scanner(System.in);


        // while vòng lặp baast baast tận nếu không có break, khi break sẽ chuyển sang switch
        while (true){
            try {
                n = sc.nextInt();
                if (n == 1){
                    break;
                } else if (n == 2) {
                    System.out.println("Vui lòng nhập phần tử trước");
                    break;
                } else if (n == 3) {
                    break;
                } else {
                    System.out.println("Vui lòng nhập lại");
                }
            }catch (Exception e){
                System.out.println("Lỗi nhập liệu! Chỉ nhập số nguyên từ 1 - 3");
                sc.nextLine(); //???
            }
        }
        // không có break sẽ chạy liên tuc từ case 1 sang case 3
        switch (n){
            case 1:
                nhapLieu();
                tinhNghiem(a,b,c);
                thoatChuongTrinh();
                break;
            case 2:
                nhapLieu();
                tinhNghiem(a,b,c);
            case 3:
                thoatChuongTrinh();
                break;
        }

    }
    public static void tinhNghiem(int a, int b, int c){
        //tinh delta
        int delta = b * b - 4 * a * c;

        //2 nghiem phan biet
        if (delta > 0){
            n1 =  ((float)-b +(float) Math.sqrt(delta)) / (2 * (float)a);
            n2 =  ((float)-b -(float) Math.sqrt(delta)) / (2 * (float)a);
            System.out.println("Phương trình bậc 2 có 2 nghiệm là: ");
            System.out.println(n1 + " và " + n2);
        }

        // phuong trinh có một nghiem kep
        else if (delta == 0) {
            n3 = (float)-b / 2 * (float) a;
            System.out.println("Phương trình có một nghiệm kép là: " + n3);
        }
        // Phương trình vô nghiệm
        else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
    public static void nhapLieu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử a: ");
        a = scanner.nextInt();
        System.out.println("nhập phần tử b: ");
        b = scanner.nextInt();
        System.out.println("nhập phần tử c: ");
        c = scanner.nextInt();
    }
    public static void thoatChuongTrinh(){
        System.out.println("Thoát chương trình");
        System.exit(0); //0 thoát bình thường  // 1. báo cáo chương trình đã gawjp lỗi
    }
}
