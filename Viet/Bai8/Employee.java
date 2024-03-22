package Bai8;

public class Employee extends  Person{
    private double hesoLu;

    public double getHesoLu() {
        return hesoLu;
    }

    public void setHesoLu(double hesoLu) {
        this.hesoLu = hesoLu;
    }

    public Employee(String name, String address, double hesoLu) {
        super(name, address);
        this.hesoLu = hesoLu;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hesoLu=" + hesoLu +
                '}';
    }
}
