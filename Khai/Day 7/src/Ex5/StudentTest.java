package Ex5;


public class Main {
    public static void main(String[] args) {
        Ex5.Student student = new Student("quang thành", "anh", "sơn la", "2004");
        student.inputInfo();

        System.out.println("Thông tin sinh viên:");
        student.showInfo();

        if (student.hocBongKhong()) {
            System.out.println("Sinh viên được học bổng!");
        } else {
            System.out.println("Sinh viên không được học bổng!");
        }
    }
}


