package Bai8;

public class Student extends Person {
    private double subject1;
    private double subject2;

    public Student(String name, String address, double subject1, double subject2) {
        super(name, address);
        this.subject1 = subject1;
        this.subject2 = subject2;

    }

    public double getSubject1() {
        return subject1;
    }

    public void setSubject1(double subject1) {
        this.subject1 = subject1;
    }

    public double getSubject2() {
        return subject2;
    }

    public void setSubject2(double subject2) {
        this.subject2 = subject2;
    }

    public double getaverage() {
        return (this.subject2 + this.subject1) / 2;
    }

    @Override
    public String toString() {
        return "diem trun gbinh la" + this.getaverage()+ "\nten la" + this.getName() + "\nadress la" + this.getAddress();

    }
}
