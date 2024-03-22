package Bai3;

public class Account {
    private long stk;
    private String name;
    private double balance;
    public static final double hslx = 0.035;
    public Account(String name,long stk){
        this.name = name;
        this.stk = stk;
        this.balance = 50;
    }
    public Account (){}
    public Account(long stk,String name,double balance){
        this.stk = stk;
        this.name = name;
        this.balance = balance;
    }
    public void addMoney(double tien){
        if(tien <= 0){
            System.out.println("khong thenm dc tien dau cha");
        }else {
            this.balance += tien;

        }
    }
    public void rutTien(double tien){
        if(tien > this.balance){
            System.out.println("lam deo du tien dau bro");
        } else {
            this.balance -= tien;
        }
    }
    public void daohan(double lai){
        this.balance *= lai;
    }
    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "stk=" + stk +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
    public void chuyenkhoan(Account acc,int money){
        this.balance -= money;
        acc.setBalance(acc.getBalance()+money);
    }

}
