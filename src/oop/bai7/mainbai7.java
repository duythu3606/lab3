package oop;

import java.util.Scanner;

public class mainbai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhâp tâm hình tròn : ");
        String ten = sc.next();
        System.out.print("Nhập X : ");
        float x = sc.nextFloat();
        System.out.print("Nhập Y : ");
        float y = sc.nextFloat();
        Toado toado = new Toado(ten,x,y);

        System.out.print("Nhập bán kính : ");
        double bankinh = sc.nextDouble();

       Hinhtron hinhtron = new Hinhtron(toado,bankinh);
       System.out.println(hinhtron);
    }
}
