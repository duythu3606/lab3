package oop;

import java.util.Scanner;

public class mainbai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập A :");
        int a = sc.nextInt();
        System.out.print("Nhập B :");
        int b = sc.nextInt();
        System.out.print("Nhập C :");
        int c = sc.nextInt();

        bai3 tamgiac1 = new bai3();

        tamgiac1.setMa(a);
        tamgiac1.setMb(b);
        tamgiac1.setMc(c);

        System.out.println(tamgiac1);
    }
}
