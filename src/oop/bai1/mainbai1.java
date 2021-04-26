package oop;

import java.util.Scanner;

public class mainbai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập X :");
        int x = sc.nextInt();
        System.out.print("Nhập Y : ");
        int y = sc.nextInt();

        bai1 toado1 = new bai1();
        toado1.setX(x);
        toado1.setY(y);

        System.out.println(toado1);
    }
}
