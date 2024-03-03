package Ex3_4;

import java.util.Scanner;

public class Student extends Person {

    private String studentId;
    private float diemTb;
    private String email;

//    public Student(String name, String gender, String location) {
//        super(name, gender, location,);
//    }

    public Student(String name, String gender, String location, String dob) {
        super(name, gender, location, dob);
        this.studentId = studentId;
        this.diemTb = diemTb;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public float getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(float diemTb) {
        this.diemTb = diemTb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputInfo() {

        //thong tin person
        Scanner sc = new Scanner(System.in);

        //nhập tên
        boolean valid1 = true;
        String name = null;
        while (valid1){
            System.out.println("Nhập tên: ");
            name = sc.nextLine();
            if (name.matches(".*[a-zA-Z].*")){
                System.out.println("Thông tin hợp lệ! ");
                valid1 = false;
            } else {
                System.out.println("Thông tin không hop lệ! Vui lòng nhập lại");
                valid1  =true;
            }
        }
        setName(name);


        // NHập giới tính
        boolean valid2 = true;
        String gender = null;
        while (valid2){
            System.out.println("Nhập giới tính: ");
            name = sc.nextLine();
            if (name.matches(".*[a-zA-Z].*")){
                System.out.println("Thông tin hợp lệ! ");
                valid2 = false;
            } else {
                System.out.println("Thông tin không hop lệ! Vui lòng nhập lại");
                valid2  =true;
            }
        }
        setGender(gender);

        //nhập địa chỉ
        System.out.println("Nhập địa chỉ: ");
        setLocation(sc.nextLine());

        //Nhập ngày sinh
        boolean valid3 = true;
        String dob = null;
        while (valid3){
            System.out.println("Nhập ngày tháng năm sinh (dd/mm/yyyy): ");
            name = sc.nextLine();
            if (name.matches("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}")){
                System.out.println("Thông tin hợp lệ! ");
                valid3 = false;
            } else {
                System.out.println("Thông tin không hop lệ! Vui lòng nhập lại");
                valid3  =true;
            }
        }
        setDob(dob);



        //THÔNG TIN STUDENT

        //nhập điểm gpa
        boolean valid4 = true;
        String scoreInput = null;
        while (valid4){
            System.out.println("nhap diem trung binh: ");
            scoreInput = sc.nextLine();
            if (scoreInput.matches("(^[0-9]{1}(\\.[0-9]{1})?)|(^10.0)$")){
                System.out.println("Thông tin hợp lệ! ");
                valid4 = false;
            } else {
                System.out.println("Thông tin không hop lệ! Vui lòng nhập lại");
                valid4  =true;
            }
        }
        setDiemTb(Float.parseFloat(scoreInput));

        //Nhập studentID
        boolean valid5 = true;
        String studentId = null;
        while (valid5){
            System.out.println("Nhập mã sinh viên (2X + BA|BI + XXXXX) : ");
            scoreInput = sc.nextLine();
            if (scoreInput.matches("^2+([a-zA-Z]{1})+[BA|BI]+([0-9]{5})$")){
                System.out.println("Thông tin hợp lệ! ");
                valid5 = false;
            } else {
                System.out.println("Thông tin không hop lệ! Vui lòng nhập lại");
                valid5  =true;
            }
        }
        setStudentId(studentId);

        //Nhập email
        boolean valid6 = true;
        String email = null;
        while (valid6){
            System.out.println("Nhập email: ");
            scoreInput = sc.nextLine();
            if (scoreInput.matches("[\\w\\.]+@[\\w\\.]+\\.\\w+")){
                System.out.println("Thông tin hợp lệ! ");
                valid6 = false;
            } else {
                System.out.println("Thông tin không hop lệ! Vui lòng nhập lại");
                valid6  =true;
            }
        }
        setEmail(email);

    }

    public void showInfo() {
        System.out.println(toString());
    }

    public boolean hocBongKhong() {
        return diemTb > 8.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", diemTb=" + diemTb +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
