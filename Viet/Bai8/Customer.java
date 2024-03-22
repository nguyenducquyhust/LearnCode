package Bai8;

public class Customer extends Person {
    private String companyname;
    private double billvalue;

    public Customer(String name, String address, String companyname, double billvalue) {
        super(name, address);
        this.companyname = companyname;
        this.billvalue = billvalue;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public double getBillvalue() {
        return billvalue;
    }

    public void setBillvalue(double billvalue) {
        this.billvalue = billvalue;
    }

    public Customer(String companyname, double billvalue) {
        this.companyname = companyname;
        this.billvalue = billvalue;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "companyname='" + companyname + '\'' +
                ", billvalue=" + billvalue +
                '}';
    }
}
