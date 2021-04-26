package oop;

import java.util.Scanner;

public class mainbai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bai2 sv1 = new bai2(1,"Nguyen thanh an",6.5f,6.5f);
        bai2 sv2 = new bai2(2,"le thi bong",7.5f,8.0f);
        bai2 sv3 = new bai2();

        System.out.print("Nhap ma so sinh vien : ");
        int masv = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten : ");
        String hoten = sc.nextLine();
        System.out.print("Nhap diem LT : ");
        float diemlt = sc.nextFloat();
        System.out.println("Nhap diem Th : ");
        float diemth = sc.nextFloat();

        sv3.setMaSV(masv);
        sv3.setHovaten(hoten);
        sv3.setDiemLT(diemlt);
        sv3.setDiemTH(diemth);

        System.out.println(String.format("%-5s %-30s %10s %10s %10s","masv","hoten","diemlt","diemth","diemtb"));

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        sc.close();
    }
}
