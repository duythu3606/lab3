package oop;

import java.lang.invoke.SwitchPoint;
import java.util.List;
import java.util.Scanner;

public class mainbai8 {
    public static void main(String[] args) {
        System.out.println("1. Thêm CDList.");
        System.out.println("2. Tính số lượng CD trong List.");
        System.out.println("3. Tổng giá thành.");
        System.out.println("4. Trả thông tin toàn bộ CD.");
        System.out.println("5. Giảm dần theo giá thành.");
        System.out.println("6. Tăng dần theo giá thành.");

        System.out.println("-------------------------------");
        System.out.print("Lựa chọn : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n){
            case 1 : Listbai8.add();
            break;
            case 4 :
                break;
            case 0 :
                return;
        }
    }
}
