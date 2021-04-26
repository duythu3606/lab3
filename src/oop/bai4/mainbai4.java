package oop;

import java.util.Scanner;

public class mainbai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        bai4 xe1 = new bai4("Nguyễn Thu Loan","Future Neo",100,35000000);
        bai4 xe2 = new bai4("Lê Minh Tính","Ford Ranger",3000,250000000);
        bai4 xe3 = new bai4();

        System.out.print("Nhập tên chủ xe : ");
        String ten = sc.nextLine();
        System.out.print("Nhập tên xe : ");
        String tenxe = sc.nextLine();
        System.out.print("Dung tích xe : ");
        int dungtich = sc.nextInt();
        System.out.print("Giá xe : ");
        float gia = sc.nextInt();

        xe3.setTenchuxe(ten);
        xe3.setLoaixe(tenxe);
        xe3.setDungtich(dungtich);
        xe3.setTrigia(gia);

        System.out.println(String.format("%-5s %25s %20s %10s %15s","Chủ xe","Loại xe","Dung tích","Trị Giá","Thuế"));

        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);

        sc.close();
    }
}
