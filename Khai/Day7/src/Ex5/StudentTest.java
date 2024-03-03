package Ex5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while (true) {
            int choice = showMenu();
            switch (choice) {
                case 1:
                    valid = true;
                    inputStudents(scanner);
                    break;
                case 2:
                    displayAllStudents(new ArrayList<>());
                    break;
//                case 3:
//                    showHighestAndLowestGPA();
//                    break;
//                case 4:
//                    findStudentByCode(scanner);
//                    break;
//                case 5:
//                    displayStudentsByName();
//                    break;
//                case 6:
//                    displayScholarshipStudents();
//                    break;
                case 7:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                    break;
                default: // = else
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
     static int showMenu() {
        System.out.println("\n--- Menu chương trình quản lý sinh viên ---");
        System.out.println("1. Nhập vào N sinh viên");
        System.out.println("2. Hiển thị thông tin tất cả các sinh viên");
        System.out.println("3. Hiển thị sinh viên có điểm trung bình cao nhất và thấp nhất");
        System.out.println("4. Tìm kiếm sinh viên theo mã sinh viên");
        System.out.println("5. Hiển thị tất cả sinh viên theo thứ tự bảng chữ cái (A-Z)");
        System.out.println("6. Hiển thị tất cả sinh viên được học bổng và sắp xếp theo thứ tự điểm từ cao xuống thấp");
        System.out.println("7. Thoát");
        System.out.print("Lựa chọn của bạn: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
    static void inputStudents(Scanner scanner) {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        // Khởi tạo danh sách sinh viên
        ArrayList<String> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student student = new Student("Nguyễn Văn A", "nam/nữ", "Hà Nội", "dd/mm/yyyy");
            // Nhập thông tin cho sinh viên
            student.inputInfo();
            students.add(String.valueOf(student));
        }
    }

     static void displayAllStudents(ArrayList<String> students) {
        for (String student : students) {
            System.out.println(student);
        }
    }
}


