package oop;

public class bai6 {
    private long acccountNumber;
    private String name;
    private double Balance;
    private final double RATE = 0.035;

    public bai6(long acccountNumber, String name, double balance) {
        this.acccountNumber = acccountNumber;
        this.name = name;
        this.Balance = balance;
    }

    public bai6(long acccountNumber, String name) {
        this.acccountNumber = acccountNumber;
        this.name = name;
    }
    public bai6()
    {this(999999,"",50000);}

    public long getAcccountNumber() {
        return acccountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcccountNumber(long acccountNumber) {
        if (acccountNumber >0){
        this.acccountNumber = acccountNumber;}
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        if ( balance >= 50000){
        this.Balance = balance;}
    }
    public boolean deposit(double amount){
        if (amount > 0){
            Balance =Balance + amount;
            return true;
        }
        else
            return false;
    }
    public boolean withdraw(double amount,double fee){
        double y;
        y = fee + amount;
        if (amount > 0 && y<Balance ) {

            Balance = Balance -(amount+fee);

            return true;
        }
        else
        return false;
    }
    public void addInterest(){
        Balance = Balance + Balance*RATE;
        System.out.println("Tiền lãi tạm tính :"+ Balance);
    }
    public boolean transfer(bai6 acc, double amount){
    if (amount <= this.Balance)
    {
        this.Balance = this.Balance -amount;
        acc.Balance = acc.Balance + amount;
        return true;
    }
    else
        return false;
    }
    public String toString(){
        String st;
        st = String.format("%s  %20d  %30f VNĐ" , name,acccountNumber,Balance);
        return st;
    }
}
