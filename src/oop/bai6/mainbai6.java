package oop;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class mainbai6 {
    public static void main(String[] args) {
        Locale local = new Locale("vi","vn");
        NumberFormat formatter  = NumberFormat.getCurrencyInstance(local);
        bai6 acc1  = new bai6(72354,"Ted Murphy",102.56);
        bai6 acc2 = new bai6(69713,"Jane Smith",40.00);
//        bai6 acc3 = new bai6();

//        Scanner sc= new Scanner(System.in);
//        System.out.print("Số tài khoản : ");
//        long k = sc.nextLong();
//        System.out.println("Tên khách hàng : ");
//        String t = sc.next();
//        System.out.println("Số tiền : ");
//        int v = sc.nextInt();
//
//        acc3.setAcccountNumber(k);
//        acc3.setName(t);
//        acc3.setBalance(v);

        acc1.deposit(25.85);
        acc2.deposit(500);
        acc2.transfer(acc1,100);

//        acc2.withdraw(430.75,1.5);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%s %20s %25s ", "Tên khách hàng", "Acccount", "Số tiền");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(acc1);
        System.out.println(acc2);
//        System.out.println(acc3);
        System.out.println("----------------------------------------------------------------------------------------");
//        acc2.addInterest();
    }


}
